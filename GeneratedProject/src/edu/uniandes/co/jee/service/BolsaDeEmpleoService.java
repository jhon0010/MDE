package edu.uniandes.co.jee.service;

import edu.uniandes.co.jee.ejb.BolsaDeEmpleoEJB;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Stateless
@Path("bolsaDeEmpleo")			
public class BolsaDeEmpleoService 
{

	@EJB
	BolsaDeEmpleoEJB BolsaDeEmpleoEJB;
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("BolsaDeEmpleo")
	public  void BolsaDeEmpleo (){
	
		BolsaDeEmpleoEJB.BolsaDeEmpleo();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("darAspirantes")
	public  ArrayList<E> darAspirantes (){
	
	
		return BolsaDeEmpleoEJB.darAspirantes();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorNombre")
	public  list  ordenarPorNombre (){
	
		BolsaDeEmpleoEJB.ordenarPorNombre();
		return BolsaDeEmpleoEJB.darAspirantes();		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorEdad")
	public  list  ordenarPorEdad (){
	
		BolsaDeEmpleoEJB.ordenarPorEdad();
		return BolsaDeEmpleoEJB.darAspirantes();		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorProfesion")
	public  list  ordenarPorProfesion (){
	
		BolsaDeEmpleoEJB.ordenarPorProfesion();
		return BolsaDeEmpleoEJB.darAspirantes();		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("ordenarPorAniosDeExperiencia")
	public  list  ordenarPorAniosDeExperiencia (){
	
		BolsaDeEmpleoEJB.ordenarPorAniosDeExperiencia();
		return BolsaDeEmpleoEJB.darAspirantes();		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarAspirante")
	public  int buscarAspirante (String nombre){
	
	
		return BolsaDeEmpleoEJB.buscarAspirante(nombre);
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarBinarioPorNombre")
	public  int buscarBinarioPorNombre (String nombre){
	
	
		return BolsaDeEmpleoEJB.buscarBinarioPorNombre(nombre);
		
		
	}
	
	
	@POST
	@Path
	("agregarAspirante")
	public  boolean agregarAspirante (String nombreA,String profesionA,int aniosExperienciaA,int edadA,String telefonoA,String imagenA){
	
	
		return BolsaDeEmpleoEJB.agregarAspirante(nombreA,profesionA,aniosExperienciaA,edadA,telefonoA,imagenA);
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarAspiranteMasJoven")
	public  int buscarAspiranteMasJoven (){
	
	
		return BolsaDeEmpleoEJB.buscarAspiranteMasJoven();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarAspiranteMayorEdad")
	public  int buscarAspiranteMayorEdad (){
	
	
		return BolsaDeEmpleoEJB.buscarAspiranteMayorEdad();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarAspiranteMayorExperiencia")
	public  int buscarAspiranteMayorExperiencia (){
	
	
		return BolsaDeEmpleoEJB.buscarAspiranteMayorExperiencia();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("contratarAspirante")
	public  boolean contratarAspirante (String nombre){
	
	
		return BolsaDeEmpleoEJB.contratarAspirante(nombre);
		
		
	}
	
	
	@DELETE
	@Path
	("eliminarAspirantesPorExperiencia")
	public  int eliminarAspirantesPorExperiencia (int aniosExperiencia){
	
	
		return BolsaDeEmpleoEJB.eliminarAspirantesPorExperiencia(aniosExperiencia);
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("verificarInvariante")
	public  void verificarInvariante (){
	
		BolsaDeEmpleoEJB.verificarInvariante();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("buscarAspirantesConNombresRepetidos")
	public  boolean buscarAspirantesConNombresRepetidos (){
	
	
		return BolsaDeEmpleoEJB.buscarAspirantesConNombresRepetidos();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("metodo1")
	public  String metodo1 (){
	
	
		return BolsaDeEmpleoEJB.metodo1();
		
		
	}
	
	
	@GET
	@Produces({"application/json"})
	@Path
	("metodo2")
	public  String metodo2 (){
	
	
		return BolsaDeEmpleoEJB.metodo2();
		
		
	}
	
	
}	
