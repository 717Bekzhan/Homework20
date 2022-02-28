package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        //bul jerde bir ashykcha object bolgon
        try (Car car = new Car()){
            car.drive();
        }catch  (Exception e){
            e.getMessage();
        }
    }
}
