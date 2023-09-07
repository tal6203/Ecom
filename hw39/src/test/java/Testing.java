import org.example.Main;
import org.example.MyLinkedList;
import org.example.MyNode;
import org.example.MySet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
@Test
    void test1(){
    MyLinkedList<Integer> linkedList = new MyLinkedList<>(new MyNode<>(1));
    linkedList.getRoot().insert(new MyNode<>(4));
    linkedList.getRoot().insert(new MyNode<>(3));
    linkedList.getRoot().insert(new MyNode<>(2));
    Main.reverseLinkedList(linkedList);

    int expected = 4;
    int actual = linkedList.getRoot().getData();

    Assertions.assertEquals(expected,actual);
}
@Test
void test2(){
    MySet <Integer> set = new MySet<>();
    set.insert(1);
    set.insert(2);
    set.insert(3);
    set.insert(1);

    int expected = 3;
    int actual = set.size();

    Assertions.assertEquals(expected,actual);
}
}
