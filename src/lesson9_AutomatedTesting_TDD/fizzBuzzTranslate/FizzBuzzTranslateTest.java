package lesson9_AutomatedTesting_TDD.fizzBuzzTranslate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTranslateTest {

    @Test
    public void testTranslate() {
        assertEquals("1", FizzBuzzTranslate.translate(1));
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
        assertEquals("hai sau", FizzBuzzTranslate.translate(26));
        assertEquals("Fizz hai sau", FizzBuzzTranslate.translate(78));
        assertEquals("Buzz hai sau", FizzBuzzTranslate.translate(130));
        assertEquals("không hợp lệ", FizzBuzzTranslate.translate(0));
        assertEquals("không hợp lệ", FizzBuzzTranslate.translate(-5));
    }
}