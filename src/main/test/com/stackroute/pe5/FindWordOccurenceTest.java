package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindWordOccurenceTest {
    FindWordOccurence findwordoccurence;
    @Before
    public void setup(){
        findwordoccurence=new FindWordOccurence();
    }
@Test
    public void findTheOccurence(){
  String  arr[] = {"a","b","c","d","a","c","c"};
        Map result=findwordoccurence.findTheWord(arr);

    Map<String,Boolean> map=new HashMap<>();
    map.put("a",true);
    map.put("b",false);
    map.put("c",true);
    map.put("d",false);
        assertEquals(map,result);
}
@Test
    public void findTheWord(){
    String  arr[] = {"a","b","c","d","a","c","c","a","d","b"};
    Map result=findwordoccurence.findTheWord(arr);
    Map<String,Boolean> map=new HashMap<>();
    map.put("a",true);
    map.put("b",true);
    map.put("c",true);
    map.put("d",true);
    assertEquals(map,result);

}
@Test
        public void findTheOccurenceOfWord() {
    String arr[] = {"a", "b", "c", "d", "a", "c", "c"};
    Map result = findwordoccurence.findTheWord(arr);
    Map<String,Boolean> map=new HashMap<>();
    map.put("a",true);
    map.put("b",true);
    map.put("c",true);
    map.put("d",true);
    assertNotEquals(map, result);
}
@After
    public void tearDown()
{
    findwordoccurence=null;
}
}