import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GeradorItensJson {
    static void main() throws IOException {
        Database database = new Database();
        List<ItemCardapio> listaDeItens = database.ListaDeItensCardapio();

        Gson gson = new Gson();
        String json = gson.toJson(listaDeItens);

        Path path = Path.of("itensCardapio.json");

        Files.writeString(path, json);
    }
}
