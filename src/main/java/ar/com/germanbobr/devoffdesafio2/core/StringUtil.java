package ar.com.germanbobr.devoffdesafio2.core;

public class StringUtil {
    public static  String fillBlanks(String text, int length) {
        int diff = length - text.length();
        StringBuilder sb = new StringBuilder(text);

        for(int i=0; i < diff; i++)
            sb.append(' ');

        return sb.toString();
    }
}
