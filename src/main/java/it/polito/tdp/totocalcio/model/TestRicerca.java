package it.polito.tdp.totocalcio.model;

import java.util.List;

public class TestRicerca {

	public static void main(String[] args) {

	Pronostico pronostico = new Pronostico();	
	pronostico.add(new PronosticoPartita ("2X"));
	pronostico.add(new PronosticoPartita ("1"));
	pronostico.add(new PronosticoPartita ("1X2"));
	pronostico.add(new PronosticoPartita ("12"));

	System.out.println(pronostico);
	
	
	Ricerca r = new Ricerca();
	
	List<Risultato> risultato = r.cerca(pronostico); 
	
	System.out.println(risultato); 
		
	}
	
}
