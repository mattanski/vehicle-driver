package com.casa.esercitazione30.it;

public class Main {
	
	public static void main(String[]args) {
		
		Veicolo auto = new Veicolo("Toyota", "Prius ", 178);
		Veicolo furgone = new Veicolo("Mercedes", "Benz ", 234);
		Autista autista = new Autista("James");
		
	
		autista.avviaVeicolo();
		auto.start();
		autista.acceleraATavoletta();
		auto.accelera();
		
		System.out.println("\n\n");
		
		
		autista.avviaVeicolo1();
		furgone.start();
		autista.acceleraATavoletta();
		furgone.accelera();
		
		
		
		
		
		
	
		
		
		
		
		
	}

	
	
	
}
