package controller;

import model.entity.Room;
import model.service.IService;
import model.service.ParseByReg;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class Controller {

    public static void main(String[] args) {


        //task1

        Properties confProperties = LoadProperty.getInstance("resource/conf.properties");
        Properties regexProperties = LoadProperty.getInstance("resource/regex.properties");

        System.out.println(Reader.parseFile(confProperties.getProperty("first.task")));//todo Delete



        List<String> stringList = ParseByReg.parse(Reader.parseFile(confProperties.getProperty("first.task")),
                                          regexProperties.getProperty("reg.room"));

        System.out.println(stringList); //todo Delete
        System.out.println(stringList.size());

       for (int i = 0; i<stringList.size(); i++){
            System.out.println(stringList.get(i));
           System.out.println(ParseByReg.parse(stringList.get(i), regexProperties.getProperty("reg.argument")));
           System.out.println(ParseByReg.parse(stringList.get(i), regexProperties.getProperty("reg.argument")).size());

           List<String> tempList= ParseByReg.parse(stringList.get(i), regexProperties.getProperty("reg.argument"));
           List<Room> roomList = new LinkedList<>();
           roomList.add(Room.builder().length(Integer.parseInt(tempList.get(0)))
                   .width(Integer.parseInt(tempList.get(1)))
                   .height(Integer.parseInt(tempList.get(2)))
                   .build());
        }
    }
}
