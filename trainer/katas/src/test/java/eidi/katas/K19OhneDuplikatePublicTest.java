package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K19OhneDuplikatePublicTest {

    @Test
    void test1() {
        assertArrayEquals(new int[]{1, 2, 3}, K19OhneDuplikate.ohneDuplikate(new int[]{1, 1, 2, 3, 3, 3}));
    }
}
