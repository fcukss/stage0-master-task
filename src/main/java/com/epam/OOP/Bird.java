package com.epam.OOP;

public class Bird extends  Animal{


    private static final String color = "blue";
    private static final int numberOfPaws = 2;
    private static final boolean hasFur = false;


    public Bird() {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        String str = " Moreover, it has 2 wings and can fly.";
        return super.getDescription() +str;
    }
}
