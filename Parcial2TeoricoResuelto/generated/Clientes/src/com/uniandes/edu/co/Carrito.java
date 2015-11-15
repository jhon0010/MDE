package com.uniandes.edu.co;
			
public class Carrito 
{
 
	private int id; 
	private String name; 
	private int clientId;				
				
	public Carrito (int id,String name,int clientId)
	{
		this.id= id;
		this.name= name;
		this.clientId= clientId;
	}
		
 
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
 
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
 
	public int getClientId()
	{
		return this.clientId;
	}
	
	public void setClientId(int clientId)
	{
		this.clientId=clientId;
	}
	
}
