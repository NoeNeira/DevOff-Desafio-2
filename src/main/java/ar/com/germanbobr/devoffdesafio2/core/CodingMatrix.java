package ar.com.germanbobr.devoffdesafio2.core;

public class CodingMatrix {
    private final String[][] matrix;
    private final int n;
    private final int l;

    public CodingMatrix(String[][] matrix, int n, int l) {
        this.matrix = matrix;
        this.n = n;
        this.l = l;
    }

    public CodingMatrix transpose() {
        String[][] transposed = new String[l][n];
        for(int i = 0; i<l; i++) {
            for(int j = 0; j < n; j++) {
                transposed[i][j]=matrix[j][i];
            }
        }
        return new CodingMatrix(transposed, l, n);
    }

    public static CodingMatrix ofString(String text, int n, int l) {
        text = StringUtil.fillBlanks(text, l*n);
        String[] characters = text.split("");
        String[][] matrix = new String[n][l];

        for(int i = 0; i<n; i++) {
            for(int j = 0; j < l; j++) {
                matrix[i][j] = characters[i*l+j];
            }
        }

        return new CodingMatrix(matrix, n, l);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder(l*n);

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < l; j++) {
                sb.append(matrix[i][j]);
            }
        }

        return sb.toString().trim();
    }
}
