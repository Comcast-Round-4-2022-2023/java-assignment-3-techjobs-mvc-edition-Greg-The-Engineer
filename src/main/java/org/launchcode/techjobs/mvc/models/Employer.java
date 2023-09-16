package org.launchcode.techjobs.mvc.models;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }

    // Add a getter method for the "name" property
    public String getName() {
        return super.getValue(); // Assuming "value" is where the name is stored in the parent class
    }
}
