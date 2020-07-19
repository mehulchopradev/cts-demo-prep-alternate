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
        return books.stream()
                .filter(book -> book.price > price)
                .collect(Collectors.toList());
    }

    public static List<Book> getBooksByPriceLtSortedByPage(List<Book> books, float price) {
        return books.stream()
                .filter(book -> book.price < price)
                .sorted((b1, b2) -> b2.pages.compareTo(b1.pages))
                .collect(Collectors.toList());
    }

    public static List<Book> getBooksByPagesGtSortedByPriceTitleUpperCased(List<Book> books, int pages) {
        return books.stream()
                .filter(book -> book.pages > pages)
                .sorted((b1, b2) -> b2.price.compareTo(b1.price))
                .map(book -> new Book(book.title.toUpperCase(), book.pages, book.price))
                .collect(Collectors.toList());
    }
}
