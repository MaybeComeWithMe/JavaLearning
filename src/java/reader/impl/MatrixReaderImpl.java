package reader.impl;

import reader.MatrixReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MatrixReaderImpl implements MatrixReader {

    @Override
    public int[][] readMatrixData(String fileName) throws IOException {
        int result[][] = new int[4][4];

        System.out.println(this.getClass().getClassLoader().getResource(fileName).getPath());
        List<String> list = Files.readAllLines(Paths.get(this.getClass().getClassLoader().getResource(fileName).getPath()));
        int i = 0;
        for (String ls : list) {
            System.out.println(ls);
            String[] splittedLine = ls.split(" ");
            int j =0;
            for (String sp:splittedLine){
                    result[i][j] = Integer.parseInt(sp);
                j++;
            }
        i++;


        }

        return result;
    }
}