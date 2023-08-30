package com.casa.esercitazione30.it;

public class Guida<Veicolo> {
	
	
		private Veicolo contenuto;
		
		public Guida(Veicolo t){
			contenuto = t;
		}
		
		
		public Veicolo getContenuto() {
			return contenuto;
		}
		
		
		Guida<Veicolo> veicolo = new Guida<Veicolo>(contenuto);
		
		
		
	}
		

