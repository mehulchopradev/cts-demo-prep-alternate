import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStreamOperationsTest {

    @Test
    public void testGetBooksByPriceGt() {
        List<Book> books = Arrays.asList(
                new Book("Book 1", 900, 450f),
                new Book("Book 2", 560, 1000f),
                new Book("Book 3", 400, 600f)
        );

        List<Book> actual = BookStreamOperations.getBooksByPriceGt(books, 500);
        assertEquals(2, actual.size());
        assertEquals("Book 2", actual.get(0).title);
        assertEquals("Book 3", actual.get(1).title);

        actual = BookStreamOperations.getBooksByPriceGt(books, 1000);
        assertEquals(0, actual.size());
    }

    @Test
    public void testGetBooksByPriceLtSortedByPage() {
        List<Book> books = Arrays.asList(
                new Book("Book 1", 900, 450f),
                new Book("Book 2", 560, 1000f),
                new Book("Book 3", 400, 600f)
        );

        List<Book> actual = BookStreamOperations.getBooksByPriceLtSortedByPage(books, 700);
        assertEquals(2, actual.size());
        assertEquals("Book 1", actual.get(0).title);
        assertEquals("Book 3", actual.get(1).title);

        actual = BookStreamOperations.getBooksByPriceLtSortedByPage(books, 2000);
        assertEquals(3, actual.size());
        assertEquals("Book 1", actual.get(0).title);
        assertEquals("Book 2", actual.get(1).title);
        assertEquals("Book 3", actual.get(2).title);
    }

    @Test
    public void getBooksByPagesGtSortedByPriceTitleUpperCased() {
        List<Book> books = Arrays.asList(
                new Book("Book 1", 900, 450f),
                new Book("Book 2", 560, 1000f),
                new Book("Book 3", 400, 600f)
        );

        List<Book> actual = BookStreamOperations.getBooksByPagesGtSortedByPriceTitleUpperCased(books, 500);
        assertEquals(2, actual.size());
        assertEquals("BOOK 2", actual.get(0).title);
        assertEquals("BOOK 1", actual.get(1).title);

        actual = BookStreamOperations.getBooksByPagesGtSortedByPriceTitleUpperCased(books, 1000);
        assertEquals(0, actual.size());
    }
}
