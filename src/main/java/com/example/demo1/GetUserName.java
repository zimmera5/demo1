package com.example.demo1;
import java.util.Scanner;
public class GetUserName {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String myName = SafeInput.getNonZeroLenString(in,"Give me a Name;");
        System.out.println("Your Name is  "+myName);

    }


}
