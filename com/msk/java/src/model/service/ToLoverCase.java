package model.service;

import java.util.LinkedList;
import java.util.List;

public class ToLoverCase {
    public static List lover (List<String> list){
        List<String> stringList = new LinkedList<>();
        list.forEach( (l) -> stringList.add(l.toLowerCase()));
        return stringList;
    }

    private ToLoverCase() {
    }
}
