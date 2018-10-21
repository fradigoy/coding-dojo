package fr.fredostar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TennisKataTest {

    private TennisKata tennisKata;

    @BeforeEach
    public void avantChaqueTest(){
         tennisKata = new TennisKata();
    }

    @Test
    public void newGameShouldReturnZero_Zero()
    {
        String score = tennisKata.getScore();
        Assertions.assertEquals("0-0", score);
    }


}
