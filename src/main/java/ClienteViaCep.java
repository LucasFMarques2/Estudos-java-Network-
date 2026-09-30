import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteViaCep {
    public String retornaCliente() throws Exception {
        URI url = new URI("https://viacep.com.br/ws/01001000/json/");
        String mensagem;

        try (HttpClient httpClient = HttpClient.newHttpClient()) {
            HttpRequest httpRequest = HttpRequest.newBuilder(url).build();
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            int statusCode = httpResponse.statusCode();
            String body = httpResponse.body();


            if (statusCode != 200) {
                mensagem = ("Erro de requicao, status:" + statusCode);
            } else {
                mensagem = ("Status da requisicao: " + statusCode + "\n" + body);
            }

            return mensagem;
        }
    }
}
