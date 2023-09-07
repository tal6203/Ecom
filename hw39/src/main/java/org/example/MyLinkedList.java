package org.example;

import lombok.Getter;

public class MyLinkedList <T> {
    @Getter
    MyNode<T> root;

    public int getSize() {

        int counter = 0;

        MyNode<T> current = root;

        while (current != null ){
            counter++;
            current = current.next;
        }

        return counter;
    }

    public MyLinkedList(MyNode<T> root) {
        this.root = root;
    }
}
