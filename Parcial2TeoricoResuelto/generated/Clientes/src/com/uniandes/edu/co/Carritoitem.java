package com.uniandes.edu.co;
			
public class Carritoitem 
{
 
	private int carritoId; 
	private int itemId;				
				
	public Carritoitem (int carritoId,int itemId)
	{
		this.carritoId= carritoId;
		this.itemId= itemId;
	}
		
 
	public int getCarritoId()
	{
		return this.carritoId;
	}
	
	public void setCarritoId(int carritoId)
	{
		this.carritoId=carritoId;
	}
	
 
	public int getItemId()
	{
		return this.itemId;
	}
	
	public void setItemId(int itemId)
	{
		this.itemId=itemId;
	}
	
}
