package calculator.impl;

import calculator.Calculator;

public class CalculImpl implements Calculator{

    @Override
    public int[][] multiplicat(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] =  0 ;
            }
        }
        for(int i=0; i < c.length;i++){
            for(int j=0;j < c.length;j++){
                for(int k=0;k<b.length;k++){
                    c[i][j]= c[i][j] +(a[i][k] * b[k][j]);
                }

            }

        }

        return c;
    }
}
