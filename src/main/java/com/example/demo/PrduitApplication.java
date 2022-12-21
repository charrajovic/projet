package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@SpringBootApplication
public class PrduitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =  SpringApplication.run(PrduitApplication.class, args);
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("Livre" , 50 , 20));
		produitRepository.save(new Produit("cahier",20,25));
		produitRepository.save(new Produit("Stylo" , 250 , 120));
	}

}
