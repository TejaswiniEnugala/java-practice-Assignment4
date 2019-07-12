package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateArrayElementsTest {
    UpdateArrayElements updateArrayElements;
    @Before
    public void setUp()
    {
        updateArrayElements=new UpdateArrayElements();
    }
    @Test
    public void givenArrayListReturnsTheListWithReplacedArrayElements(){
        List<String> set=new ArrayList<>();
        set.add("Bindu");
        set.add("Spoorthi");
        set.add("Teju");
        set.add("Mounika");
        int[] position={0,2};
        String[] replace = {"mani","suma"};
        List<String> result=  updateArrayElements.replacesArrayElements(set,position,replace);
        List<String> output=new ArrayList<>();
        output.add("mani");
        output.add("Spoorthi");
        output.add("suma");
        output.add("Mounika");
        assertEquals(output,result);
    }
    @Test
    public void givenArrayListReturnsEmptyList(){
        List<String> set=new ArrayList<>();
        set.add("Bindu");
        set.add("Spoorthi");
        set.add("Teju");
        set.add("Mounika");
        List<String> result=updateArrayElements.clearsTheArrayList(set);
        List<String> expected=new ArrayList<>();
        assertEquals(expected,result);

    }
    @After
    public void tearDown(){
        updateArrayElements=null;
    }


}