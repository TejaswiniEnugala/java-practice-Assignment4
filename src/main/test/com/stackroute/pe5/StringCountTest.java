package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringcount;
    @Before
    public void setup(){
        stringcount=new StringCount();
    }
    @Test
            public void checkTheFrequencyOfWordInTheGivenInput()

    {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        Map result=stringcount.checkFrequency("one one one one two three two three one");
        assertEquals(map,result);
    }
    @Test
    public void checkFrequencyOfEachWordInTheGivenString()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",3);
        map.put("two",2);
        Map result=stringcount.checkFrequency("one one one two two three");
        assertNotEquals(map,result);
    }
    @Test
    public void findFrequencyOfEachWordInTheGivenInputString()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",3);
        map.put("two",2);
        Map result=stringcount.checkFrequency("one one two one two");
        assertEquals(map,result);
    }
    @After
    public void tearDown(){
        stringcount=null;
    }

}