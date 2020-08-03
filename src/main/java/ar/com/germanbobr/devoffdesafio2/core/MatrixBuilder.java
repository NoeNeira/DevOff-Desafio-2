package ar.com.germanbobr.devoffdesafio2.core;

public class MatrixBuilder {
    public CodingMatrix buildEncode(String text, int l) {
        int n = calculateN(text,l);
        return build(text, l, n);
    }

    public CodingMatrix buildDecode(String text, int n) {
        int l = calculateN(text, n);
        return build(text, l, n);
    }

    private CodingMatrix build(String text, int l, int n) {
        int length = text.length();
        String[] characters = text.split("");
        String[][] matrix = new String[n][l];

        for(int i = 0; i<n; i++) {
            for(int j = 0; j < l; j++) {
                int pos = i*l+j;
                if(pos < length) {
                    matrix[i][j] = characters[pos];
                } else {
                    matrix[i][j] = (" ");
                }
            }
        }

        return new CodingMatrix(matrix, n, l);
    }

    private int calculateN(String text, int l) {
        Double size = Math.ceil(Double.valueOf(text.length()) / Double.valueOf(l));
        return size.intValue();
    }
}
