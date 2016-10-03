package com.epam.tm;

import java.io.PrintStream;

public class PrintMatrix {

    private PrintStream out;

    PrintMatrix() {
        out = System.out;
    }


    public void print(Matrix m) {
        if (m != null) {
            out.println("---------------------------");
            for (int i = 0; i < m.getRow(); i++) {
                for (int j = 0; j < m.getCol(); j++) {
                    out.print(m.getValue(i, j) + " ");
                }
                out.println();
            }
        }
    }

    public void setOut(PrintStream out) {
        this.out = out;
    }

}



