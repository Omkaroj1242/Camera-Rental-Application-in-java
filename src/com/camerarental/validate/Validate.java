package com.camerarental.validate;

import com.camerarental.main.Credentials;

public class Validate {
	
	public boolean validateUser(String username, String password) {
		
		Credentials credentials = new Credentials();
		
		if(username.equals(credentials.getUsername()) && password.equals(credentials.getPassword())) {
			return true;
		}else {
			return false;
		}
	}
	
}
