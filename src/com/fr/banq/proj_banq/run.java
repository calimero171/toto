package com.fr.banq.proj_banq;

import com.fr.banq.exception.BanqueException;

public class run {

	public static void main(String[] args) throws CompteNonValide, BanqueException {
		// TODO Auto-generated method stub
		Compte c1 = new Compte(1, 50);
		Compte c2 = new Compte(999, 22);
		Client cl1 = new Client("A", "B", 100, 666, 1000);
		cl1.ajouterCompte(c1);
		cl1.ajouterCompte(c2);
		System.out.println("compte1 " + c1.toString());
		System.out.println("client " + cl1.toString());
		try {
			cl1.retirerCompte(1);
			System.out.println("client apres retrait " + cl1.toString());

			cl1.ajouterMontantCompte(999, 1);

			// compte remunere

			// 3e param taux/seuil

			CompteRemunere cr1 = new CompteRemunere(1, 50, 100);
			CompteASeuil cs1 = new CompteASeuil(2, 10000, 100);

			Client2 blm = new Client2("buoy", "lim", 100, 666, 50);
			blm.ajouterCompte(cr1);
			blm.ajouterMontantCompte(cr1.getNumCompte(), cr1.calculerInterets());
			blm.ajouterCompte(cs1);
			blm.retirerMontantCompte(cs1.getNumCompte(), 50);

			System.out.println("nom de la classe " + cr1.getClass().getName());

			System.out.println(blm.toString());

			// avec la genericite

			CompteASeuilRemunere<CompteASeuil> cas = new CompteASeuilRemunere<>(cs1);
			CompteASeuilRemunere<CompteRemunere> cas2 = new CompteASeuilRemunere<>(cr1);
			
			System.out.println("seuil "+cas.getSeuil()+" et solde "+cas.getSolde());
			System.out.println("seuil "+cas2.getSeuil()+" et solde "+cas2.getSolde()+" avec des interet de "+cas2.getInteret());
			
			//test modification du seuil
			cas.setSeuil(12);
			cas.retirer(10);
			System.out.println("apres retrait seuil "+cas.getSeuil()+" et solde "+cas.getSolde());

		} catch (NumberFormatException e) {
			// encapsulation de l'exception
			throw new CompteNonValide("parse error", e);
		}

	}

	
	
	
	
	
}