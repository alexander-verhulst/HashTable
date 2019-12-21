package com.company;

public class App {

    public static void main(String[] args) {

        HashTable table = new HashTable(5);
        table.insert("Estonia");
        table.insert("Tallinn");
        table.insert("EUAS");
        table.insert("Old Town");
        table.insert("Tartu");

        System.out.println("---Finding the Elements---");
        System.out.println(table.find("Old Town"));



    }

}
