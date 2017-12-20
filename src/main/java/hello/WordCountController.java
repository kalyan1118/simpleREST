package hello;

import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
import java.lang.*;

//Question 2: Rest Endpoint gets a JSON object with paragraph  and return with Unique Words in Sorted Order

//Usage : curl -X POST http://localhost:8080/wordCount -d '{"text":"a hello world world w"}' -H "Content-Type: application/json"

@RestController
public class WordCountController{
	
	@RequestMapping(value = "/wordCount",method=RequestMethod.POST)
	public @ResponseBody List<WordCount> processString(@RequestBody WordRequest input) throws Exception
	{
		WordProcessor words = new WordProcessor(input.getText());
		
		return words.getUniqueWords();
	}
	
}
