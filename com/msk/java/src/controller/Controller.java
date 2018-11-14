package controller;

import model.service.IService;
import model.service.ParseByReg;
import model.service.factory.ParseByRegFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Controller {

    public static void main(String[] args) {

        Properties confProperties = LoadProperty.getInstance("resource/conf.properties");
        Properties regexProperties = LoadProperty.getInstance("resource/regex.properties");

        System.out.println(Reader.parseFile(confProperties.getProperty("first.task")));

        ParseByRegFactory parseByRegFactory = new ParseByRegFactory();
        IService parseByReg = parseByRegFactory.createService();

        List<String> stringList = parseByReg.parse(Reader.parseFile(confProperties.getProperty("first.task")),
                                          regexProperties.getProperty("reg.room"));

        System.out.println(stringList);

        for (String temp: stringList){

        }
    }
}
