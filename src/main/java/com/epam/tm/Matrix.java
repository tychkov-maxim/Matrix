package com.epam.tm;

import java.util.Random;

class Matrix {
    private int row,col;
    private int data[][];

    Matrix(int row,int col){
        this.row = row;
        this.col = col;
        this.data = new int[row][col];
        resetMatrix();
    }

    Matrix(int[][] data){
        if ((data.length > 0)  && (data[0].length > 0)){
            this.row = data.length;
            this.col = data[0].length;
        }
        this.data = new int[row][col];
        setMatrix(data);
    }

    void setRandom(){
        for (int i = 0;i < row;i++)
            for (int j = 0;j < col;j++)
                data[i][j] = new Random().nextInt(1000);
    }

    private void setMatrix(int[][] data){
            for (int i = 0; i < row; i++)
                for (int j = 0; j < col; j++)
                    this.data[i][j] = data[i][j];
    }

    private void resetMatrix(){
        for (int i = 0;i < row;i++)
            for (int j = 0;j < col;j++)
                data[i][j] = 0;
    }

    int getRow(){
        return row;
    }

    int getCol(){
        return col;
    }

    int getValue(int i,int j){
        return data[i][j];
    }
    //Вывод матрицы
    void show(){
        System.out.println("-------------------------");
        for (int i = 0;i < row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


}
