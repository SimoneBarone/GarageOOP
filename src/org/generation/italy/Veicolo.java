package org.generation.italy;

import java.util.Scanner;

public class Veicolo {
	
	    // Attributi comuni a tutti i veicoli
	    private String marca;
	    private int anno;
	    private int cilindrata;

	    // Costruttore per inizializzare gli attributi del veicolo
	    public Veicolo(String marca, int anno, int cilindrata) {
	        this.marca = marca;
	        this.anno = anno;
	        this.cilindrata = cilindrata;
	    }

	    // Getter e setter per gli attributi del veicolo
	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public int getAnno() {
	        return anno;
	    }

	    public void setAnno(int anno) {
	        this.anno = anno;
	    }

	    public int getCilindrata() {
	        return cilindrata;
	    }

	    public void setCilindrata(int cilindrata) {
	        this.cilindrata = cilindrata;
	    }

	    // Metodo toString per visualizzare le informazioni del veicolo
	    @Override
	    public String toString() {
	        return "Veicolo [marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata + "]";
	    }

	    // Metodo per inserire le informazioni del veicolo interattivamente
	    public void inserisciVeicolo() {
	    	Scanner scanner = new Scanner(System.in);

	        System.out.print("Inserisci la marca del veicolo: ");
	        this.marca = scanner.nextLine();

	        System.out.print("Inserisci l'anno di produzione del veicolo: ");
	        this.anno = scanner.nextInt();
	        scanner.nextLine(); // Consuma il carattere di nuova linea

	        System.out.print("Inserisci la cilindrata del veicolo: ");
	        this.cilindrata = scanner.nextInt();
	        scanner.nextLine(); // Consuma il carattere di nuova linea
	        
	    
	        
	 
			
		}

		public void inserisciAuto() {
			// TODO Auto-generated method stub
			
		}
	   
	}

	

