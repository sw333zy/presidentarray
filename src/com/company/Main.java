package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter presidents:");

        String history = "";
        String[] myarray = new String[10];
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = keyboard.next();
            history += myarray[i];
        }

        for (int i = myarray.length - 1; i >=0; --i){
            System.out.println(myarray[i]);
        }
    }
}
