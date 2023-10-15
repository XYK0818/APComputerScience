package FRQ.Y2022.Q3;

import java.util.ArrayList;

public class ReviewAnalysisSimulator {
    public static void main(String[] args){
        Review review1 = new Review(4, "Good! Thx");
        Review review2 = new Review(3, "OK site");
        Review review3 = new Review(5, "Great!");
        Review review4 = new Review(2, "Poor! Bad.");
        Review review5 = new Review(3, "");
        Review[] reviews = new Review[] {review1, review2, review3, review4, review5};

        ReviewAnalysis analysis = new ReviewAnalysis(reviews);
        double averageRatings = analysis.getAverageRating();
        System.out.println(averageRatings);
        ArrayList<String> comments = analysis.collectComments();
        System.out.println(comments);


    }
}
