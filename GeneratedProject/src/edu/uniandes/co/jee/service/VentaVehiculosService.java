package edu.uniandes.co.jee.service;

public class VentaVehiculosService 
{

	@GET
	@Produces({"application/json"})
	@Path
	("VentaVehiculos")
	public void VentaVehiculos (){
	
		vehiculos = new ArrayList( );
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("darVehiculos")
	public ArrayList<E> darVehiculos (){
	
		ArrayList copiaLista = new ArrayList( vehiculos );
		return copiaLista;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorMarca")
	public void ordenarPorMarca (){
	
		int inicial;
		
		for( inicial = 0; inicial < vehiculos.size( ); inicial++ )
		{
			for( int i = vehiculos.size( ) - 1; i > inicial; i-- )
			{
				Vehiculo p2 = ( Vehiculo )vehiculos.get( i );
				Vehiculo p1 = ( Vehiculo )vehiculos.get( i - 1 );
				
				if( p1.compararPorMarca( p2 ) > 0 )
				{
					vehiculos.set( i, p1 );
					vehiculos.set( i - 1, p2 );
				}
			}
		}
		verificarInvariante( );
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorCilindrada")
	public void ordenarPorCilindrada (){
	
		int inicial;
		
		// En cada paso se sabe que:
		// 1. Las posiciones antes de vehículos[inicial] están ordenadas
		// En cada paso lo que se hace es encontrar en qué posición entre vehículos[0] y vehículos[inicial] debería
		// estar el vehículo que en este momento se encuentra en vehículos[inicial]
		
		for( inicial = 1; inicial < vehiculos.size( ); inicial++ )
		{
			Vehiculo insertado = ( Vehiculo )vehiculos.get( inicial );
			
			boolean termine = false;
			int i = inicial - 1;
			
			while( !termine )
			{
				// Si encuentra una cilindrada mayor, entonces hay que intercambiarlos
				Vehiculo vehículoPosicion = ( Vehiculo )vehiculos.get( i );
				
				if( vehículoPosicion.compararPorCilindrada( insertado ) > 0 )
				{
					vehiculos.set( i, insertado );
					vehiculos.set( i + 1, vehículoPosicion );
					i--;
				}
				// Si se encuentra un cilindrada igual o menor entonces ya se encontró la posición
				else
				{
					termine = true;
				}
				
				// Si ya se llegó al principio de la lista no hay nada más que hacer
				if( i < 0 )
				{
					termine = true;
				}
			}
		}
		verificarInvariante( );
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorAnio")
	public void ordenarPorAnio (){
	
		int inicial;
		
		// En cada paso se sabe que:
		// 1. Todos los valores antes de vehículos[inicial] están ordenados
		// 2. No hay ningún valor después de vehículos[inicial-1] que sea menor que vehículos[inicial-1]
		// En cada paso se busca el menor entre vehículos[inicial] y vehículos[final] y se ubica en vehículos[inicial]
		
		for( inicial = 0; inicial < vehiculos.size( ); inicial++ )
		{
			int posicionMenor = inicial;
			Vehiculo vehículoMenor = ( Vehiculo )vehiculos.get( inicial );
			
			for( int i = inicial + 1; i < vehiculos.size( ); i++ )
			{
				Vehiculo vehículoPosicion = ( Vehiculo )vehiculos.get( i );
				
				// El vehículo de la posición actual es menor que el menor encontrado hasta el momento
				if( vehículoPosicion.compararPorAnio( vehículoMenor ) < 0 )
				{
					vehículoMenor = vehículoPosicion;
					posicionMenor = i;
				}
			}
			
			if( posicionMenor != inicial )
			{
				Vehiculo temp = ( Vehiculo )vehiculos.get( inicial );
				vehiculos.set( inicial, vehículoMenor );
				vehiculos.set( posicionMenor, temp );
			}
			
		}
		verificarInvariante( );
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarVehiculo")
	public int buscarVehiculo (String modelo,int anio){
	
		int posicion = -1;
		boolean termine = false;
		
		for( int i = 0; i < vehiculos.size( ) && !termine; i++ )
		{
			Vehiculo vehiculoPosicion = ( Vehiculo )vehiculos.get( i );
			String modeloVehiculo = vehiculoPosicion.darModelo( );
			
			// Los modelos son iguales
			if( modeloVehiculo.equals( modelo ) && vehiculoPosicion.darAnio( ) == anio )
			{
				posicion = i;
				termine = true;
			}
		}
		
		return posicion;
		
	}
	
	
	@POST
	@Path
	("agregarVehiculo")
	public boolean agregarVehiculo (String modeloV,String marcaV,String imagenP,String tipoV,int anioV,int cilindradaV,int ejesV,int valor){
	
		boolean agregado = false;
		int vehículoBuscado = buscarVehiculo( modeloV, anioV );
		if( vehículoBuscado == -1 )
		{
			Vehiculo nuevovehículo = new Vehiculo( modeloV, marcaV, imagenP, tipoV, anioV, cilindradaV, ejesV, valor );
			vehiculos.add( nuevovehículo );
			agregado = true;
			verificarInvariante( );
		}
		
		return agregado;
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("comprarVehiculo")
	public boolean comprarVehiculo (String modelo,int anio){
	
		boolean comprado = false;
		
		for( int cont = 0; cont < vehiculos.size( ) && !comprado; cont++ )
		{
			Vehiculo v = ( Vehiculo )vehiculos.get( cont );
			
			if( v.darAnio( ) == anio && v.darModelo( ).equalsIgnoreCase( modelo ) )
			{
				vehiculos.remove( cont );
				comprado = true;
			}
		}
		
		return comprado;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarVehiculoMasAntiguo")
	public int buscarVehiculoMasAntiguo (){
	
		int posicion = -1;
		
		if( vehiculos.size( ) > 0 )
		{
			Vehiculo vMasAntiguo = ( Vehiculo )vehiculos.get( 0 );
			posicion = 0;
			for( int i = 1; i < vehiculos.size( ); i++ )
			{
				Vehiculo vPosicion = ( Vehiculo )vehiculos.get( i );
				
				if( vMasAntiguo.compararPorAnio( vPosicion ) == 1 )
				{
					posicion = i;
					vMasAntiguo = vPosicion;
				}
			}
		}
		return posicion;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarVehiculoMasEconomico")
	public int buscarVehiculoMasEconomico (){
	
		int posicion = -1;
		
		if( vehiculos.size( ) > 0 )
		{
			Vehiculo vMasEconomico = ( Vehiculo )vehiculos.get( 0 );
			posicion = 0;
			for( int i = 1; i < vehiculos.size( ); i++ )
			{
				Vehiculo vPosicion = ( Vehiculo )vehiculos.get( i );
				
				if( vMasEconomico.compararPorValor( vPosicion ) == 1 )
				{
					posicion = i;
					vMasEconomico = vPosicion;
				}
			}
		}
		return posicion;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarVehiculoMasPotente")
	public int buscarVehiculoMasPotente (){
	
		int posicion = -1;
		
		if( vehiculos.size( ) > 0 )
		{
			Vehiculo vMasPotente = ( Vehiculo )vehiculos.get( 0 );
			posicion = 0;
			for( int i = 1; i < vehiculos.size( ); i++ )
			{
				Vehiculo vPosicion = ( Vehiculo )vehiculos.get( i );
				
				if( vMasPotente.compararPorCilindrada( vPosicion ) == -1 )
				{
					posicion = i;
					vMasPotente = vPosicion;
				}
			}
		}
		return posicion;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("disminuirPrecio")
	public int disminuirPrecio (int valor){
	
		int disminuidos = 0;
		
		for( int cont = 0; cont < vehiculos.size( ); cont++ )
		{
			Vehiculo v = ( Vehiculo )vehiculos.get( cont );
			
			if( v.darValor( ) > valor )
			{
				int nValor = ( int ) ( v.darValor( ) * 0.9 );
				
				if( nValor > 0 )
				{
					v.cambiarValor( nValor );
					disminuidos++;
				}
			}
		}
		return disminuidos;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("verificarInvariante")
	public void verificarInvariante (){
	
		assert ( vehiculos != null ) : "La lista de vehículos no debe ser null";
		assert ( !buscarVehiculosModeloYAnioRepetido( ) ) : "Hay dos vehículos del mismo modelo y año";
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarVehiculosModeloYAnioRepetido")
	public boolean buscarVehiculosModeloYAnioRepetido (){
	
		for( int i = 0; i < vehiculos.size( ); i++ )
		{
			Vehiculo pi = ( Vehiculo )vehiculos.get( i );
			for( int j = 0; j < vehiculos.size( ); j++ )
			{
				if( i != j )
				{
					Vehiculo pj = ( Vehiculo )vehiculos.get( j );
					if( pj.darModelo( ).equals( pi.darModelo( ) ) && pj.darAnio( ) == pi.darAnio( ) )
					{
						return true;
					}
				}
			}
		}
		return false;
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("metodo1")
	public String metodo1 (){
	
		return "respuesta1";
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("metodo2")
	public String metodo2 (){
	
		return "respuesta2";
		
	}
	
	
}	
