package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MyLinkedList <Integer> linkedList = new MyLinkedList<>(new MyNode<>(1));
        linkedList.root.insert(new MyNode<>(4));
        linkedList.root.insert(new MyNode<>(3));
        linkedList.root.insert(new MyNode<>(2));


        printLinkedList(linkedList);
        reverseLinkedList(linkedList);
        printLinkedList(linkedList);
    }
    public static void printLinkedList(MyLinkedList linkedList) {
        MyNode temp = linkedList.root;
        while (linkedList.root != null) {
            System.out.print(linkedList.root.data + " ");
            linkedList.root = linkedList.root.next;
        }
        System.out.println();
        linkedList.root = temp;
    }
    public static void reverseLinkedList(MyLinkedList linkedList) {
        MyNode previous = null;
        MyNode current = linkedList.root;
        MyNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.root = previous;
    }
}