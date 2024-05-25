import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    public HttpResponse<String> DatosApi(String url) {
//        Direccion a la api
        URI direccion = URI.create(url);
//        Creando cliente http
        HttpClient client = HttpClient.newHttpClient();
//        Creando el http Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
//        Creando el http Response
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        }catch (IOException|InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
