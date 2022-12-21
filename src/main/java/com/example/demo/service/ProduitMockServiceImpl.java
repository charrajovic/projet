package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitService {

	
	private List<Produit> produits;
	
	public ProduitMockServiceImpl()
	{
		produits = new ArrayList<Produit>();
		produits.add(new Produit("Livre" , 50 , 20));
		produits.add(new Produit("cahier",20,25));
		produits.add(new Produit("Stylo" , 250 , 120));
		produits.add(new Produit("Haytem" , 999 , 99));
		produits.add(new Produit("C. Ronaldo" , 1300 , 150.6f));
		produits.add(new Produit("Ronaldo N." , 138 , 15.6f));
		produits.add(new Produit("Ahmed hassan koka" , 81 , 46.38f));
	}
	
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		produits.remove(produit);
		
	}

}
