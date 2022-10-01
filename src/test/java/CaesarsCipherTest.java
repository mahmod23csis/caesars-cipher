import org.example.CaesarsCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarsCipherTest {

    private CaesarsCipher caesarsCipher = new CaesarsCipher();
    @Test
    void testCipheredMessageWithOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesarsCipher.cipher("", 12));
    }

    @Test
    void failingTestWithOffsetOf11() {
        assertEquals("tai mdq kag pauzs fapmk", caesarsCipher.cipher("how are you doing today", 11));
    }
}
