//Code by Bethina Dileep 
//Date:15-08-2021

package com.Dileep;

import java.util.Scanner;

public class Java_Mini_Project {

    public static void main(String args[])
    {
        //Mini Project -> checking Random Number(System Generated Number) is Equal to user given Number
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);

        int userNumber = 0;

        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber) {
                System.out.println("WOOHOO...CORRECT NUMBER!!!");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("your number is too large");
            }

            else {
                System.out.println("Your number is too small");
            }

        }while(userNumber >= 0);

        System.out.print("My number was: ");
        System.out.println(userNumber);

    }
}
