package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength <= 0) {
            return;
        }

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

        public static void main (String[]args){
            new HalfPyramid().printHalfPyramid(8);
        }


}