package edu.uniandes.co.jee.entity;

public class Perro 
{

	private String nombre;	
	private String raza;	
	private String imagen;	
	private int puntos;	
	private int edad;	
	
	
	public Perro ()
	{
	
	}
	
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	
	public String getRaza()
	{
		return this.raza;
	}
	
	public void setRaza(String raza)
	{
		this.raza=raza;
	}
	
	
	public String getImagen()
	{
		return this.imagen;
	}
	
	public void setImagen(String imagen)
	{
		this.imagen=imagen;
	}
	
	
	public int getPuntos()
	{
		return this.puntos;
	}
	
	public void setPuntos(int puntos)
	{
		this.puntos=puntos;
	}
	
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
	
}	
