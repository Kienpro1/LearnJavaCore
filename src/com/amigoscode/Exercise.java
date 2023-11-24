package com.amigoscode;
public class Exercise {
    public static double yields(double rent ,double property){
        return ((rent*12)/property)*100;
    }

    public static void main(String[] args) {
        System.out.println(yields(1040,100000)+"%");
    }
}
