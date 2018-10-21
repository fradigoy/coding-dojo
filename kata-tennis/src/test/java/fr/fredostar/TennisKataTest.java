package fr.fredostar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TennisKataTest {

    private TennisKata game;

    @BeforeEach
    public void avantChaqueTest(){
         game = new TennisKata();
    }

    @Test
    public void newGameShouldReturnZero_Zero()
    {
        String score = game.getScore();
        Assertions.assertEquals("0-0", score);
    }

    @Test
    public void playerOneWinsFirstBall(){

        game.playerOneScore();

        String score = game.getScore();

        Assertions.assertEquals("15-0", score);


    }


}
