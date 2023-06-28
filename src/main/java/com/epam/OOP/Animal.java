package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    private String getFur() {
        if (hasFur)
            return "a";
        else
            return "no";
    }

    public String getDescription() {
        if (numberOfPaws > 1)
            return "This animal is mostly " + color + "." +
                    " It has " + numberOfPaws + " paws " +
                    "and " + getFur() + " fur.";
        else
            return "This animal is mostly " + color + "." +
                    " It has " + numberOfPaws + " paw " +
                    "and " + getFur() + " fur.";
    }
}
