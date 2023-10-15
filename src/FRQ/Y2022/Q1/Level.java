package FRQ.Y2022.Q1;

public class Level {

    private int level;
    private int score;
    public Level(int levelNum){
        level = levelNum;
    }


    public void setScore(int scoreNum){
        score = scoreNum;
    }


    public boolean goalReached(){

        if(level == 1){
            return score >= 60;
        } else if (level == 2) {
            return score >= 60;
        } else if (level == 3) {
            return score >= 80;
        } else {
            System.out.println("Wrong level number! expecting 1,2,3. got " + level);
            return false;
        }
    }


    public int getPoints(){
        if(level == 1){
            return 200;
        } else if (level == 2) {
            return 100;
        } else if (level == 3) {
            return 500;
        } else {
            System.out.println("Wrong level number! expecting 1,2,3. got " + level);
            return 0;
        }
    }
}
