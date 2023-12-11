package org.generation.italy;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	// Lista per memorizzare i veicoli nei posti del garage
	private List <Veicolo> postiGarage;
	
	//Costruttore che inizializza la lista dei posti
	public Garage() {
		this.postiGarage=new ArrayList<>();}
	
	//Metodo per immettere un nuovo veicolo nel garage
	public void immettiVeicolo (Veicolo veicolo) {
		if(postiGarage.size() < 15) {
			postiGarage.add(veicolo);
			System.out.println("Veicolo immesso con successo nel garage");
		}else {
			System.out.println("Il garage è pieno non si accettano nuovi veicoli");		
		}
	}
	
	// Metodo per estrarre un veicolo dal garage dato il numero del posto
	public Veicolo estraiVeicolo(int numeroPosto) {
	    if (numeroPosto >= 0 && numeroPosto < postiGarage.size()) {
	        Veicolo veicoloEstratto = postiGarage.get(numeroPosto);
	        postiGarage.remove(numeroPosto);  // Rimuovo l'elemento dalla lista dopo averlo estratto
	        System.out.println("Veicolo estratto con successo dal posto " + numeroPosto);
	        return veicoloEstratto;
	    } else {
	        System.out.println("Il posto specificato non è valido.");
	        return null;
	    }
	}
	
	 public void stampaSituazioneGarage() {
	        System.out.println("Situazione attuale del garage:");

	        for (int i = 0; i < postiGarage.size(); i++) {
	            System.out.println("Posto " + i + ": " + postiGarage.get(i));
	        }
	    }
			//hhhh
		
		}
	
		
	
