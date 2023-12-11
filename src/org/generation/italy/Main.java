package org.generation.italy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Immettere nuovo veicolo nel garage");
            System.out.println("2. Estrarre veicolo dal garage");
            System.out.println("3. Stampare situazione corrente del garage");
            System.out.println("0. Uscire");

            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Scegli il tipo di veicolo:");
                    System.out.println("1. Auto");
                    System.out.println("2. Moto");
                    System.out.println("3. Furgone");
                    int tipoVeicolo = scanner.nextInt();

                    if (tipoVeicolo >= 1 && tipoVeicolo <= 3) {
                        switch (tipoVeicolo) {
                            case 1:
                                Auto auto = new Auto("Marca", 2000, 2000, 4, "Benzina");
                                auto.inserisciAuto();
                              
                                garage.immettiVeicolo(auto);
                                break;
                            case 2:
                                Moto moto = new Moto("Marca", 2022, 1000, "Catena");
                                moto.inserisciMoto();
                                garage.immettiVeicolo(moto);
                                break;
                            case 3:
                                Furgone furgone = new Furgone("Marca", 2022, 2500, 1500);
                                furgone.inserisciFurgone();
                                garage.immettiVeicolo(furgone);
                                break;
                        }
                    } else {
                        System.out.println("Scelta non valida. Riprova.");
                    }
                    break;

                case 2:
                    System.out.print("Inserisci il numero del posto da cui estrarre il veicolo: ");
                    int numeroPosto = scanner.nextInt();
                    Veicolo veicoloEstratto = garage.estraiVeicolo(numeroPosto);
                    if (veicoloEstratto != null) {
                        System.out.println("Veicolo estratto: " + veicoloEstratto);
                    }
                    break;

                case 3:
                    garage.stampaSituazioneGarage();
                    break;

                case 0:
                    System.out.println("Arrivederci!");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        } while (scelta != 0);
        scanner.close();
        
    }
}
