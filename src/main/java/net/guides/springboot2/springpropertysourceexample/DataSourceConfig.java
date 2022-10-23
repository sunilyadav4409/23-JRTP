package net.guides.springboot2.springpropertysourceexample;

public class DataSourceConfig {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	@Override
	public String toString()
	{
		return "DataSourceConfig [driver=" + driver + ", url=" + url + ", username=" + username + "]";
	}
	public String getDriver()
	{
		return driver;
	}
	public void setDriver(String driver)
	{
		this.driver = driver;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}

	public void show(){
	System.out.println("this is sunil shows");
	}
	public void display(){
	System.out.println("some more lines are added in this method to test stash command");
	}

	public String nameByAddress()
	{
	if (s.equals("sunil")
	{System.out.println("sunil");
	}}
}
