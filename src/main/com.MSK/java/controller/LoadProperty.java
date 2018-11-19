package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty{
    public static Properties getInstance(String properties){

        Properties instance = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(properties)){
            instance.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instance;
    }

    private LoadProperty() {
    }
}
