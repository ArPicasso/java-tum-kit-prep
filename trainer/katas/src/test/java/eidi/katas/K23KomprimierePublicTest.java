package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K23KomprimierePublicTest {

    @Test
    void test1() {
        assertEquals("a3b1c2", K23Komprimiere.komprimiere("aaabcc"));
    }
}
