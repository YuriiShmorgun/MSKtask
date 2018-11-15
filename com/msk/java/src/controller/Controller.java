package controller;

import model.entity.Room;

import model.service.ParseByReg;
import view.PrintRoom;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class Controller {

    public static void main(String[] args) {


        Properties confProperties = LoadProperty.getInstance("resource/conf.properties");
        Properties regexProperties = LoadProperty.getInstance("resource/regex.properties");

        //task1
        List<Room> roomList = new LinkedList<>();
        List<String> stringList = ParseByReg.parse(Reader.parseFile(confProperties.getProperty("first.task")),
                                          regexProperties.getProperty("reg.room"));

        for (int i = 0; i<stringList.size(); i++){
           List<String> tempList= ParseByReg.parse(stringList.get(i), regexProperties.getProperty("reg.argument"));
           roomList.add(Room.builder().length(Integer.parseInt(tempList.get(0)))
                   .width(Integer.parseInt(tempList.get(1)))
                   .height(Integer.parseInt(tempList.get(2)))
                   .build());
        }
        PrintRoom.printRoom(roomList);

        //task2
        List<String> wordList = ParseByReg.parse(Reader.parseFile(confProperties.getProperty("second.task")),
                                            regexProperties.getProperty("reg.word"));
        System.out.println(wordList);

    }
}
