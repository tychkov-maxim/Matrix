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

        Matrix m1 = new Matrix(2,4);
        Matrix m2 = new Matrix(4,4);

        m1.fillRandomInRange(1000);
        m2.fillRandomInRange(1000);



        Matrix m3 = Calculator.multiply(m1,m2);



    }
}
