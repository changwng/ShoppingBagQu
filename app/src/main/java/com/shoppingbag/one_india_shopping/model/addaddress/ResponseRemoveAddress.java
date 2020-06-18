package com.shoppingbag.one_india_shopping.model.addaddress;

import com.google.gson.annotations.SerializedName;

public class ResponseRemoveAddress{

	@SerializedName("response")
	private String response;

	@SerializedName("message")
	private String message;

	public void setResponse(String response){
		this.response = response;
	}

	public String getResponse(){
		return response;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ResponseRemoveAddress{" + 
			"response = '" + response + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}