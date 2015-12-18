package com.jbossresteasy.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class MsgApplication extends Application {
	
	private Set<Object> singletons = new HashSet<Object>();

	public MsgApplication() {
		singletons.add(new MsgServiceImpl());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
