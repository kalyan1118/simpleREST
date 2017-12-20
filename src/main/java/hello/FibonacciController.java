package hello;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.lang.*;


//Problem3: Rest Endpoint returning the first n fibonacci numbers
//Usage: curl http://localhost:8080/fibonacci?n=10

@RestController
public class FibonacciController {
				
		@RequestMapping("/fibonacci")
		public Fibonacci  fibonacci(@RequestParam(value = "n", defaultValue="10") Long i)
		{
				Fibonacci gf = new Fibonacci(i);
				return gf;
		}
}
