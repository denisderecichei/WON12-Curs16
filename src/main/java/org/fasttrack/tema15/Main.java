package org.fasttrack.tema15;

public class Main {

    public static void main(String[] args) {
        int rowNumber = 100000;
        int columnNumber = 100000;
        long[][] matrix = new long[rowNumber][columnNumber];

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                matrix[i][j] = (i + 100) * (j + 100) * 1000000;
            }
        }
        //[1, 2, 3, 4, 5]

        //matrice:
        //[ 1 2 3 4 5
        //  6 7 8 9 10
        //  11 12 13 14 15
    }
}
