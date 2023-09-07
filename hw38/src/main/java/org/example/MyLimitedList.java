package org.example;

import java.util.ArrayList;

public class MyLimitedList <T> implements IMyLimitedList{
    protected ArrayList <T> m_items = new ArrayList<>();
    protected final int m_max_items;

    public MyLimitedList(int m_max_items) {
        this.m_max_items = m_max_items;
    }

    public void addItem(Object item){
        if (m_items.size() == m_max_items){
            m_items.remove(0);
        }
        m_items.add((T) item);
    }

    public T getItem(int index){
        return m_items.get(index);
    }

    public void removeFirstItem(){
        m_items.remove(0);
    }

}
