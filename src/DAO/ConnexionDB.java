package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnexionDB {
 private  SessionFactory factory=null ;
 private  Session session;
 private static ConnexionDB instance=null;
 
 
 

public ConnexionDB() {
	super();
}

public SessionFactory getFactory(){
	 if(factory==null) {
		 factory = new Configuration().configure().buildSessionFactory();
	 }
	 return factory;
 }
 
 public Session getSession() {
	 if(session==null) {
		 session = factory.openSession();
	 }
	 return session;
 }
 
 public static ConnexionDB getInstance() {
	 if(instance==null) {
		 instance = new ConnexionDB();
	 }
	 return instance;
 }
}
