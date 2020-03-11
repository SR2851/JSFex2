package DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import Model.User;

public class UserDAO implements IUserDAO {

	@Override
	public int addUser(User user) {
		try {
			Session session =  ConnexionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
			return 1;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public User findUser(User user1) {
		try {
			Session session =  ConnexionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			Query query = session.createQuery("from User where userName= :userName AND password= :password");
			query.setParameter("userName", user1.getUserName());
			query.setParameter("password", user1.getPassword());
			User user=(User)query.uniqueResult();
			return user;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

	

}
