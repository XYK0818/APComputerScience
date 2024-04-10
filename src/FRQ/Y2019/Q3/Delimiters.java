package FRQ.Y2019.Q3;

import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delimiters = new ArrayList<String>();

        for(String t : tokens)
            if(t.equals(openDel) || t.equals(closeDel))
                delimiters.add(t);

        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters){
        int numOpen = 0, numClosed = 0;

        for(String d : delimiters)
        {
            if(d.equals(openDel))
                numOpen++;

            if(d.equals(closeDel))
                numClosed++;

            if(numClosed > numOpen)
                return false;
        }

        return numOpen == numClosed;
    }

}
