package com.amigoscode;

import java.util.Arrays;

public class Exercise {


    public static void main(String[] args) {
        //*Primitive
        //byte
        byte a=1;
        System.out.println(a);
        //short
        short b=2;
        System.out.println(b);
        //int
        int c =3;
        System.out.println(c);
        //long
        long d=4;
        System.out.println(d);
        //float
        float e=5;
        System.out.println(e);
        //double
        double  f=6.545;
        System.out.println(f);
        //addition
        double g = a+b;
        System.out.println(g);
        //abstraction
        double h =d-c;
        System.out.println(h);
        //multipy
        double i =d*e;
        System.out.println(i);
        //division
        double j=e/6.545;
        System.out.println(j);
        //a++
        int k =a++;
        System.out.println(k);
        //++a
        int l =++a;
        System.out.println(l);
        //Comparision operator
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //Shorthand assignment operators
        System.out.println("a+=b ="+ (a+=b));
        System.out.println("a-=b ="+ (a-=b));
        System.out.println("a*=b ="+ (a*=b));
        System.out.println("a/=b ="+ (j/=3));
        //String
        String ki ="  Kien  ";
        //Handle String
        System.out.println(ki.charAt(2));
        System.out.println(ki.equals("kien"));
        System.out.println(ki.concat("yeu Linh"));
        System.out.println(ki.length());
        System.out.println(ki.toLowerCase());
        System.out.println(ki.toUpperCase());
        System.out.println(ki.indexOf("i"));
        System.out.println(ki.substring(1,3));
        //Array
        int[] nums= new int[10];
        String[] cars = { "Honda", "BMW", "Ford", "Mazda" };
        int[] numb={1,2,3,4,5,6,7,8,9};
        for(int index =0 ;index<nums.length;index++){
            nums[index] =index;
        }
        //Handle Array
        System.out.println(Arrays.toString(numb));
        System.out.println(nums);
        //for
        for(String car :cars){
            System.out.println(car);
        }
        //while
        while(a<10){
            System.out.println(a++);
        }
        //If
        if (a<b){
            System.out.println(a+"<"+b);
        }else if(a>b) {
            System.out.println(a+">"+b);
        }else{
            System.out.println("error");
        }
        int age =10;
        int gia = (age<18)?100:150;
        System.out.println(gia);
        //Switch case
        switch(a){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println();
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            default:
                System.out.println("no value");
        }
        //beak and continue
        for (int index=0;index<10;index++){
            System.out.println(index);
            if(index==5){
                break;
            }
        }
        for(int index=0;index<10;index++){
            if(index==5){
                continue;
            }
            System.out.println(index);
        }
        //Type casting
        int z = (int) e;
        System.out.println(z);
        //handle String
        System.out.println(ki.isBlank());
        System.out.println(ki.isEmpty());
        System.out.println(ki.trim());
        System.out.println(ki.startsWith(" "));
        System.out.println((ki.replace("K","k")).trim());
        System.out.println(ki.contains("ie"));

    }
}
