package com.casa.esercitazione30.it;

public class Veicolo {
	
	protected static String _marca;
	protected static String _modello;
	private int _velocitaMax;
	
	public Veicolo(String marca, String modello, int velocitaMax) {
		
	this._marca = marca;
	this._modello = modello;
	this._velocitaMax = velocitaMax;
	
	}
	
	public String Veicolo() {
		return _marca;
	}

	public int getVelocitaMax() {
		return _velocitaMax;
	}
	
	
	
	/*@Override
	public String toString() {
		String x = "";
		return x += this._modello + "" + this._marca + "";
	}*/
	
	
	
	public void accelera() {
		System.out.println( "Il veicolo ha raggiuto la velocità massima di " + getVelocitaMax()  + "!");
	}
	
	public void start() {
		System.out.println("Il motore si è acceso!");
	}

	public static String getMarca() {
		return _marca;
	}
	
}
	
	


