package org.generation.italy;

import java.util.Scanner;
//Classe che rappresenta un furgone
public class Furgone extends Veicolo {
	Scanner scanner = new Scanner(System.in);
 // Attributo specifico per i furgoni
 private int capacitaCarico;

 // Costruttore che chiama il costruttore della classe base e inizializza l'attributo specifico
 public Furgone(String marca, int anno, int cilindrata, int capacitaCarico) {
     super(marca, anno, cilindrata);
     this.capacitaCarico = capacitaCarico;
 }

 // Getter e setter per l'attributo specifico dei furgoni
 public int getCapacitaCarico() {
     return capacitaCarico;
 }

 public  void setCapacitaCarico(int capacitaCarico) {
     this.capacitaCarico = capacitaCarico;
 }

 // Metodo toString che estende il metodo della classe base e aggiunge l'informazione specifica per i furgoni
 @Override
 public String toString() {
     return super.toString() + "Furgone: capacità " + capacitaCarico;
     
 }

 // Metodo per inserire le informazioni del furgone interattivamente
 public void inserisciFurgone() {
     
     // Richiamo il metodo della classe base per inserire le informazioni comuni
     inserisciVeicolo();
     System.out.print("Inserisci la capacità di carico del furgone: ");
     this.capacitaCarico = scanner.nextInt();
 }
}




