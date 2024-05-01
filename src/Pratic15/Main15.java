package Pratic15;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main15 {
    public static void main(String[] args) throws IOException {
        var movie =  new Title("Pokemón", 2007);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter writer = new FileWriter("movie.json");
        writer.write(gson.toJson(movie));
        writer.close();

    }
}
