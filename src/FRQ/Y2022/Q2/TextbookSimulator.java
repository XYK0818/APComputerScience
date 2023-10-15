package FRQ.Y2022.Q2;

public class TextbookSimulator {
    public static void main(String[] args){
        Textbook myTextbook = new Textbook("Xian Jian Qi Xia Zhuan", 29.9, 1);
        System.out.println(myTextbook.getBookInfo());
        Textbook myOldTextbook = new Textbook("Xian Jian Qi Xia Zhuan", 24.9, 0);
        System.out.println(myTextbook.canSubstituteFor(myOldTextbook));
    }
}
