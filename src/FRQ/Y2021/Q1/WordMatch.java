package FRQ.Y2021.Q1;

public class WordMatch {

    private final String secret;

    public WordMatch(String word){
        secret = word;
    }

    public int scoreGuess(String guess){
        int count = 0;
        for(int i=0; i<secret.length(); i++){
            int j = i + guess.length();
            if(j <= secret.length() && secret.substring(i,j).equals(guess)){
                count ++;
            }
        }
        return (int) (count * Math.pow(guess.length(), 2));
    }

    public String findBetterGuess(String guess1, String guess2){
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);

        if(score1 > score2){
            return guess1;
        } else if(score1 < score2){
            return guess2;
        } else {
            int compareResult = guess1.compareTo(guess2);
            System.out.println("compare result is: " + compareResult);
            if(compareResult > 0){
                return guess1;
            } else {
                return guess2;
            }
        }
    }

}
