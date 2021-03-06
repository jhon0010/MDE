package edu.uniandes.co.jee.entity;

public class Aspirante 
{

	private String nombre;	
	private String profesion;	
	private int aniosExperiencia;	
	private int edad;	
	private String telefono;	
	private String imagen;	
	
	
	public Aspirante ()
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
	
	
	public String getProfesion()
	{
		return this.profesion;
	}
	
	public void setProfesion(String profesion)
	{
		this.profesion=profesion;
	}
	
	
	public int getAniosExperiencia()
	{
		return this.aniosExperiencia;
	}
	
	public void setAniosExperiencia(int aniosExperiencia)
	{
		this.aniosExperiencia=aniosExperiencia;
	}
	
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
	
	public String getTelefono()
	{
		return this.telefono;
	}
	
	public void setTelefono(String telefono)
	{
		this.telefono=telefono;
	}
	
	
	public String getImagen()
	{
		return this.imagen;
	}
	
	public void setImagen(String imagen)
	{
		this.imagen=imagen;
	}
	
	
	
	
	public  Aspirante (String nombreA,String profesionA,int aniosExperienciaA,int edadA,String telefonoA,String imagenA){
	
		nombre = nombreA;
		profesion = profesionA;
		aniosExperiencia = aniosExperienciaA;
		edad = edadA;
		telefono = telefonoA;
		imagen = imagenA;
		
		verificarInvariante( );
		
		
	}
	
	
	public String darNombre (){
	
		return nombre;
		
	}
	
	
	public String darProfesion (){
	
		return profesion;
		
	}
	
	
	public int darAniosExperiencia (){
	
		return aniosExperiencia;
		
	}
	
	
	public int darEdad (){
	
		return edad;
		
	}
	
	
	public String darTelefono (){
	
		return telefono;
		
	}
	
	
	public String darImagen (){
	
		return imagen;
		
	}
	
	
	public int compararPorNombre (Aspirante a){
	
		int resultado = nombre.compareToIgnoreCase( a.nombre );
		if( resultado > 0 )
		return 1;
		else if( resultado < 0 )
		return -1;
		else
		return 0;
		
	}
	
	
	public int compararPorProfesion (Aspirante a){
	
		int resultado = profesion.compareToIgnoreCase( a.darProfesion( ) );
		if( resultado > 0 )
		return 1;
		else if( resultado < 0 )
		return -1;
		else
		return 0;
		
	}
	
	
	public int compararPorAniosExperiencia (Aspirante a){
	
		if( aniosExperiencia == a.darAniosExperiencia( ) )
		return 0;
		else if( aniosExperiencia > a.darAniosExperiencia( ) )
		return 1;
		else
		return -1;
		
		
	}
	
	
	public int compararPorEdad (Aspirante a){
	
		if( edad == a.darEdad( ) )
		return 0;
		else if( edad > a.darEdad( ) )
		return 1;
		else
		return -1;
		
	}
	
	
	public String toString (){
	
		return nombre + " - " + profesion;
		
	}
	
	
	public void verificarInvariante (){
	
		assert ( nombre != null ) : "nombre no puede ser null";
		assert ( profesion.equals( ADMINISTRADOR ) || profesion.equals( INGENIERO_INDUSTRIAL ) || profesion.equals( CONTADOR ) || profesion.equals( ECONOMISTA ) ) : "La profesi�n debe ser uno de los valores v�lidos";
		assert ( aniosExperiencia > 0 ) : "aniosExperiencia no puede ser 0";
		assert ( edad > 0 ) : "edad no puede ser 0";
		assert ( telefono != null ) : "telefono no puede ser null";
		assert ( imagen != null ) : "imagen no puede ser null";
		
		
	}
	
	
	
	
}	
