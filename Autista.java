package com.casa.esercitazione30.it;

public class Autista {

	private static String _nome;
	
	public Autista(String nome) {
		this._nome = nome;
		}
	
	
	public static String getNome() {
		return _nome;
	}

	
	
	public void avviaVeicolo() {
		System.out.println("L'autista " + getNome() + " avvia la guida del veicolo "+ Veicolo.getMarca() +" "+ Auto.getModello()  );
	}
	
	public void avviaVeicolo1() {
		System.out.println("L'autista " + getNome() + " avvia la guida del veicolo "+ Furgone.getMarca() +" "+ Furgone.getModello()  );
	}
	
	public void acceleraATavoletta() {
		System.out.println("L'autista " + getNome() + " accelera la guida del veicolo"  );
	}

	
	
	
	
	

	
	
}
