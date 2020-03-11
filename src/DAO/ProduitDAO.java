package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.Produit;

public class ProduitDAO implements IProduitDAO{


		
		@Override
		public int addProduit(Produit produit) {
			try {
				
				Session session= ConnexionDB.getInstance().getFactory().openSession();
				session.beginTransaction();
				session.saveOrUpdate(produit);
				session.getTransaction().commit();
				return 1;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
	}

		public List<Produit> listeProduit() {
			List<Produit> listep= new ArrayList<Produit>();
			try {
				
				Session session= ConnexionDB.getInstance().getFactory().openSession();
				session.beginTransaction();
				listep = session.createQuery("from Produit").list();
			    return listep;
				
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
		}}

}
