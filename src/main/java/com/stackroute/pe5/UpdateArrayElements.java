package com.stackroute.pe5;//program to update array elements and finally clear the elements

import java.util.List;

public class UpdateArrayElements {
    public static List<String> replacesArrayElements(List<String> list, int[] index, String[] replace) {
        for (int i = 0; i < index.length; i++) {
            list.set(index[i], replace[i]);      //updates the values
        }
        return list;
    }
    public static List<String> clearsTheArrayList(List<String> list) {

        list.clear();                // clears the list
        return list;
    }
}
