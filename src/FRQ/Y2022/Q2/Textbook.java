package FRQ.Y2022.Q2;

public class Textbook extends Book{
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int edition)
    {
        super(bookTitle, bookPrice);
        this.edition = edition;
    }

    public int getEdition()
    {
        return edition;
    }

    public String getBookInfo()
    {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstituteFor(Textbook otherTextbook)
    {
        return this.getTitle().equals(otherTextbook.getTitle()) &&
                this.getEdition() >= otherTextbook.getEdition();
    }
}
