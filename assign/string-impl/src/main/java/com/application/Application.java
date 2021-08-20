package com.application;
//import com.application.StringFunctions;

public class Application {
    public static void main(String[] args){

        /* Here we are making the object of StringFunction class and calling it's methods */
        String stringInput = " Hello ! Mayank Singh Rajput";

        com.application.StringFunctions object = new com.application.StringFunctions();

        System.out.println("The original string is : Hello ! Mayank Singh Rajput");

        System.out.println("The Reverse of the string is : " + object.stringReverse(stringInput));

        System.out.println("The Length of the string is : " + object.stringLength(stringInput));
    }
}