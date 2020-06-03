package com.task1234;
import java.util.UUID;

public class Administrator extends Employee {
    String uniqueID;

    public Administrator(String name, String surname) {
        super(name, surname);
        this.uniqueID = UUID.randomUUID().toString();
    }




}
