package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.Marque;

public class MarqueDAO implements IMarqueDAO{
	
	
	@Override
	public int addMarque(Marque marque) {
		try {
			
			Session session= ConnexionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(marque);
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}}

	@Override
	public List<Marque> listeMarque() {
		List<Marque> listem= new ArrayList<Marque>();
		try {
			
			Session session= ConnexionDB.getInstance().getFactory().openSession();
			session.beginTransaction();
			listem=session.createQuery("from Marque").list();
			
			
			return listem;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
	}}
}
