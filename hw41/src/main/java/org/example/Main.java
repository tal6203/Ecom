package org.example;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class Main {
//    private static volatile int i = 0;
//   private static volatile int [] arr = new int[100];

    static Random random = new Random();

    private static void runGameWithPolice() {

        GameManager game = new GameManager();

        ThiefThread thiefThreadFirst = new ThiefThread("thief one", game);
        ThiefThread thiefThreadSecond = new ThiefThread("thief two", game);

        thiefThreadFirst.start();
        thiefThreadSecond.start();

        Thread.yield();

        while (!game.isGameOver()) {

            int next_random_number = random.nextInt(100 + 1);
            System.out.println("* Police got to this number " + next_random_number);

            if (thiefThreadFirst.isAlive()) {
                thiefThreadFirst.policeGotToThisNumber(next_random_number);
            }
            if (thiefThreadSecond.isAlive()) {
                thiefThreadSecond.policeGotToThisNumber(next_random_number);
            }
            try {
                Thread.sleep(random.nextInt(GameManager.WAITING_TIME));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static AtomicInteger i = new AtomicInteger(0);
    private static AtomicIntegerArray arr = new AtomicIntegerArray(100);
//     private static  ConcurrentHashMap<Integer,Integer> hashMap = new  ConcurrentHashMap<>(100);

    private static synchronized int inc(){
//        return i++;
        return i.getAndIncrement();
   }
    private static void randomNumber(){
        Random rnd = new Random();
       int i = inc();
        while (i < arr.length()){
            arr.getAndSet(i, rnd.nextInt(100) + 1);
            i = inc();
        }
       for (int j = 0 ; j < arr.length() ; j++){
            System.out.println(arr.get(j));
        }


    }




    public static void main(String[] args) {
        for (int j = 0 ; j < arr.length() ; j++) {
            arr.getAndSet(j,0);
        }

        Thread thread1 = new Thread(Main::randomNumber);
        Thread thread2 = new Thread(Main::randomNumber);
        Thread thread3 = new Thread(Main::randomNumber);
        Thread thread4 = new Thread(Main::randomNumber);
        Thread thread5 = new Thread(Main::randomNumber);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    int [] ints = new int[100];
    PopulateThread populateThread = new PopulateThread("my_thread",ints);

Customer c1 = new Customer("111","dani","Tel-Aviv",gender.Male,20);
Customer c2 = new Customer("222","Sara","Holon", gender.Female,30);
Customer c3 = new Customer("222","Tal","Holon", gender.Male,31);
Customer c4 = new Customer("333","Aron","Ashdod", gender.Male,9);
Customer c5 = new Customer("444","Eran","Afula",gender.Male,18);
Customer c6 = new Customer("555","Noy","Holon", gender.Female,17);
Customer c7 = new Customer("666","Eden","Rishon-Lezion",gender.Female,32);
Customer c8 = new Customer("777","Ron","Holon",gender.Male,22);
Customer c9 = new Customer("888","Alon","Tel-Aviv",gender.Male,25);
Customer c10 = new Customer("999","Mai","Ashdod",gender.Female,33);
Customer c11 = new Customer("2525","Sima","Holon",gender.Female,23);
Customer c12 = new Customer("2424","Omer","Rishon-Lezion",gender.Male,26);

ArrayList <Customer> customerArrayList = new ArrayList<>();
customerArrayList.add(c1);
customerArrayList.add(c2);
customerArrayList.add(c3);
customerArrayList.add(c4);
customerArrayList.add(c5);
customerArrayList.add(c6);
customerArrayList.add(c7);
customerArrayList.add(c8);
customerArrayList.add(c9);
customerArrayList.add(c10);
customerArrayList.add(c11);
customerArrayList.add(c12);

customerArrayList.stream().filter(x -> x.gender.equals(gender.Female)).forEach(x -> System.out.println(x.toString()));
        System.out.println("==========================");
customerArrayList.stream().filter(x -> x.gender.equals(gender.Male)).forEach(x -> System.out.println(x.toString()));
        System.out.println("==========================");
        System.out.println(customerArrayList.stream().filter(x -> x.gender.equals(gender.Male)).count());
        System.out.println("==========================");
        customerArrayList.stream().map(x -> x.city).distinct().forEach(x -> System.out.println(x.toString()));
        System.out.println("==========================");
        System.out.println(customerArrayList.stream().max((x,y) -> x.number_of_purchases - y.number_of_purchases));
        System.out.println("==========================");
        System.out.println(customerArrayList.stream().min((x,y) -> x.number_of_purchases - y.number_of_purchases));
        System.out.println("==========================");
        System.out.println(customerArrayList.stream().filter(x -> x.city.equals("Holon")).max((x,y) -> x.number_of_purchases - y.number_of_purchases));
        System.out.println("==========================");
        customerArrayList.stream().forEach(customer -> System.out.println(customer.toString()));

        HashMap<String,Customer> customerHashMap = new HashMap<>();
        customerHashMap.put(c1.id,c1);
        customerHashMap.put(c2.id,c2);
        customerHashMap.put(c3.id,c3);
        customerHashMap.put(c4.id,c4);
        customerHashMap.put(c5.id,c5);
        customerHashMap.put(c6.id,c6);
        customerHashMap.put(c7.id,c7);
        customerHashMap.put(c8.id,c8);
        customerHashMap.put(c9.id,c9);
        customerHashMap.put(c10.id,c10);
        customerHashMap.put(c11.id,c11);
        customerHashMap.put(c12.id,c12);

        System.out.println("==========================");

        int [] arr = {2,7,11,15,};
        HashMap <String,Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < arr.length -1 ; i++){
            String key =String.format("%d + %d",arr[i],arr[i+1]);
            hashMap.put(key , arr[i] + arr[i + 1]);
        }
        hashMap.forEach((key,value) -> System.out.format("%s = %d \n",key,value));


        (new Thread(Main::runGameWithPolice)).start();




    }
}