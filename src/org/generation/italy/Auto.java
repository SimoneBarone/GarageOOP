package org.generation.italy;

import java.util.Scanner;

//Classe che rappresenta un'auto
public class Auto extends Veicolo {
 // Attributi specifici per le auto
 private int numeroPorte;
 private String tipoAlimentazione;

 // Costruttore che chiama il costruttore della classe base e inizializza gli attributi specifici
 public Auto(String marca, int anno, int cilindrata, int numeroPorte, String tipoAlimentazione) {
     super(marca, anno, cilindrata);
     this.numeroPorte = numeroPorte;
     this.tipoAlimentazione = tipoAlimentazione;
 }

 // Getter e setter per gli attributi specifici delle auto
 public int getNumeroPorte() {
     return numeroPorte;
 }

 public void setNumeroPorte(int numeroPorte) {
     this.numeroPorte = numeroPorte;
 }

 public String getTipoAlimentazione() {
     return tipoAlimentazione;
 }

 public void setTipoAlimentazione(String tipoAlimentazione) {
     this.tipoAlimentazione = tipoAlimentazione;
 }

 // Metodo toString che estende il metodo della classe base e aggiunge le informazioni specifiche per le auto
 @Override
 public String toString() {
     return super.toString() + String.format("; Auto: porte=%d, alimentazione=%s", numeroPorte, tipoAlimentazione);
 }

 // Override del metodo per inserire le informazioni dell'auto interattivamente
 @Override
 public void inserisciAuto() {
     Scanner scanner = new Scanner(System.in);

     // Richiamo il metodo della classe base per inserire le informazioni comuni
     super.inserisciVeicolo();

     // Lettura del numero di porte con controllo dell'input
     while (true) {
         System.out.print("Inserisci il numero di porte dell'auto: ");
         if (scanner.hasNextInt()) {
             this.numeroPorte = scanner.nextInt();
             break;
         } else {
             System.out.println("Inserisci un numero di porte valido.");
             scanner.next();  // Consuma l'input non valido
         }
     }

     // Consuma l'intera linea di input prima di leggere il tipo di alimentazione
     scanner.nextLine();

     // Lettura del tipo di alimentazione
     System.out.print("Inserisci il tipo di alimentazione dell'auto (Benzina/Diesel): ");
     this.tipoAlimentazione = scanner.next();
 }
}
