package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int st = 1;
        int sp = cathetusLength-1;
        for(int i=1; i<=cathetusLength; i++){
            for (int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=st; k++){
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();


        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
