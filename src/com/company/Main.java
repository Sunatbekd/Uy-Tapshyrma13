package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class class1 = new Class(10,"Array", new int[10]);
        System.out.println("Number: "+class1.getNumber());
        System.out.println("Word: "+class1.getWord());
        System.out.println("This is Array: "+ Arrays.toString(class1.getArray()));
    }
}
