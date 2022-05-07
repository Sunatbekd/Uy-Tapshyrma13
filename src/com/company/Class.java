package com.company;

import java.util.Random;

public class Class {
    int number;
    String word;
    int[] array;
    public Class  (int number,String word,int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        this.array = array;
        this.number = number;
        this.word = word;
    }
    int getNumber(){
        return number;
    }
    String getWord(){
        return word;
    }

    int[] getArray(){
        return array;
    }
}
