package Model;


import java.util.List;

import javax.faces.bean.ManagedBean;

import DAO.IMarqueDAO;
import DAO.IProduitDAO;
import DAO.MarqueDAO;
import DAO.ProduitDAO;

@ManagedBean(name="gp")
public class GestionProduit {
	
	public GestionProduit() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Produit produit=new Produit();
	private IProduitDAO daoP=new ProduitDAO();

	private Marque marque=new Marque();
	private IMarqueDAO daoM=new MarqueDAO();
	
	
	
	//Methodes pour produit:
		public String ajoutProduit() {
			produit.setMarque(marque);
			if(daoP.addProduit(produit)==1) {
				return "Accueil";
			}
			return "failed";
		}
		
		public List<Produit> listeProduit(){
			return daoP.listeProduit();
		}
		
		public List<Marque> listeMarque(){
			return daoM.listeMarque();
		}
		
		
		//Getters & Setters
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public IProduitDAO getDaoP() {
		return daoP;
	}
	public void setDaoP(IProduitDAO daoP) {
		this.daoP = daoP;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public IMarqueDAO getDaoM() {
		return daoM;
	}
	public void setDaoM(IMarqueDAO daoM) {
		this.daoM = daoM;
	}
}
