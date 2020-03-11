package DAO;

import org.hibernate.Session;

import Model.Produit;
import Model.User;

public interface IUserDAO {
	public int addUser(User user);
	public User findUser(User user1);

}
