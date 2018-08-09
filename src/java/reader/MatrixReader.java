package reader;

import java.io.IOException;

public interface MatrixReader {
    int[][] readMatrixData(String fileName) throws IOException;

}
