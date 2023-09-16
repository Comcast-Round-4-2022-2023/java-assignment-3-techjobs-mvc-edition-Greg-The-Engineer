package org.launchcode.techjobs.mvc.models;

public class Location extends JobField {

    public Location(String value) {
        super(value);
    }

    // Add a public getter method for the name property
    public String getName() {
        return super.getValue();
    }
}
