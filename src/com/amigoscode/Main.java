    package com.amigoscode;

    public class Main {
    private static double calcYield(double monthlyRent,double Original){
        return ((monthlyRent*12)/Original)*100;
    }



    public static void main(String[] args){
        System.out.println("Rental yield:"+calcYield(1000,100000)+"%");
    }
    }