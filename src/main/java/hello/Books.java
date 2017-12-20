package hello;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import java.util.*;
import java.lang.*;
import java.io.*;

//Class for the Book Controller
//A RestTemplate is used in here to get the results from the URL

public class Books
{

	public List<Book> getBooks()
	{
		RestTemplate restTemplate = new RestTemplate();
				
		ResponseEntity<Book[]> responseEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", Book[].class);
		Book[] objects = responseEntity.getBody();

		HttpStatus statusCode = responseEntity.getStatusCode();		
		if(statusCode == HttpStatus.OK)
		{
			return new ArrayList(Arrays.asList(objects));
		}
		else
		{
			return null;
		}		
	}
}
