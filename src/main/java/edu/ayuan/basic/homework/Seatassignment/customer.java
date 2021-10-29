package edu.ayuan.basic.homework.Seatassignment;

public class customer {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;


    public customer(String firstName, String middleName, String lastName) {
       this(firstName,lastName);
        this.middleName = middleName;
    }
    public customer(String firstName,String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
    }
}


