package com.fuso.enterprise.ipt.srv.server.util;

import java.io.Serializable;

public class ResponseWrapper implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int httpResponseRet;
	private String error="";
	private Object body;
	
	public ResponseWrapper() {
	}

	/**
	 * @param body
	 */
	public ResponseWrapper(Object body) 
	{
		this.body = body;
	}
	public ResponseWrapper(int retCode, Object body) 
	{
		this.httpResponseRet = retCode;
		this.body = body;
	}
	
	/**
	 * @param ret
	 * @param error
	 * @param body
	 */
	public ResponseWrapper(int ret, String error, Object body) {
		this.httpResponseRet = ret;
		this.error = error;
		this.body = body;
	}

	/**
	 * @param ret
	 * @param error
	 */
	public ResponseWrapper(int ret, String error) {
		this.httpResponseRet = ret;
		this.error = error;
	}


	public int getHttpResponseRet() {
		return httpResponseRet;
	}

	public String getError() {
		return error;
	}

	public Object getBody() {
		return body;
	}

}
