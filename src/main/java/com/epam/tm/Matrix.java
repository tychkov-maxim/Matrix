package com.epam.tm;

import java.util.Random;

public class Matrix {
    private int values[][];

    Matrix(int row,int col){
        this.values = new int[row][col];
    }

    Matrix(int[][] data){
        init(data);
    }

    void fillRandomInRange(int range){
        for (int i = 0;i < getRow();i++)
            for (int j = 0;j < getCol();j++)
                values[i][j] = new Random().nextInt(range);
    }

    private void init(int[][] data) {

        if (data != null) {
            int row = data.length;
            int col = data[0].length;
            if ((row > 0) && (col > 0)) {
                this.values = new int[row][col];
                this.values = data.clone();
            }
        }
    }

    int getRow(){
        return values.length;
    }

    int getCol(){ return values[0].length; }

    int getValue(int i,int j){
        return values[i][j];
    }
}
