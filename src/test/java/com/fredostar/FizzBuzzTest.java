package com.fredostar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void avantChaqueTest(){

         fizzBuzz = new FizzBuzz();
    }


    @Test
    public void should_returnString(){

        Assertions.assertEquals("1", fizzBuzz.resultat(1));

    }

    @Test
    public void should_returnFizz(){
        Assertions.assertEquals("Fizz", fizzBuzz.resultat(3));
    }

    @Test
    public void should_returnBuzz(){
        Assertions.assertEquals("Buzz", fizzBuzz.resultat(5));
    }


}
