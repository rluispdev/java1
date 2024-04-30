package pratic13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main13 {
    public static void main(String[] args) {

        String jsonperson= "{\"name\":\"Rodrigo\"," +
                "\"age\":20,\"" +
                "city\":\"Brasília\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Person person = gson.fromJson(jsonperson,Person.class);
        System.out.println( person);

    }
}
