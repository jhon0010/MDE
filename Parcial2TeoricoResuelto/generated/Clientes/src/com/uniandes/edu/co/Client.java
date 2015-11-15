package com.uniandes.edu.co;
			
public class Client 
{
 
	private int id; 
	private String password; 
	private String name;				
				
	public Client (int id,String password,String name)
	{
		this.id= id;
		this.password= password;
		this.name= name;
	}
		
 
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
 
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
 
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
}
