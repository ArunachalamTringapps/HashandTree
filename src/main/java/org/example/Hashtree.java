package org.example;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.*;

public class Hashtree {

    public static void main(String[] args) {
        Logger l =  Logger.getLogger("arun");
        TreeSet<String> ts1 = new TreeSet<>();//->Elements are added using add() method
        ts1.add("arun");
        ts1.add("bala");
        ts1.add("loki");
        ts1.add("loki");//->Duplicates will not get insert
        l.log(Level.INFO,()->"Set "+(ts1));//->sorting Order(Ascending)
        Iterator<String> it=ts1.iterator();//->iteration
        while(it.hasNext()) {

            l.log(Level.INFO,()->" " +it.next());
        }
        l.log(Level.INFO,()->" "+(ts1.size()));//->size of the Hashtree
        ts1.remove("BC");

    }

}