package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K13ZweitgroesstePublicTest {

    @Test
    void test1() {
        assertEquals(3, K13Zweitgroesste.zweitgroesste(new int[]{3, 9, 2}));
    }
}
