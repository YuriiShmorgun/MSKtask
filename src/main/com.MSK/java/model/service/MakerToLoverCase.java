package model.service;

import java.util.LinkedList;
import java.util.List;

public class MakerToLoverCase {

    public List lover (List<String> list){
        List<String> stringList = new LinkedList<>();
        list.forEach((l) -> stringList.add(l.toLowerCase()));
        return stringList;
    }

    protected MakerToLoverCase() {
    }

    public static MakerToLoverCase newInstance(){
        return new MakerToLoverCase();
    }
}
