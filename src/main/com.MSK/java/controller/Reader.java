package controller;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static String parseFile (String source) {

        String data;
        List<String> stringList = new LinkedList<>();

        try (Scanner scanner = new Scanner(new FileReader(source))) {
            while (scanner.hasNextLine()){
                stringList.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Reader error");
            e.printStackTrace();
        }
        data = String.join(" ", stringList);
        return data;
    }


    private Reader() {
    }
}
