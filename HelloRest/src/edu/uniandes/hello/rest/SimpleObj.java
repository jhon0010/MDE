package edu.uniandes.hello.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SimpleObj {
	
	private String id;
	private String name;
	
	public SimpleObj(){
	}
	
	public SimpleObj(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
