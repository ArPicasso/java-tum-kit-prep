package eidi.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K08FizzBuzzPublicTest {

    @Test
    void test1() {
        assertEquals("Fizz", K08FizzBuzz.fizzBuzz(9));
    }
    @Test
    void test2() {
        assertEquals("7", K08FizzBuzz.fizzBuzz(7));
    }
}
