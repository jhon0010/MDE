package com.uniandes.edu.co;
			
public class Producto 
{
 
	private String name; 
	private int id;				
				
	public Producto (String name,int id)
	{
		this.name= name;
		this.id= id;
	}
		
 
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
 
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
}
