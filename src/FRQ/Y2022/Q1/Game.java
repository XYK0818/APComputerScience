package FRQ.Y2022.Q1;

import java.util.Random;

public class Game {

    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game(){
        this.levelOne = new Level(1);
        this.levelTwo = new Level(2);
        this.levelThree = new Level(3);
    }


    public boolean isBonus(){
        return new Random().nextInt(100) >= 50;
    }

    public void play(){
        int levelOneScore = new Random().nextInt(100);
        int levelTwoScore = new Random().nextInt(100);
        int levelThreeScore = new Random().nextInt(100);
        levelOne.setScore(levelOneScore);
        levelTwo.setScore(levelTwoScore);
        levelThree.setScore(levelThreeScore);
        System.out.println("your scores: " + levelOneScore + "," + levelTwoScore + "," + levelThreeScore);
    }


    public int getScore(){
        int totalScore = 0;
        if(levelOne.goalReached()){
            totalScore += levelOne.getPoints();
            if(levelTwo.goalReached()){
                totalScore += levelTwo.getPoints();
                if(levelThree.goalReached()){
                    totalScore += levelThree.getPoints();
                }
            }
        }
        if(isBonus()){
            System.out.println("Bonus applied");
            totalScore *= 3;
        }
        return totalScore;
    }


    public int playManyTimes(int num){
        int highestScore = 0;
        int currentScore;
        for(int i=1; i<=num; i++){
            System.out.println("playing game with attempt: " + i);
            play();
            currentScore = getScore();
            System.out.println("your total score is: " + currentScore);
            System.out.println();
            if(currentScore > highestScore){
                highestScore = currentScore;
            }
        }
        System.out.println("your highest score is: " + highestScore);
        return highestScore;
    }
}
