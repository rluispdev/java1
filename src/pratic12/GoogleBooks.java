package pratic12;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite o nome do livro que você deseja: ");
        var myBook = read.nextLine();
        System.out.println("Digite o nome do autor(a)");
        String bookAuthor = read.nextLine();

        String apiURL = "";

        try{
            String encodedMyBook = URLEncoder.encode(myBook, "UTF-8");
            String encodedAuthor = URLEncoder.encode(bookAuthor, "UTF-8");

            apiURL= "https://www.googleapis.com/books/v1/volumes?q=intitle:" + encodedMyBook + "inauthor:" + encodedAuthor + "&key=AIzaSyAnxyDJZmZAFCQHuCVNLC0tARz-q6jyfsQ";

            System.out.println(apiURL);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiURL))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

}
