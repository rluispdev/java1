package pratic13.Editora;

import com.google.gson.Gson;

public class ConvertJSONAlignedForObject {
    public static void main(String[] args) {
        String jsonBook = "{\"title\":\"Aventuras do Java\"," +
                           "\"author\":\"Akemi\"," +
                           "\"editor\":{\"name\":\"TechBooks\",\"city\":\"São Paulo\"}" +
                           "}";

        Gson gson = new Gson();
        Book book = gson.fromJson(jsonBook, Book.class);

        System.out.println(book);
    }
}
