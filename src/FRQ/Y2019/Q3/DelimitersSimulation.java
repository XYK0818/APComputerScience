package FRQ.Y2019.Q3;

import java.util.ArrayList;

public class DelimitersSimulation {

    public static void main(String[] args) {
        String open1 = "<q>";
        String close1 = "</q>";
        Delimiters del1 = new Delimiters(open1, close1);

        String[] tokens1 = {"<q>", "yy", "</q>", "zz", "</q>"};
        System.out.println(del1.getDelimitersList(tokens1));

        System.out.println(del1.isBalanced(del1.getDelimitersList(tokens1)));
    }

}
