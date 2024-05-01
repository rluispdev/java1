package Pratic15.Car;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Vehicle> cars = new ArrayList<>();

        var car = new Vehicle("Uno", "Fiat", 2009);
        cars.add(car);
        var car2 = new Vehicle("Fusca", "Wolkswagen", 1998);
        cars.add(car2);
        var car3 = new Vehicle("Montana", "Chevrolet", 2009);
        cars.add(car3);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter writer = new FileWriter("cars.json");
        writer.write(gson.toJson(cars));
        writer.close();
    }
}
