package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K22TransponierePublicTest {

    @Test
    void test1() {
        assertArrayEquals(new int[][]{{1, 4}, {2, 5}, {3, 6}}, K22Transponiere.transponiere(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
