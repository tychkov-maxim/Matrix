package com.epam.tm;

public class Calculator {
    static public Matrix multiply(Matrix m1, Matrix m2){

        if (m1.getCol() != m2.getRow())
            return null;

        int data[][] = new int[m1.getRow()][m2.getCol()];

        for(int i = 0;i < m1.getRow();i++){
            for (int j =0; j < m2.getCol();j++){
                for(int k = 0; k < m1.getCol();k++)
                    data[i][j] += m1.getValue(i,k) * m2.getValue(k,j);
            }
        }

        return new Matrix(data);
    }
}
