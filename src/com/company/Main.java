package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
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

        nameList.add(1,"Klára");

        for (String s :nameList) {
            System.out.println(s);
        }


        System.out.println(nameList.indexOf("Gréta"));
*/
/*
        HashSet<Character> chars = new HashSet<>();
        chars.add('a');
        chars.add('b');
        chars.add('a');
        chars.add('c');

        for (Character c : chars) {
            System.out.println(c);
        }
*/
/*
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1,"Béla");
        users.put(2, "Józsi");
        users.put(1, "Alma");

        for (Map.Entry<Integer,String > entry: users.entrySet()) {
            System.out.println("Key: " +entry.getKey() + "Value: " + entry.getValue());
        }
*/
        // minden hozzáfűzűsnél új objektum jön létre
        String s = "";
        s+= "a";
        s+= "b";
        s+= "c";
        //s = abc
/*
        // nem keltkezik új objektum hozzáfűzésnél
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        // sb.toString() = abc
*/

    SacramentoUtil a = new SacramentoUtil();

    a.readSacramentoCSV();

    }

}
