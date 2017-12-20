package hello;

//Class for Fibonacci Controller


public class Fibonacci
{
	private long n;

	public Fibonacci(Long s)
	{
		this.n = s;
	}

	public Long[] getNFibonacci()
	{
		Long[]result = new Long[(int)n];

		for(int i=0; i < result.length; ++i)
		{
			result[i] = getNthFib((long)i+1);
		}
		return result;
	}

	//Recursive function for getting n'th Fibonacci
  //Assumption: First two elements of the Fibonacci series are chosen to 1 and 1 (1,1,2,3,5...)
	//Some implementations chose the first element of Fibonacci sequence to be 0 (0,1,1,2,3,5...)

	public Long getNthFib(Long n)
	{
		if(n <= 0)
		{
			return 0L;
		}
		if(n == 1)
		{
			return 1L;
		}
		return  getNthFib(n-1) + getNthFib(n-2);
	}

}
