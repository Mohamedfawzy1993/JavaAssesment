package com.java.assesement.stringparse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mohamed fawzy
 */
public class Parser {

    public static Map<String, String> parseString(String data){
        String anchor = "@745edae5[";
        Integer startIndex = data.indexOf(anchor)+anchor.length()-1;
        String exactString = data.substring(startIndex);
        Integer endIndex = exactString.indexOf("]")+1;
        exactString = exactString.substring(1, endIndex);
        String[] splitedString = exactString.split(",");

        Map<String, String> keyValuePair = new HashMap<>();
        for(String split : splitedString){
            String[] keyValue = split.trim().split("=");
            if(keyValue.length > 1){
                keyValuePair.put(keyValue[0], keyValue[1]);
            } else {
                keyValuePair.put(keyValue[0], "");
            }
        }
        return keyValuePair;
    }
}
