package pratic12;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome da receita:");
        var recipe = read.nextLine();

        var recipeSearch = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + recipe;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(recipeSearch))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
