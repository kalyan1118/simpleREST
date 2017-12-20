package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

//WordCount Class:Stores final Word and Count Attribute

public class WordCount
{
	private  String word;
	private long count;
	
	public WordCount(String s, long k)
	{
		this.word = s;
		this.count = k;
	}
	
	public void setWord(String s)
	{
		this.word = s;
	}
	
	public String getWord()
	{
		return word;
	}
	
	public void setCount(long n)
	{
		this.count = n;
	}
	
	public long getCount()
	{
		return count;
	}
  
	@Override
  public String toString() 
	{		
			return ("Word: " + word + " " + "Count: " + count);
	}
}
