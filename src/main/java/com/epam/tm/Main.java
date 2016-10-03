package com.epam.tm;

public class Main {
    public static void main(String[] args) {

        Matrix m1 = new Matrix(2,4);
        Matrix m2 = new Matrix(4,4);
        m1.fillRandomInRange(100);
        m2.fillRandomInRange(100);

        Matrix m3 = Calculator.multiply(m1,m2);

        PrintMatrix printer = new PrintMatrix();
        printer.print(m1);
        printer.print(m2);
        printer.print(m3);

    }
}
