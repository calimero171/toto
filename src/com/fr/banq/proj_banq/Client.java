package com.fr.banq.proj_banq;

import java.util.ArrayList;

public class Client {

	private String nom;
	private String prenom;
	private int age;
	private double soldeClient;
	private int numeroClient;

	private ArrayList<Compte> ListeCompte = new ArrayList<Compte>();

	public Client(String nom, String prenom, int age, int numeroClient, double soldeClient) {

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.soldeClient = soldeClient;
		this.numeroClient = numeroClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSoldeClient() {
		return soldeClient;
	}

	public void setSoldeClient(double soldeClient) {
		this.soldeClient = soldeClient;
	}

	public void ajouterCompte(Compte ccc) {
		this.ListeCompte.add(ccc);
	}

	public void retirerCompte(int numeroComte) throws CompteNonValide {
		int indx;
		indx = this.rechercheCompte(numeroComte);
		if (indx == -1) {
			throw new CompteNonValide("bad value 0");
		}
		this.ListeCompte.remove(indx);
	}

	public int rechercheCompte(int numeroCompte) throws CompteNonValide {
		int i;
		int j = this.ListeCompte.size();
		try {

 
			for (i = 0; i < j; i++) {
				// System.out.println("compte inconnu" +this.ListeCompte.get(i));
				if (this.ListeCompte.get(i).isExiste(numeroCompte)) {
					System.out.println("true "+i);
					return i;
				}
				if (this.ListeCompte.get(i) == null) {
					// System.out.println("compte inconnu");
					throw new CompteNonValide("bad value 1");

				}
			}

		} catch (NumberFormatException e) {
			// encapsulation de l'exception
			throw new CompteNonValide("parse error", e);
		}

		return -1;

	}

	public void ajouterMontantCompte(int numeroCompte,double mnt) throws CompteNonValide {
		System.out.println("dans ajouterMontantCompte");
		int idx;
		idx=this.rechercheCompte(numeroCompte);
		if(idx>0) {
			System.out.println("avant" +ListeCompte.get(idx).toString());
			ListeCompte.get(idx).ajouter(mnt);
			System.out.println("apres "+ListeCompte.get(idx).toString());
		}
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", soldeClient=" + soldeClient
				+ ", numeroClient=" + numeroClient + ", ListeCompte=" + ListeCompte + "]";
	}

}
