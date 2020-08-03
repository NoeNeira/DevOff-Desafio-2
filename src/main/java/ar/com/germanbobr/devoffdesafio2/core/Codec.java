package ar.com.germanbobr.devoffdesafio2.core;

public class Codec {

    public String encode(String message, int l) {
        int n = calculateN(message, l);
        return CodingMatrix.ofString(message, n, l).transpose().toString();
    }

    public String decode(String message, int n) {
        int l = calculateN(message, n);
        return CodingMatrix.ofString(message, n, l).transpose().toString();
    }

    private int calculateN(String text, int l) {
        Double size = Math.ceil(Double.valueOf(text.length()) / Double.valueOf(l));
        return size.intValue();
    }
}
