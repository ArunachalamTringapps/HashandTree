package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger(Main.class.getName());
        int ch;
        do {
            l.info("Welcome Guys");
            l.info("Enter Your choice:");
            l.info("1.Hashmap\n2.Hashset\n3.TreeSet");
            ch=sc.nextInt();
            switch (ch){
                case 1-> Hashmap.firstname();
                case 2-> Hashset.firstname();
                case 3-> TreeSet.firstname();
                default -> l.info("Thank You Guys:)");
            }
        }while (ch<4);
    }
}
