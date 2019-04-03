package com.fr.banq.proj_banq;

import com.fr.banq.proj_banq.interf.ICompteASeuil;

import fr.banque.ICompteRemunere;

public class CompteASeuilRemunere<T> implements ICompteASeuil, ICompteRemunere {

	private T CompteGen;
	private int typeCompte = 0;
	private CompteASeuil cs;
	private CompteRemunere cr;

	public CompteASeuilRemunere(T compteGen) {
		System.out.println("Dans la classe CompteASeuilRemunere");
		this.CompteGen = compteGen;

		typeCompte = (this.CompteGen.getClass().getName().contains("CompteASeuil")
				&& this.CompteGen.getClass().getName() != null) ? 1 : 2;
		System.out.println("compte seuil ou pas " + typeCompte);

		if (this.typeCompte == 1) {
			cs = (CompteASeuil) compteGen;
		} else {
			cr = (CompteRemunere) compteGen;
		}
	}

	public T getCompteGen() {
		return CompteGen;
	}

	public void setCompteGen(T compteGen) {
		CompteGen = compteGen;
	}

	public double getSolde() {
		// TODO Auto-generated method stub
		return (this.typeCompte == 1 ? cs.getSoldeCompte() : cr.getSoldeCompte());
	}

	public double getInteret() {
		// TODO Auto-generated method stub
		return (this.typeCompte == 1 ? 0 : cr.calculerInterets());
	}

	@Override
	public void retirer(double uneValeur) {
		// TODO Auto-generated method stub

		if (this.typeCompte == 1) {
			cs.retirer(uneValeur);
		} else {
			cr.retirer(uneValeur);
		}

	}


	@Override
	public double getSeuil() {
		// TODO Auto-generated method stub
		return typeCompte == 1 ? this.cs.getSeuil() : 0;
	}

	@Override
	public void setSeuil(double unSeuil) {
		// TODO Auto-generated method stub

	}

	@Override
	public double calculerInterets() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void verserInterets() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getTaux() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTaux(double unTaux) {
		// TODO Auto-generated method stub

	}

}
