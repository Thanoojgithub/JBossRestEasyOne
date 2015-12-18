package com.jbossresteasy.service;

import javax.ws.rs.core.Response;

import com.jbossresteasy.pojo.Msg;

public class MsgServiceImpl implements MsgService {

	public Response printMessage(String name, String msgStr) {
		System.out.println("MsgServiceImpl.printMessage()");
		return Response.status(200).entity(new Msg(name, msgStr)).build();
	}

}
