package com.fr.banq.proj_banq;

import fr.banque.ICompteRemunere;

public class CompteRemunere extends Compte implements ICompteRemunere {
	private double tauxChange;
	private double soldeI;

	public CompteRemunere(int numCompte, double soldeCompte, double taux) {
		super(numCompte, soldeCompte);
		// TODO Auto-generated constructor stub
		this.soldeI = soldeCompte;
		this.tauxChange = taux;
	}

	@Override
	public double calculerInterets() {

		return super.getSoldeCompte() * tauxChange;
	}

	@Override
	public void verserInterets() {

		super.ajouter(this.calculerInterets());

	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public double getTaux() {
		// TODO Auto-generated method stub
		return this.tauxChange;
	}

	@Override
	public void setTaux(double unTaux) {
		// TODO Auto-generated method stub
		this.tauxChange = unTaux;
	}

}
