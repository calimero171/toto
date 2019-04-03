package com.fr.banq.proj_banq;

import com.fr.banq.proj_banq.interf.ICompteASeuil;

public class CompteASeuil extends Compte implements ICompteASeuil{
	private double seuil;

	public CompteASeuil(int numCompte, double soldeCompte) {
		super(numCompte, soldeCompte);
		// TODO Auto-generated constructor stub
	}
	

	public CompteASeuil(int numCompte, double soldeCompte, double seuil) {
		super(numCompte, soldeCompte);
		this.seuil=seuil;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void retirer(double uneValeur) {
		double solde;
		solde = super.getSoldeCompte();
		if (solde > seuil) {
			System.out.println("solde avant"+super.getSoldeCompte());
			super.retirer(uneValeur);
			System.out.println("solde apres"+super.getSoldeCompte());
		}else {
			System.out.println("solde insuffisant"+super.getSoldeCompte());
		}

	}


	@Override
	public double getSeuil() {
		// TODO Auto-generated method stub
		return this.seuil;
	}


	@Override
	public void setSeuil(double unSeuil) {
		// TODO Auto-generated method stub
		this.seuil=unSeuil;
	}

}
