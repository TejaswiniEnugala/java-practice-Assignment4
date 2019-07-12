package com.stackroute.pe5;//program to sort the names in ascending order

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class NamesInAscendingOrder {
    public static ArrayList<String> sortInAscendingOrder(List<String> string){
        if(string.size()>0) {
            TreeSet<String> treeSets = new TreeSet<>();
            treeSets.addAll(string);
            ArrayList<String> result = new ArrayList<>(treeSets);
            return result;
        }
        else {
            return null;
        }
    }
}
