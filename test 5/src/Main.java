public class Main {
    public static void main(String[] args) {
        System.out.println();

        Book book = new Book("Пушкин", 3, 1800);
        System.out.println("Автор книги: " + book.getAuhtor() + "\nИздатель: " + book.getPublisher() + "\nСтраниц: " + book.getPageAmount());

        System.out.println();

        System.out.println("Автор книги: " + book.getAuhtor() + "\nИздатель: " + book.getPublisher() + "\nСтраниц: " + book.getPageAmount());
        System.out.println();
        System.out.println("Count: " + book.BOOK_COUNTER);

        book.setYearPublisher(1800);



    }

}