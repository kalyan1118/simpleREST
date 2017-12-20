package hello;

import java.lang.*;
import java.util.*;

//Custom Comparator for Word Count.

public class WordCountComparator implements Comparator<WordCount>
{
	public int compare(WordCount w1, WordCount w2)
	{
		return (w1.getWord()).compareTo(w2.getWord());
	}
}
