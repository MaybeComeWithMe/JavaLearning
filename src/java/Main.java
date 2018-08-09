import calculator.Calculator;
import calculator.impl.CalculImpl;
import reader.MatrixReader;
import reader.impl.MatrixReaderImpl;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        MatrixReader matrixReader = new MatrixReaderImpl();

        int[][] a = matrixReader.readMatrixData("Example.csv");
        int[][] b = matrixReader.readMatrixData("Example1.csv");

        Calculator calc = new CalculImpl();
        int[][] c = calc.multiplicat(a, b);
        System.out.println(" Multiplicate array");

        for (int i = 0; i < c.length; i++) {
            System.out.println("    ");
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
        }
    }

}