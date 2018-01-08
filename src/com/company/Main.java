package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listOfNumbers = new ArrayList();

        for (int i = 0; i<10; i++) {
            listOfNumbers.add(i);
        }
        for (int i = 0; i< listOfNumbers.size();i++) {
            System.out.println(listOfNumbers.get(i));
        }

        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Józsi");
        nameList.add("Béla");
        nameList.add("Gréta");
    }

}
