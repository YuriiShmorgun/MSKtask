package controller;


import model.entity.Room;
import model.service.CounterWord;
import model.service.ParserByReg;
import model.service.SorterWordMap;
import model.service.MakerToLoverCase;
import view.PrintRoom;
import view.PrintWord;

import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class Controller {



    public static void main(String[] args) {





        Properties confProperties = LoadProperty.getInstance("src/main/com.MSK/resources/conf.properties");
        Properties regexProperties = LoadProperty.getInstance("src/main/com.MSK/resources/regex.properties");

        //task1    src/main/com.MSK/resources/conf.properties

        ParserByReg parserByReg = ParserByReg.newInstance();
        List<Room> roomList = new LinkedList<>();
        List<String> stringList = parserByReg.parse(Reader.parseFile(confProperties.getProperty("first.task")),
                                          regexProperties.getProperty("reg.room"));

        for (String aStringList : stringList) {
            List<String> tempList = parserByReg.parse(aStringList, regexProperties.getProperty("reg.argument"));
            roomList.add(Room.builder().length(Integer.parseInt(tempList.get(0)))
                    .width(Integer.parseInt(tempList.get(1)))
                    .height(Integer.parseInt(tempList.get(2)))
                    .build());
        }
        PrintRoom.printRoom(roomList);

        //task2
        List<String> wordList = ParserByReg.newInstance().parse(Reader.parseFile(confProperties.getProperty("second.task")),
                                            regexProperties.getProperty("reg.word"));



        PrintWord.printWordMap(SorterWordMap.sort(CounterWord.newInstance()
                .count(MakerToLoverCase.newInstance()
                        .lover(wordList))));


    }
}
