package exercicio_3;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um usuário para busca: ");
        var busca = sc.nextLine();
        busca = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        String endereco = "https://api.github.com/users/" + busca;
        System.out.println(endereco);
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Status: " + response.statusCode());
            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado");
            }
            System.out.println("Resposta JSON: " + response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Houve um erro na consulta");
            e.getStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
