import calculator.Calculator;
import calculator.impl.CalculImpl;
import reader.MatrixReader;
import reader.impl.MatrixReaderImpl;

import java.io.*;

public class Main {

     static int a[][] =  {{21,3},{32,4}};
     static int b[][] =  {{42,44},{1,52}};

    public static void main(String[] args) throws IOException {

        MatrixReader matrixReader = new MatrixReaderImpl();
        matrixReader.readMatrixData("Example.txt");
//         System.out.println("First array: ");
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//        }
//
//        System.out.println("  ");
//
//        System.out.println("Second array: ");
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//        }
//
//        System.out.println("          ");
//        System.out.println("*-*-*Answer*-*-*");
//
//        Calculator calc = new CalculImpl();
//
//        int [][] result = calc.multiplicat(a,b);
//
//        for (int i = 0; i < result.length; i++) {
//            for (int j = 0; j < result.length; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//        }

    }

}