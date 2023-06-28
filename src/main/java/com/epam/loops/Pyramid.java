package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int st = 1;
        int sp = cathetusLength-1;
        for (int i = 0; i < cathetusLength; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=st;k++){

                System.out.print(k);
            }
            st+=2;
            sp--;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
