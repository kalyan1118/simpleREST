package hello;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.lang.*;

//Problem6: Rest Endpoint Queries the external Rest API and displays the results
//Usage: curl  http://localhost:8080/books
@RestController
public class BookController{

		@RequestMapping(value = "/books", produces = {"application/json"})
		public @ResponseBody	List<Book> getAllBooks()
		{
			Books bnew = new Books();
			List<Book> result = bnew.getBooks();
			return result;
		}
}
