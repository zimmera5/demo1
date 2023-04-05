package com.example.demo1;
import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String ham){

        String retString = "";
        do{
            System.out.println(ham);
            retString = pipe.nextLine();

        }while(retString.length()==0);

        return retString;

    }


    public static int getInt(Scanner pipe, String prompt){

        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println(prompt);
            if(pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.println("Not correct type: "+ trash);
            }
        }while(!done);

        return retVal;

    }


    public static double getDouble(Scanner pipe, String prompt){

        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println(prompt);
            if(pipe.hasNextDouble()){
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.println("Not correct type: "+ trash);
            }
        }while(!done);
        return retVal;

    }





}
