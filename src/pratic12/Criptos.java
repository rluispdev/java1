package pratic12;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Criptos {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new  Scanner(System.in);
        System.out.println("Digite o nome de uma moeda:");
        var myCoin = read.nextLine();

        var coin = "https://api.coingecko.com/api/v3/simple/price?ids=" + myCoin + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(coin))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());





    }

}
