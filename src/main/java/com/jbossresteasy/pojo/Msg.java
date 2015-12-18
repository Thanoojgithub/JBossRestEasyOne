package com.jbossresteasy.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "msg")
public class Msg {

	private String name;
	private String greeting;

	public Msg() {
	}

	public Msg(String name, String greeting) {
		super();
		this.name = name;
		this.greeting = greeting;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String toString() {
		return "Msg [name=" + name + ", greeting=" + greeting + "]";
	}
}
