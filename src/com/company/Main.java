package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main (String [] args){

        for (int i=1; i<=100; i++){
                 if ((i%3 ==0) && (i%5 == 0))
            {
                System.out.println("FizBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }else if (i%5==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }
}
