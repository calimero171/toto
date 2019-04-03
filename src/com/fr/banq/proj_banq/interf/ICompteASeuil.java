package com.fr.banq.proj_banq.interf;

import com.fr.banq.exception.BanqueException;

public interface ICompteASeuil {

	public void retirer(double uneValeur) throws BanqueException;

	public double getSeuil();

	public void setSeuil(double unSeuil);
	

}
