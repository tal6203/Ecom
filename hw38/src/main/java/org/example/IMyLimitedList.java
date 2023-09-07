package org.example;

public interface IMyLimitedList <T>{
    void addItem(T item);
    T getItem(int index);
    void removeFirstItem();
}
