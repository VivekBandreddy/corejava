package com.capg.java17.records;

public class RecordMainClass {
    public static void main(String[] args) {
        CarRecord carRecord = new CarRecord("TS O8 JB 7569", "P S M", "hscfjasfhgjdafh");
        System.out.println(carRecord);
        System.out.println(carRecord.owner());
        System.out.println(CarRecord.CAR_MODEL);

    }
}
