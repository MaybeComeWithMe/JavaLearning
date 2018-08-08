package reader.impl;

import reader.MatrixReader;

public class MatrixReaderImpl implements MatrixReader {

    @Override
    public int[][] readMatrixData(String fileName) {
        System.out.println(this.getClass().getClassLoader().getResource(fileName));
        return new int[0][];
    }
}
