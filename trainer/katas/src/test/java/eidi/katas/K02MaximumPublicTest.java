package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K02MaximumPublicTest {

    @Test
    void test1() {
        assertEquals(9, K02Maximum.maximum(new int[]{3, 9, 2}));
    }
}
