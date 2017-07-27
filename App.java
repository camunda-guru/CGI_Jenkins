package com.cgi.travel.TravelDemo;

import com.cgi.travel.model.User;

/**
 * Login Validation!
 *
 */
public class App 
{
    
	public boolean validateUser(User user)
	{
		boolean status=false;
		if((user.getUserId().length()>0)&&(user.getPassword().length()>4))
		{
			status=true;
		}
		return status;
	}
	
}
