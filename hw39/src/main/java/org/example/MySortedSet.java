package org.example;

import java.util.ArrayList;
import java.util.Collections;



public class MySortedSet{
    ArrayList <Integer> sortList = new ArrayList<>();

    public void insert(int item){
        sortList.add(item);
        Collections.sort(sortList,(item1,item2) -> item1 - item2);
    }
    public void remove(int item){
        int index = sortList.indexOf(item);
        sortList.remove(index);
    }
    public int size(){
        return sortList.size();
    }


}
