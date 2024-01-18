package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }

    public String getDescription(){
        String aboba = (numberOfPaws == 1) ? "paw" : "paws";
        String aboba1=(hasFur)? "a" : "no";
        return ("This animal is mostly "+color+". "+"It has "+numberOfPaws+" "+aboba+" and "+aboba1+" fur.");
    }
}
