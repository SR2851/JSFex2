package DAO;

import java.util.List;

import Model.Produit;

public interface IProduitDAO {
	public int addProduit(Produit produit);
	public List<Produit> listeProduit();
	
	
}
