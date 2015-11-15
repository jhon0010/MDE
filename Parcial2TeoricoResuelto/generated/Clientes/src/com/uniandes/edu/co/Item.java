package com.uniandes.edu.co;
			
public class Item 
{
 
	private int id; 
	private int cantidad; 
	private String name; 
	private int productoId;				
				
	public Item (int id,int cantidad,String name,int productoId)
	{
		this.id= id;
		this.cantidad= cantidad;
		this.name= name;
		this.productoId= productoId;
	}
		
 
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
 
	public int getCantidad()
	{
		return this.cantidad;
	}
	
	public void setCantidad(int cantidad)
	{
		this.cantidad=cantidad;
	}
	
 
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
 
	public int getProductoId()
	{
		return this.productoId;
	}
	
	public void setProductoId(int productoId)
	{
		this.productoId=productoId;
	}
	
}
