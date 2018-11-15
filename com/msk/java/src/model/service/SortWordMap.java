package model.service;


import javax.swing.text.html.parser.Entity;
import java.util.Map;
import java.util.TreeMap;

public class SortWordMap {

    public static Map sort (Map <String, Integer> map){

        Map <String, Map.Entry> sortMap = new TreeMap<>();
        String temp;

        for (Map.Entry<String , Integer> entry: map.entrySet()){

            temp =((Integer.toString(entry.getValue())).concat(entry.getKey()));
            sortMap.put(temp, entry);
        }



        System.out.println(sortMap);


        return null;
    }
}
