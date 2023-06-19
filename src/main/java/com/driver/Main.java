package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly read = new RWOnly();
        read.setName("bharat");
        System.out.println(read.getName()); // attribute "name" has a private access
    }
}