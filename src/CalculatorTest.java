import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


import static org.testng.AssertJUnit.assertEquals;
public class CalculatorTest {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    @DisplayName("Exponent")
    void shouldShowtheResultFactorial(int value){
        Calculator calc = new Calculator();
        assertEquals(value, calc.sum(value, 1));
    }

    //factorial
    @Test
    void testofFactorial() {
        Calculator calc = new Calculator();
        // 2! = 2
        assertEquals(6, calc.sum(1, 3));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,4,5,6,7})
    @DisplayName("Factorial")
    void ShowtheResultFactorial(int value){
        Calculator calc = new Calculator();
        if(value == 3){
            assertEquals(18, calc.sum(value,3));
        }else if(value == 4){
            assertEquals(96, calc.sum(value,4));
        }else if(value == 5){
            assertEquals(600, calc.sum(value,5));
        }else if(value == 6){
            assertEquals(4320, calc.sum(value,6));
        }else if(value == 7){
            assertEquals(35280, calc.sum(value,7));
        }
    }

    //palindrome
    @ParameterizedTest
    @ValueSource(strings = {"wow","refer", "civic", "racecar", "kayak" })
    @DisplayName("Palindrome")
    void testThePalindrome(String value){
        Calculator calc = new Calculator();
        assertEquals(value, calc.Palindrome(value));
    }

}
