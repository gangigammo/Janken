package sample;

import java.util.Random;

public class JankenController implements Field{
    int HANDS[] = { ROCK, PAPER, SCISSORS };
    public int jankenOutput(){
        Random r = new Random();
        return HANDS[r.nextInt(3)];
    }
}
