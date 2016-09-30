package com.epam.tm;

public class Main {
    public static void main(String[] args) {

        int [][] a = new int[][]{
                {1,2,3,4},
                {5,6,7,8}
        };
        int [][] b = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);
        m1.show();
        m2.show();

        Calculator.multiply(m1,m2).show();


    }
}
