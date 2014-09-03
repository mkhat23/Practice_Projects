package com.mandeepk.randomyoutube;

import java.util.List;

import com.google.api.client.util.Lists;


public class MyUploads {

	
	private static Youtube youtube;
	
public static void main (String[]args){
	List<String> scropes = Lists.newArrayList("http://www.googleapis.com/auth/youtube.readonly");
	
	try{
		Credential credential = Auth.authorize(scopes, "myuploads");
	}
	}
}
