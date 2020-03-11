package Model;

import java.util.List;

import javax.faces.bean.ManagedBean;

import DAO.IMarqueDAO;
import DAO.MarqueDAO;

@ManagedBean(name="gm")
public class GestionMarque {

	private Marque marque=new Marque();
	private IMarqueDAO daoM=new MarqueDAO();
	
	
	public GestionMarque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Methodes pour Marque:
			public String ajoutMarque() {
				
			
				if(daoM.addMarque(marque)==1) {
					return "Accueil";
				}
				return "failed";
			}
			
			public List<Marque> listeMarque(){
				return daoM.listeMarque();
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
