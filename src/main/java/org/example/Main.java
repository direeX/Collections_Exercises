package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("yellow");
        list.add("white");
        list.add("red");
        list(list, 1);



    }
    /*
    4. Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    static String list(List <String> list, int index){

        String element = list.get(index);
        System.out.println(element);
        return  element;

    }


        /*
    3. Write a Java program to insert an element into the array list at the first position.
    static void insertList(List<String> list, String element) {
        list.add(element);
    }
     */



    /*
    1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
    static void arrayColors(){
        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("yellow");
        list.add("white");
        list.add("red");
        System.out.println(list);
    }
     */

    /*
    2. Write a Java program to iterate through all elements in an array list.
    static void iterateList(List<String> list){
        for (String el: list) {
            System.out.println(el);
       }
    }
     */


}