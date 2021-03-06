package edu.uniandes.hello.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("/test")
@ApplicationPath("/hello")
public class HelloRest extends Application {

	//localhost:8080/HelloRest/hello/test/sayHello
	@Path("sayHello")
	@GET
	public String sayHello(){
		return "Hello world";
	}
	
	@Path("echoMsj")
	@GET
	public String echoMsj(@QueryParam("msj") String msj){
		return msj;
	}
	
	@Path("obj")
	@GET
	//@Produces(MediaType.APPLICATION_XHTML_XML)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public SimpleObj obj(){
		return new SimpleObj("1", "Jhon");
	}
}
