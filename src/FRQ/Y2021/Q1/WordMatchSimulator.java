package FRQ.Y2021.Q1;

public class WordMatchSimulator {

    public static void main(String[] args){
        WordMatch game = new WordMatch("concatenation");
        int scoreTen = game.scoreGuess("ten");
        System.out.println(scoreTen);

        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.findBetterGuess("con", "cat"));


    }



}
