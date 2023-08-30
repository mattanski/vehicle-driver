package com.casa.esercitazione30.it;

public class Furgone extends Veicolo{

	public Furgone(String marca, String modello, int velocitaMax) {
		super(marca, modello, velocitaMax);
	}

	public static String getMarca() {
		return _marca;
	}
	
	public static String getModello() {
		return _modello;
	}
}
