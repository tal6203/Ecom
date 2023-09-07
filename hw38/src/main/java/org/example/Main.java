package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLimitedList <Integer> list1 = new MyLimitedList<>(4);
        MyLimitedList <Float> list2 = new MyLimitedList<>(4);
        Person person = new Person("202635421","Dani");

        ArrayList <Integer> my_list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0 ; i <= 20 ; i++){
            my_list.add(rnd.nextInt(20));
        }
        HashMap<Integer, Integer> counter_number = new HashMap<>();

        for (Integer number : my_list) {
            if (!counter_number.containsKey(number)) {
                counter_number.put(number, 0);
            }
            counter_number.replace(number, counter_number.get(number) + 1);
        }

        for (var entry: counter_number.entrySet()) {
            System.out.format("Number = %d, count = %d \n", entry.getKey(), entry.getValue());
        }

    }
    public static void copyList(MyLimitedList <? extends MyLimitedList> src,MyLimitedList <? super MyLimitedList> des){
        for (int i = 0; i < src.m_items.size(); i++){
            des.addItem(src.getItem(i));
        }
    }
}