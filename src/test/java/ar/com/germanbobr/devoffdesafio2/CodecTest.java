package ar.com.germanbobr.devoffdesafio2;

import ar.com.germanbobr.devoffdesafio2.core.Codec;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CodecTest {
    private static final String DECODED_STRING = "Devoff se puso ATR";
    private static final String ENCODED_STRING = "DfesTef oRv p  osuA";

    @Test
    void testCodec() {
        Codec codec = new Codec();

        String encoded = codec.encode(DECODED_STRING, 4);
        assertThat(encoded).isEqualTo(ENCODED_STRING);
    }

    @Test
    void testDecode() {
        Codec codec = new Codec();

        String decoded = codec.decode(ENCODED_STRING, 4);
        assertThat(decoded).isEqualTo(DECODED_STRING);
    }
}
