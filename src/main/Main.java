package main;

import DAO.IUserDAO;
import DAO.UserDAO;
import Model.User;

public class Main {

	public static void main(String[] args) {

User user=new User("Samuel Rosillette", "252525");
IUserDAO daoU=new UserDAO();
if(daoU.addUser(user)==1) {
	System.out.println("succes");
}
else{System.out.println("fail");
	}

if(daoU.findUser(user)==null) {
	System.out.println(false);
}
else{System.out.println(daoU.findUser(user));
	}







	}
	
	
	

}
