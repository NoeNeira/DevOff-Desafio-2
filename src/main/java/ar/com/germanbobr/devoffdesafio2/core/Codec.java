package ar.com.germanbobr.devoffdesafio2.core;

public class Codec {
    private final MatrixBuilder matrixBuilder;

    public Codec() {
        matrixBuilder = new MatrixBuilder();
    }

    public String encode(String message, int l) {
        final CodingMatrix matrix = matrixBuilder.buildEncode(message, l);
        final CodingMatrix transposed = matrix.transpose();
        return transposed.getString();
    }

    public String decode(String message, int n) {
        final CodingMatrix matrix = matrixBuilder.buildDecode(message, n);
        final CodingMatrix transposed = matrix.transpose();
        return transposed.getString();
    }
}
