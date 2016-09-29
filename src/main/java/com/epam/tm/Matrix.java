package com.epam.tm;

class Matrix {
    private int row,col;
    private int data[][];

    Matrix(int row,int col){
        this.row = row;
        this.col = col;
        data = new int[row][col];

        for (int i = 0;i < row;i++)
            for (int j = 0;j < col;j++)
                data[i][j] = 0;
    }

    void show(){
        for (int i = 0;i < row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

}
