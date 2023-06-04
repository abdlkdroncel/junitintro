package io.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiboTest {

    @Test
    void findFiboNumber(){
        FibonacciNumber fibonacciNumber=new FibonacciNumber();

        Assertions.assertThrows(IllegalArgumentException.class,()->fibonacciNumber.find(0));

        Assertions.assertAll(()->Assertions.assertEquals(1,fibonacciNumber.find(1)),
                ()->Assertions.assertEquals(1,fibonacciNumber.find(2)),
                ()->Assertions.assertEquals(2,fibonacciNumber.find(3)));
    }
}
