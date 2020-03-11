package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Produit {
@Id
@GeneratedValue
	private int idProduit;
	private String nomProduit;
	private String description;
	private double prix;
	@JoinColumn(name="idMarque")
	@ManyToOne
	private Marque marque;
	
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "Produit [nomProduit=" + nomProduit + ", description=" + description
				+ ", prix=" + prix + ", marque=" + marque + "]";
	}
	public Produit(int idProduit, String nomProduit, String description, double prix, Marque marque) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.description = description;
		this.prix = prix;
		this.marque = marque;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		
}
