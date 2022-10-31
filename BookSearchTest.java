import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;


public class BookSearchTest  {

    private BookService service;
  
    @Before
    public void init() {
      service = new MockBookService();
    }
  
    @Test
    public void testGetBook() {
      BookSearch bs = new BookSearch(service);
      String titulo = bs.getBook(1234).getTitulo();
      assertEquals("Eng Soft Moderna", titulo);
    }  
}