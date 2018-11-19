package model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CounterWord {


    public Map count (List<String> stringList){
        Map<String, Integer> stringMap = stringList.stream().collect(HashMap::new, (map, word) -> {
            if(map.containsKey(word))
                map.put(word, map.get(word) + 1);
            else
                map.put(word, 1);
        }, HashMap::putAll);
        return stringMap;
    }

    protected CounterWord(){
    }

    public static CounterWord newInstance(){
        return new CounterWord();
    }


}
