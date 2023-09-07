package org.example;

import lombok.Getter;
import lombok.Setter;

public class MyNode <T>{
    T data;

    @Getter
    @Setter
    MyNode<T> next;

    public MyNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public MyNode<T> getNext() {
        return this.next;
    }

    public void insert(MyNode<T> node) {
        node.next = this.next;
        this.next = node;
    }


    public void removeNext() {
        this.next = this.next.next;
        this.next.next.next = this.next;
    }
}
