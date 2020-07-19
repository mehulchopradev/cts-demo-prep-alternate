import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    public String title;
    public Integer pages;
    public Float price;

    public Book(String title, Integer pages, Float price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public String toString() {
        return title;
    }
}

public class BookStreamOperations {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book 1", 900, 450f),
                new Book("Book 2", 560, 1000f),
                new Book("Book 3", 400, 600f)
        );

        System.out.println("The books whose price is greater than 500");
        System.out.println(getBooksByPriceGt(books, 500));
        System.out.println("The books whose price is less than 700, sorted in the descending order of pages");
        System.out.println(getBooksByPriceLtSortedByPage(books, 700));
        System.out.println("The books whose pages is more than 500, sorted in the descending order of price, with title uppercased");
        System.out.println(getBooksByPagesGtSortedByPriceTitleUpperCased(books, 500));
    }

    public static List<Book> getBooksByPriceGt(List<Book> books, float price) {
        /**
         * Filters the passed input list of books by selecting all the books whose price
         * is more than the passed price input.
         * Returns the filtered list of books.
         * Use the functional programming constructs.
         */
        
        // write your code here
    }

    public static List<Book> getBooksByPriceLtSortedByPage(List<Book> books, float price) {
        /**
         * Filters the passed input list of books by selecting all the books whose price
         * is less than the passed price input. Also sorts the final result in the descending order of pages of the book.
         * Returns the final list of books.
         * Use the functional programming constructs.
         */
    
        // write your code here
    }

    public static List<Book> getBooksByPagesGtSortedByPriceTitleUpperCased(List<Book> books, int pages) {
        /**
         * Filters the passed input list of books by selecting all the books whose pages
         * is greater than the passed pages input. Also sorts the final result in the descending order of price of the book.
         * Returns the final list of books with the title of each of the books capital cased.
         * Use the functional programming constructs.
         */
    
        // write your code here
    }
}
