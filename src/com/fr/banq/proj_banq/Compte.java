package com.fr.banq.proj_banq;

public class Compte {

	private int numCompte;
	private double soldeCompte;

	public Compte(int numCompte, double soldeCompte) {

		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", soldeCompte=" + soldeCompte + "]";
	}

	public void ajouter(double montant) {
		this.soldeCompte += montant;
	}

	public void retirer(double montant) {
		this.soldeCompte -= montant;
	}

	public boolean isExiste(int num) {
		return this.numCompte == num ? true : false;
	}

}
