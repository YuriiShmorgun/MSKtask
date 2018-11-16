package model.service;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortWordMap {

    public static Map sort (Map <String, Integer> map){

        Map <String, String> sortMap = new TreeMap<>(Comparator.naturalOrder() );
        String temp;
        String temp2;
        for (Map.Entry<String , Integer> entry: map.entrySet()){
            temp =((Integer.toString(Integer.MAX_VALUE - entry.getValue())).concat(entry.getKey()));
            temp2 = (entry.getKey() + " = " + (entry.getValue()));
            sortMap.put(temp, temp2);
        }
        return sortMap;
    }

    private SortWordMap() {
    }
}
