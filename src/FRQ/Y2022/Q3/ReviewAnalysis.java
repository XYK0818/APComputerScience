package FRQ.Y2022.Q3;

import java.util.ArrayList;

public class ReviewAnalysis {
    private final Review[] allReviews;

    public ReviewAnalysis(Review[] reviews){
        allReviews = reviews;
    }

    public double getAverageRating(){
        int ratingSum = 0;

        for(Review rev : allReviews)
            ratingSum += rev.getRating();

        return ratingSum / (double) allReviews.length;
    }


    public ArrayList<String> collectComments(){
        ArrayList<String> comments = new ArrayList<String>();

        for(int i = 0; i < allReviews.length; i++)
        {
            String com = allReviews[i].getComment();
            if(com.contains("!"))
            {
                String formatted = i + "-" + com;
                String lastChar = formatted.substring(formatted.length() - 1);
                if( ! lastChar.equals("!") && ! lastChar.equals("."))
                    formatted += ".";

                comments.add(formatted);
            }
        }

        return comments;
    }

}
