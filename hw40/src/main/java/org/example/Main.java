package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("054-2234587","Galaxy","S22",222f);
        MobilePhone phone2 = new MobilePhone("054-2234587","Galaxy","S22",222f);
        MobilePhone phone3 = new MobilePhone("058-2782347","Iphone","12",128f);
        MobilePhone phone4 = new MobilePhone("050-8443787","Galaxy","S24",64f);
        MobilePhone phone5 = new MobilePhone("052-5432168","Iphone","14",64f);

        System.out.println(phone1.hashCode());
        System.out.println(phone2.hashCode());

        System.out.println(phone1.equals(phone2));

        HashMap <String,MobilePhone> hashMap1 = new HashMap<>();

        hashMap1.put(phone1.phone_number,phone1);
        hashMap1.put(phone2.phone_number,phone2);
        hashMap1.put(phone3.phone_number,phone3);
        hashMap1.put(phone4.phone_number,phone4);
        hashMap1.put(phone5.phone_number,phone5);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a phone number:");
        String phone_number_from_user = scanner1.next();

        if (hashMap1.containsKey(phone_number_from_user)){
            System.out.println(hashMap1.get(phone_number_from_user).toString());
        }
        else {
            System.out.println("Not Exist");
        }

        ArrayList <MobilePhone> arrayList_mobilePhone = new ArrayList<>();
        arrayList_mobilePhone.add(phone1);
        arrayList_mobilePhone.add(phone2);
        arrayList_mobilePhone.add(phone3);
        arrayList_mobilePhone.add(phone4);
        arrayList_mobilePhone.add(phone5);

        HashMap <String, ArrayList<MobilePhone>> hashMap2 = new HashMap<>();
        hashMap2.put(phone1.model,arrayList_mobilePhone);
        hashMap2.put(phone2.model,arrayList_mobilePhone);
        hashMap2.put(phone3.model,arrayList_mobilePhone);
        hashMap2.put(phone4.model,arrayList_mobilePhone);
        hashMap2.put(phone5.model,arrayList_mobilePhone);


        System.out.println("Enter a model:");
        String model_from_user = scanner1.next();

        if (hashMap2.containsKey(model_from_user)){
            Stream<MobilePhone> phone_model = hashMap2.get(model_from_user).stream().filter(x -> x.model.equals(model_from_user));
            for (var phone:phone_model.toArray()) {
                System.out.println(phone);
            }
        }
        else {
            System.out.println("Not Exist");
        }

        HashMap <Float, ArrayList<MobilePhone>> hashMap3 = new HashMap<>();
        hashMap3.put(phone1.size,arrayList_mobilePhone);
        hashMap3.put(phone2.size,arrayList_mobilePhone);
        hashMap3.put(phone3.size,arrayList_mobilePhone);
        hashMap3.put(phone4.size,arrayList_mobilePhone);
        hashMap3.put(phone5.size,arrayList_mobilePhone);


        System.out.println("Enter a size:");
        Float size_from_user = scanner1.nextFloat();

        if (hashMap3.containsKey(size_from_user)){
            Stream<MobilePhone> phone_Size = hashMap3.get(size_from_user).stream().filter(x -> x.size.equals(size_from_user));
            for (var phone:phone_Size.toArray()) {
                System.out.println(phone);
            }
        }
        else {
            System.out.println("Not Exist");
        }


    }
}