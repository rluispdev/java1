package Pratic15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrintText {
    public static void main(String[] args) throws IOException {

        String message = "Conteúdo a ser gravado no arquivo.";

        FileWriter writer = new FileWriter("content.txt");
        writer.write(message);
        writer.close();
    }
}
