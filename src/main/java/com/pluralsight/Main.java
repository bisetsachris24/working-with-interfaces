package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        // Build the list of people.
        List<Person> myClassmate = new ArrayList<Person>();
        myClassmate.add( new Person("Amani",       "Bisetsa",   25) );
        myClassmate.add( new Person("Eric",    "Shwartz",  44) );
        myClassmate.add( new Person("Anthony",     "Belthan",   26) );
        myClassmate.add( new Person("Justin",        "Key",  28) );
        myClassmate.add( new Person("Chris",  "Bunny",   23) );
        myClassmate.add( new Person("Ezra",       "Bunny",   24) );

        // Display in the original order.
        System.out.println("Original order ");
        printPeople(myClassmate);

        // Sort the list. This works because Person implements Comparable<Person>.
        Collections.sort(myClassmate);

        // Display after sorting (by last name).
        System.out.println();
        System.out.println("=== Sorted by last name ===");
        printPeople(myClassmate);
    }

    private static void printPeople(List<Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}