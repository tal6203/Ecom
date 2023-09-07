import org.example.MyLimitedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {
@org.junit.jupiter.api.Test
    void test1(){
    MyLimitedList<Integer> list1 = new MyLimitedList<>(4);
    list1.addItem(1);

    int expected = 1;
    int actual = list1.getItem(0);

    Assertions.assertEquals(expected, actual);
}
@Test
    void test2(){
    MyLimitedList<Integer> list1 = new MyLimitedList<>(4);
    list1.addItem(1);
    list1.addItem(2);
    list1.addItem(3);
    list1.addItem(4);
    list1.addItem(5);

    int expected = 2;
    int actual = list1.getItem(0);

    Assertions.assertEquals(expected, actual);
}
@Test
    void test3(){
    MyLimitedList<Integer> list1 = new MyLimitedList<>(4);
    list1.addItem(1);
    list1.addItem(2);
    list1.addItem(3);
    list1.addItem(4);
    list1.removeFirstItem();

    int expected = 2;
    int actual = list1.getItem(0);

    Assertions.assertEquals(expected, actual);
}
}
