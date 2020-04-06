package it.polito.tdp.totocalcio.model;

import java.util.ArrayList;
import java.util.List;

public class Ricerca {
	
	private Pronostico pronostico;
	private int N; 
	private List<Risultato> soluzione; 
	
	public List<Risultato> cerca(Pronostico pronostico) {
		
		this.pronostico = pronostico; 
		this.N= pronostico.size(); 
		
		List<RisultatoPartita> parziale = new ArrayList<>(); 
		int livello = 0; 
		
		this.soluzione = new ArrayList<Risultato>(); 
		
		ricorsiva(parziale, livello); 
		
		
		return this.soluzione;
	}
	
	
	private void ricorsiva (List<RisultatoPartita> parziale, int livello) {
		
		if(livello == N) {
			
			this.soluzione.add( new Risultato (parziale)); 
			
		}
		else {
			
			PronosticoPartita pp = this.pronostico.get(livello); 
			
			for(RisultatoPartita ris : pp.getRisultati()) {
				parziale.add(ris); 
				ricorsiva(parziale, livello+1); 
				parziale.remove(parziale.size()-1);
			}
			
		}
		
	}

}
