package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Book Class, stores the individual results from the Rest Client.

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book
{
	private int userId;
	private int id;
	private String title;
	private String body;

	public String getBody()
	{
		return body;
	}
	
	public void setBody(String s)
	{
		this.body = s;
	}
	
	public int getUserId()
	{
		return userId;
	}
	
	public void setUserId(int n)
	{
		this.userId = n;
	}
	
	public int getId()
	{
		return id;
	}
	
	
	public void setId(int k)
	{
		this.id = k;
	}


	public String gettitle()
	{
		return title;
	}
	
	public void setTitle(String s)
	{
		this.title = s;
	}
	
  @Override
  public String toString() {
      return ("UserId: " + userId + " Id: " +  id + " Title: " + title + " Body: " + body);
  }
	
}
