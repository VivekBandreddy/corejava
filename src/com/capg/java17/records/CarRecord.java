package com.capg.java17.records;

public record CarRecord(String registrationNumber, String owner, String chassisNumber) implements CarRecordInterface {

    //private String carModel; instance fields were not allowed in Records
    public static final String CAR_MODEL = "Tata Nexon";

    //compact constructor
    public CarRecord {
        System.out.println(this);
        if (registrationNumber().length() < 4){

            throw new IllegalArgumentException();
        }

    }

    //custom canonical construcor
    /*public CarRecord(String registrationNumber, String owner, String chassisNumber){
        if(registrationNumber().length()<4)
            throw new IllegalArgumentException();
    }*/

    //non canonical constructor
    /*public CarRecord() {
        this(" ", " ", "");
    }*/


    @Override
    public CarRecord fetchCarDetails() {
        return this;
    }
}
