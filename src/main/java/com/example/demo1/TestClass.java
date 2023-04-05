package com.example.demo1;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        //declare my variables
        int myInt;
        String myName = "";
        Scanner in = new Scanner(System.in);

        myName = SafeInput.getNonZeroLenString(in,"Give me a name");

        System.out.println("Your name is "+ myName);

        myInt = SafeInput.getInt(in,"Give me a whole number");

        System.out.println("Your number is "+ myInt);
    }

}
