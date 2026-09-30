import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServidorItemCardapioSocket {
    static void main() throws Exception{
       try(ServerSocket serverSocket = new ServerSocket(8000)){
           System.out.print("Subiu o servidor socket");

           try(Socket clientSocket = serverSocket.accept()){
               InputStream clientIS = clientSocket.getInputStream();
               StringBuilder requestBuilder = new StringBuilder();

               int data;

               do {
                data = clientIS.read();
                requestBuilder.append((char) data);

               } while (clientIS.available() > 0);

               String request = requestBuilder.toString();
               System.out.print(request);

               Path path = Path.of("itensCardapio.json");
               String json = Files.readString(path);

               OutputStream clientOS = clientSocket.getOutputStream();
               PrintStream clientOut = new PrintStream(clientOS);

               clientOut.println("HTTP/1.1 200 OK");
               clientOut.println("Content-Type: application/json; charset=UTF-8");
               clientOut.println();
               clientOut.println(json);
           }
       }
    }
}
