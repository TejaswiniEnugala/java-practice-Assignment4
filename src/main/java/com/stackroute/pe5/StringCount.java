package com.stackroute.pe5;//program to find frequency of each word in the input

import java.util.*;

public class StringCount {
  public Map checkFrequency(String input)
  {
      List<String> listitems= Arrays.asList(input.split(" "));
      Map<String,Integer> map=new HashMap<>();
      if(listitems==null)
      {
          map=null;
      }
      for(String each:listitems)
      {
          if(map.containsKey(each)) {

              map.replace(each, map.get(each)+1);
          }
          else
          {
              map.put(each,1);
          }
      }
      return map;

  }
}
