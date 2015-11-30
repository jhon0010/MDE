package edu.uniandes.co.jee.ejb;

public class ExposicionPerrosEJB 
{

	public void ExposicionPerros (){
	
		perros = new ArrayList( );
		
	}
	
	
	public ArrayList<E> darPerros (){
	
		ArrayList copiaLista = new ArrayList( perros );
		return copiaLista;
		
	}
	
	
	public void ordenarPorRaza (){
	
		for( int i = perros.size( ); i > 0; i-- )
		{
			for( int j = 0; j < i - 1; j++ )
			{
				Perro p1 = ( Perro )perros.get( j );
				Perro p2 = ( Perro )perros.get( j + 1 );
				
				// Si es necesario se deben intercambiar p1 y p2
				if( p1.compararPorRaza( p2 ) > 0 )
				{
					perros.set( j, p2 );
					perros.set( j + 1, p1 );
				}
			}
		}
		verificarInvariante( );
		
	}
	
	
	public void ordenarPorNombre (){
	
		for( int i = perros.size( ); i > 0; i-- )
		{
			for( int j = 0; j < i - 1; j++ )
			{
				Perro p1 = ( Perro )perros.get( j );
				Perro p2 = ( Perro )perros.get( j + 1 );
				
				// Si es necesario se deben intercambiar p1 y p2
				if( p1.compararPorNombre( p2 ) > 0 )
				{
					perros.set( j, p2 );
					perros.set( j + 1, p1 );
				}
			}
		}
		verificarInvariante( );
		
	}
	
	
	public void ordenarPorPuntos (){
	
		for( int i = 1; i < perros.size( ); i++ )
		{
			Perro porInsertar = ( Perro )perros.get( i );
			boolean termino = false;
			for( int j = i; j > 0 && !termino; j-- )
			{
				Perro actual = ( Perro )perros.get( j - 1 );
				if( actual.compararPorPuntos( porInsertar ) > 0 )
				{
					perros.set( j, actual );
					perros.set( j - 1, porInsertar );
				}
				else
				termino = true;
			}
		}
		verificarInvariante( );
		
	}
	
	
	public void ordenarPorEdad (){
	
		int inicial;
		
		// En cada iteraci?n se sabe que:
		// 1. Todos los valores antes de perros[inicial] est?n ordenados por edad
		// 2. No hay ning?n valor despu?s de perros[inicial-1] que sea menor que perros[inicial-1]
		// En cada iteraci?n se busca el menor entre perros[inicial] y perros[final] y se ubica en perros[inicial]
		
		for( inicial = 0; inicial < perros.size( ); inicial++ )
		{
			int posicionMenor = inicial;
			Perro perroMenor = ( Perro )perros.get( inicial );
			
			// Buscar el perro de menor edad entre inicial y final
			for( int i = inicial + 1; i < perros.size( ); i++ )
			{
				Perro perroPosicion = ( Perro )perros.get( i );
				
				// El perro de la posici?n actual es menor que el menor encontrado hasta el momento
				if( perroPosicion.compararPorEdad( perroMenor ) < 0 )
				{
					perroMenor = perroPosicion;
					posicionMenor = i;
				}
			}
			
			if( posicionMenor != inicial )
			{
				Perro temp = ( Perro )perros.get( inicial );
				perros.set( inicial, perroMenor );
				perros.set( posicionMenor, temp );
			}
			
		}
		verificarInvariante( );
		
	}
	
	
	public int buscarPerro (String nombre){
	
		int posicion = -1;
		boolean termine = false;
		
		for( int i = 0; i < perros.size( ) && !termine; i++ )
		{
			Perro perroPosicion = ( Perro )perros.get( i );
			String nombrePerro = perroPosicion.darNombre( );
			
			// Los nombres son iguales
			if( nombrePerro.equalsIgnoreCase( nombre ) )
			{
				posicion = i;
				termine = true;
			}
		}
		
		return posicion;
		
	}
	
	
	public int buscarBinarioPorNombre (String nombre){
	
		int posicion = -1;
		int inicio = 0;
		int fin = perros.size( ) - 1;
		Perro aBuscar = new Perro( nombre, "", "", 1, 1 );
		while( inicio <= fin && posicion == -1 )
		{
			int medio = ( inicio + fin ) / 2;
			Perro mitad = ( Perro )perros.get( medio );
			if( mitad.compararPorNombre( aBuscar ) == 0 )
			{
				posicion = medio;
			}
			else if( mitad.compararPorNombre( aBuscar ) > 0 )
			{
				fin = medio - 1;
			}
			else
			{
				inicio = medio + 1;
			}
		}
		return posicion;
		
	}
	
	
	public boolean agregarPerro (String nombreP,String razaP,String imagenP,int puntosP,int edadP){
	
		int perroBuscado = buscarPerro( nombreP );
		boolean agregado = false;
		if( perroBuscado == -1 )
		{
			Perro nuevoPerro = new Perro( nombreP, razaP, imagenP, puntosP, edadP );
			perros.add( nuevoPerro );
			agregado = true;
		}
		
		verificarInvariante( );
		
		return agregado;
		
	}
	
	
	public int buscarPerroMayorPuntaje (){
	
		int posicion = -1;
		
		if( perros.size( ) > 0 )
		{
			Perro pMayorPuntaje = ( Perro )perros.get( 0 );
			posicion = 0;
			for( int i = 1; i < perros.size( ); i++ )
			{
				Perro perroPosicion = ( Perro )perros.get( i );
				
				// Los nombres son iguales
				if( pMayorPuntaje.compararPorPuntos( perroPosicion ) == -1 )
				{
					posicion = i;
					pMayorPuntaje = perroPosicion;
				}
			}
		}
		
		return posicion;
		
	}
	
	
	public int buscarPerroMenorPuntaje (){
	
		int posicion = -1;
		
		if( perros.size( ) > 0 )
		{
			Perro pMenorPuntaje = ( Perro )perros.get( 0 );
			posicion = 0;
			for( int i = 1; i < perros.size( ); i++ )
			{
				Perro perroPosicion = ( Perro )perros.get( i );
				
				// Los nombres son iguales
				if( pMenorPuntaje.compararPorPuntos( perroPosicion ) == 1 )
				{
					posicion = i;
					pMenorPuntaje = perroPosicion;
				}
			}
		}
		
		return posicion;
		
	}
	
	
	public int buscarPerroMayorEdad (){
	
		int posicion = -1;
		
		if( perros.size( ) > 0 )
		{
			Perro pMayorEdad = ( Perro )perros.get( 0 );
			posicion = 0;
			for( int i = 1; i < perros.size( ); i++ )
			{
				Perro perroPosicion = ( Perro )perros.get( i );
				
				// Los nombres son iguales
				if( pMayorEdad.compararPorEdad( perroPosicion ) == -1 )
				{
					posicion = i;
					pMayorEdad = perroPosicion;
				}
			}
		}
		
		return posicion;
		
	}
	
	
	public void verificarInvariante (){
	
		assert ( perros != null ) : "La lista de perros no debe ser null";
		assert ( !buscarPerrosConNombresRepetidos( ) ) : "Hay dos perros con el mismo nombre";
		
	}
	
	
	public boolean buscarPerrosConNombresRepetidos (){
	
		for( int i = 0; i < perros.size( ); i++ )
		{
			Perro perroI = ( Perro )perros.get( i );
			for( int j = 0; j < perros.size( ); j++ )
			{
				if( i != j )
				{
					Perro perroJ = ( Perro )perros.get( j );
					if( perroJ.darNombre( ).equals( perroI.darNombre( ) ) )
					{
						return true;
					}
				}
			}
		}
		return false;
		
	}
	
	
	public String metodo1 (){
	
		return "respuesta1";
		
	}
	
	
	public String metodo2 (){
	
		return "respuesta2";
		
	}
	
	
}	