package com.stackroute.pe5;//program to find frequency of each word in an input and return true if the frequency of word is greater than or equal to 2
import java.util.*;

public class FindWordOccurence {
    public Map findTheWord(String[] input) {
        Map<String, Integer> map = new HashMap<>();
        if (input == null) {         //checks if the input is null
            map=null;
        }
        for (String each : input) {         //finds the frequency of each word
            if (map.containsKey(each)) {

                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        Map<String, Boolean> list = new HashMap<>();
        for(String each:input)               //returns true if a word has frequency greater than or equal to 2
        {
            if(map.get(each)>=2)
            {
                list.put(each,true);
            }
            else
            {
                list.put(each,false);          // returns false if a word has frequency less than 2
            }
        }
        return list;
    }
}
