package io.unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void returnFizzWhenThenNumberIsDividedByThree(){

        assertEquals("Fizz", fizzBuzz.stringFor(3));
    }

    @Test
    void returnFizzWhenThenNumberIsDividedByFive(){
        assertEquals("Buzz",fizzBuzz.stringFor(5));
    }

    @Test
    void returnFizzWhenThenNumberIsDividedByFiveAndThree(){
        assertEquals("FizzBuzz",fizzBuzz.stringFor(15));
    }

    @Test
    void returnThenNumberItselfTheNumberIsNotDividedAnyOfThreeOrFive(){
        assertEquals("7",fizzBuzz.stringFor(7));
    }

    @Test
    void throwsIllegalArgExceptionWhenTheNumberIsLessThanOneOrGreaterThanHundred(){
        assertThrows(IllegalArgumentException.class,()->fizzBuzz.stringFor(-1));
        assertThrows(IllegalArgumentException.class,()->fizzBuzz.stringFor(101));

    }
}
