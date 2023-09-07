package com.forest;

import com.creatures.Bear;
import com.creatures.Monkey;
import com.creatures.Tiger;

import java.util.Date;

public class Main {
    public static void checkTeacher(Teacher teacher){
        if (teacher instanceof HistoryTeacher){
            System.out.format("The teacher is history teacher,the field_of_profession is: %s",((HistoryTeacher)teacher).field_of_profession);
        }
        else {
            System.out.format("The teacher is math teacher, the math skills is: %d",((MathTeacher)teacher).math_skills);
        }
    }
    public static void main(String[] args) {
        Bear bear = new Bear("bear","eat fish");
        Tiger tiger = new Tiger("tiger","awwwwwwwwww");
        Monkey monkey = new Monkey("monkey","wowowow");


        Drone drone = new Drone("sony",250,30,new Date(),"150");
        drone.takeOff();

        Teacher mathTeacher = new MathTeacher("math",1,56);
        Teacher historyTeacher = new HistoryTeacher("history",2,"professional");

        DaniWay daniWay = new DaniWay();
        MosheWay mosheWay = new MosheWay();
        ItzikWay itzikWay = new ItzikWay();
        AnatWay anatWay = new AnatWay();

        daniWay.RunningBarbecue();
        System.out.println("=====================");
        mosheWay.RunningBarbecue();
        System.out.println("=====================");
        itzikWay.RunningBarbecue();
        System.out.println("=====================");
        anatWay.RunningBarbecue();




    }
}