package org.generation.italy;

import java.util.Scanner;

//Classe che rappresenta una moto
public class Moto extends Veicolo {
	Scanner scanner = new Scanner(System.in);
 // Attributo specifico per le moto
 private String tipoTempi;

 // Costruttore che chiama il costruttore della classe base e inizializza l'attributo specifico
 public Moto(String marca, int anno, int cilindrata, String tipoTempi) {
     super(marca, anno, cilindrata);
     this.tipoTempi = tipoTempi;
 }

 // Getter e setter per l'attributo specifico delle moto
 public String getTipoTempi() {
     return tipoTempi;
 }

 public void setTipoTempi(String tipoTempi) {
     this.tipoTempi = tipoTempi;
 }

 // Metodo toString che estende il metodo della classe base e aggiunge l'informazione specifica per le moto
 @Override
 public String toString() {
     return super.toString() +  "Moto: tempi=" + tipoTempi;
 }

 // Metodo per inserire le informazioni della moto interattivamente
 public void inserisciMoto() {    
     // Richiamo il metodo della classe base per inserire le informazioni comuni
     inserisciVeicolo();
     System.out.print("Inserisci il tipo di tempi della moto: ");
     this.tipoTempi = scanner.next();
 }
}
