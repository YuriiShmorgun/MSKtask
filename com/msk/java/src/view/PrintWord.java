package view;

import java.util.Map;

public class PrintWord {

    public static void printWordMap (Map <String, String> map){
        map.forEach((k, v) -> System.out.println(" Value: " + v));
    }
}
