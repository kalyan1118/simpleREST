package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import java.util.*;
import com.fasterxml.jackson.*;

//Class for WordCount Controller

public class WordProcessor
{
	private String param;
	
	public WordProcessor(String js)
	{
		this.param = js;
	}
	
	//Input String is processed in this function.
	//Tokenized into words by splitting based on Spaces/White Space Characters
	//Each word is stored into a HashMap , by ignoring the case, so that "hello" will be same as "Hello"
	//Some additional cases which need to be implemented
	//@Todo: Post tokenizing these words should be trimmed of special characters at the beginning and the end: 
	//@Todo: Handle Plurals
	
	public List<WordCount> getUniqueWords()
	{
		HashMap<String,Long> map = new HashMap<String,Long>();
		
		String[]words = param.split("\\s+");
		
		for(int i=0; i < words.length; ++i)
		{
			String key = words[i].toLowerCase();
			
			if(map.get(key) == null)
			{
				map.put(key,(long)0);
			}
			map.put(key,map.get(key)+1);
		}
		
		ArrayList<WordCount> result = new ArrayList<WordCount>();
		
		for(String s: map.keySet())
		{
			result.add(new WordCount(s,map.get(s)));
		}
		
		Collections.sort(result,new WordCountComparator());
		
		return result;
	}
}
