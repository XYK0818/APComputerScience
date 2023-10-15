package FRQ.Y2022.Q1;

public class GameSimulator {
    public static void main(String[] args){
        Game tianzhe = new Game();
        int tianzheScore = tianzhe.playManyTimes(3);

        Game yangke = new Game();
        int yangkeScore = yangke.playManyTimes(3);

        System.out.println(tianzheScore);
        System.out.println(yangkeScore);
    }
}
