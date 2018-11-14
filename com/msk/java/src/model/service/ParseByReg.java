package model.service;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseByReg implements IService{

    private List <String> stringList = new LinkedList<>();
    private Matcher matcher;

    public List<String> parse (String data, String regex){
         matcher = Pattern.compile(regex).matcher(data);
         while (matcher.find()){
             stringList.add(data.substring(matcher.start(), matcher.end()));
         }
         return stringList;
    }
}
