package com.stackroute.pe5;//program to pass the value of a key to its next key

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PassValueToNextKey {
    public static HashMap<String, String> keyValue(HashMap<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            return null;
        } else {
            Iterator<Map.Entry<String, String>> itr = hashMap.entrySet().iterator();
            String str = "";
            if (!hashMap.get("val1").equals(" ")) {
                str = hashMap.get("val1");
                hashMap.put("val1", " ");
            }
            hashMap.put("val2", str);
        }
        return hashMap;
    }
}
