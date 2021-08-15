package com.Dileep;
import java.sql.SQLOutput;
import java.util.*;
public class Java_class {
    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void printname(String name) {
        System.out.println(name);
    }

    public static void printsum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }


    public static void main(String args[]){
        //Non Primitive Types size is unlimited
        String name = "Dileep";
        String nam = new String("Bethina");
        System.out.println(name.length());
        //concatenate
        /*String name1 = "Amma ";
        String name2 = "Akku";
        String name3 = name1 + name2;
        System.out.println(name3);*/
        //CharAT
      /*  String name = "Amma";
        System.out.println(name.charAt(1));*/
        //replace
      /* String name = "Amma";
        String name2 = name.replace('a','s');
        System.out.println(name2);*/
        //in java strings are immutable
        //java is 0 position language
        //substring
      /*  String name = "Amma and Dileep";
        System.out.println(name.substring(9,15)); */
        //Array
        int age = 30;
        int physics = 97;
        int chemistry = 98;
        int english = 99;

       /* int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95; */
       // System.out.println(marks[2]);
        //System.out.println(marks.length);
        //empty initialization of string null
        //int -> 0
        //boolean -> true or false

        // sort
      /*  System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]); */
       /* int[] marks = {97, 98, 95};

        int[][] finalmarks = {{97,98,95},{95,95,98}};
        System.out.println(finalmarks[1][1]);*/
        //casting
      /*  double price = 100.00;
        double finalprice = price + 18;

        System.out.println(finalprice);
       //implicit casting
        int p = 100;
        //Explicit casting(type cast)
        int fp = p + (int)18.99;

        System.out.println(fp); */

        //constants
      /*  int age = 30;
        age = 31;
        age = 32;
        final float pi = 3.14f;
        pi = 1.1F; */

        //operators
        //Assignment oparaters(unary operators)(++,--)
        //Arithmetic operators //(+,-,*,/,%)
        //logical operators
        //comparation operators
       /* double a = 5;
        double b = 3;
        double sum = a % b;
        //System.out.println(sum);

        int numb = 1;
       // ++numb;
        System.out.println(numb--); */
        //maths
        //5,6
        //random
       // System.out.println(Math.max(5,6));
        //System.out.println(Math.min(5,6));
       // System.out.println((int)(Math.random()*100));
        //how take input?
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Input Your String: ");
        String age1 = sc.nextLine();
        System.out.println(age1);*/
        //Comparison Operators
        //a == b
        //a != b
        //a < b
        //a > b
        //a <= b
        //a >= b
        //conditional statement
       /* boolean issunup = true;
        if(issunup == true){
            System.out.println("Day");
        }
        else
            System.out.println("Night");

        int ag = 30;
        if(ag > 18)
            System.out.println("Can vote");
        else
            System.out.println("Can't Vote"); */

        //Logical Operaator
        //&&

      /*  int a = 70;
        int b = 40;

        if(a < 50 && b < 50)
            System.out.println("Both less than 50");

        if( a<50 || b<50)
            System.out.println("Atleast one less than 50");
            */
//condition statements
        /*boolean isAdult = true;
        if(!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult"); */
        //condition statements
      //  Scanner sc = new Scanner(System.in);
        //pen = 10; notebook = 40

        /*int cash = sc.nextInt();
        if(cash < 10) {
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }

        else if(cash > 10 && cash < 40) {
            System.out.println("can get 1 thing");

        }

        else {
            System.out.println("Can get both");
        }
         */
        //Switch Statement
      /*  int day = 2; //1-monday,2-tusday..
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            default:
                System.out.println("Wed - Sun");
        }*/

        //loops
        //System.out.println("1");
        //System.out.println("2");
        //System.out.println("3");

        //1-100

       /* for(int i = 1;i <= 100; i++) {
            System.out.println(i);
        } */
       /* for(int i=100;i>=1;i--){
            System.out.println(i);
        }*/
        //while loop
     /*   int i = 100;
        while(i >= 1){
            System.out.println(i);
            i = i - 1;
        }
        */
        //Do while loop
       /* int k = 100;
        do {
            System.out.println(k);
            k = k - 1;
        } while(k >= 1); */
      /*  int num = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the number");
            num = sc.nextInt();
            System.out.println("Here is Your Number");
            System.out.println(num);
        } while(num > 0);

        System.out.println("The End"); */
        //Break & Continue
       /* int i = 0;
        while(true) {
            if(i == 3) {
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i > 5) {
                break;
            }
        }*/
        //exception handling -> try - catch
    /*    int[] marks = {97,98,95};
        try {
            System.out.println(marks[5]);
        } catch(Exception exception){
            //do something after catching
        }
        System.out.println("My Name is Dileep"); */

        //Function and Methods phone +vol , tv individual method
        //Methods
      /*  System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java"); */
      //  printJava();
     //   printJava();
    //    printJava();
      //  printname("Dileep");
        //printname("Amma");
       // printsum(1,6);
        
    }

}
