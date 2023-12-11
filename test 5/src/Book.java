public class Book {
    private String auhtor;

    private int pageAmount;

    private String publisher;

    private int yearPublisher;


    // public static final int BOOK_SIZE = 6;

    public static int BOOK_COUNTER = 0;

    public Book(String auhtor, int pageAmount, int yearPublisher) {
        this(auhtor, pageAmount, "No publisher", yearPublisher);
    }

    public Book(String auhtor, int pageAmount, String publisher, int yearPublisher) {
        this.auhtor = auhtor;
        this.pageAmount = pageAmount;
        this.publisher = publisher;
        this.yearPublisher = yearPublisher;
        BOOK_COUNTER++;
    }

    public String getAuhtor() {
        return auhtor;
    }

    public void setAuhtor(String auhtor) {
        this.auhtor = auhtor;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void setPageAmount(int pageAmount) {
        this.pageAmount = pageAmount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        if (yearPublisher < 1950 || yearPublisher > 2050) {
            System.out.println("invalid publishing year: " + yearPublisher);
            return;
        }
        this.yearPublisher = yearPublisher;
    }

    public static int getBookCounter() {
        return BOOK_COUNTER;
    }

    public static void setBookCounter(int bookCounter) {
        BOOK_COUNTER = bookCounter;
    }
}

