package edu.uniandes.hello.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class RestClient {
	
	public void call(){
		
		Client client = ClientBuilder.newClient();
		 SimpleObj o = client.target("http://localhost:8080/HelloRest/hello/test/obj").request().get(SimpleObj.class);
		 
		 System.out.println(o);
	}
}