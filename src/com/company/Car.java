package com.company;

public class Car implements AutoCloseable  {


    public Car() {

    }

    public void close() throws Exception {
        System.out.println("car is closing");
    }

    public void drive() throws Exception {
        System.out.println("car is going");
    }

}
