package model.service;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseByReg {

    public static List<String> parse (String data, String regex){
        List <String> stringList = new LinkedList<>();
        Matcher matcher;
        matcher = Pattern.compile(regex).matcher(data);
        while (matcher.find()){
            stringList.add(data.substring(matcher.start(), matcher.end()));
        }
        return stringList;
    }

    private ParseByReg() {
    }
}
