package org.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto[] carrello = new Prodotto[10];
        float totale = 0.00f;

        int numeroProdotti = 0;

        System.out.print("Hai una tessera fedeltà? (si/no): ");
        boolean rispostaFedelta = scanner.nextLine().equalsIgnoreCase("si");

        while (true) {
            System.out.println("Scegli un tipo di prodotto: 1. Smartphone  2. Televisori  3. Cuffie o 4. Fine");
            String scelta = scanner.nextLine();

            if (scelta.equals("4")) {
                break;
            }

            if (numeroProdotti < carrello.length) {
                System.out.println("Inserisci il codice:");
                String codice = scanner.nextLine();
                System.out.println("Inserisci il nome:");
                String nome = scanner.nextLine();
                System.out.println("Inserisci la marca:");
                String marca = scanner.nextLine();
                System.out.println("Inserisci il prezzo:");
                float prezzo = scanner.nextFloat();
                System.out.println("Inserisci l'IVA:");
                int iva = scanner.nextInt();

                switch (scelta) {
                    case "1":
                        scanner.nextLine();
                        System.out.println("Inserisci l'IMEI:");
                        String imei = scanner.nextLine();
                        System.out.println("Inserisci la memoria (in GB):");
                        int memoria = scanner.nextInt();
                        carrello[numeroProdotti] = new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria);
                        break;
                    case "2":
                        scanner.nextLine();
                        System.out.println("Inserisci le dimensioni (in pollici):");
                        int dimensioni = scanner.nextInt();
                        System.out.println("Il televisore è smart? (true/false):");
                        boolean smart = scanner.nextBoolean();
                        carrello[numeroProdotti] = new Televisori(codice, nome, marca, prezzo, iva, dimensioni, smart);
                        break;
                    case "3":
                        scanner.nextLine();
                        System.out.println("Inserisci il colore:");
                        String colore = scanner.nextLine();
                        System.out.println("Le cuffie sono wireless? (true/false):");
                        boolean wireless = scanner.nextBoolean();
                        carrello[numeroProdotti] = new Cuffie(codice, nome, marca, prezzo, iva, colore, wireless);
                        break;
                }

                if (carrello[numeroProdotti] != null) {
                    float prezzoScontato = carrello[numeroProdotti].calcolaPrezzoScontato(rispostaFedelta);
                    totale += prezzoScontato;
                    numeroProdotti++;
                    System.out.println("Prodotto aggiunto al carrello.");
                }
            } else {
                System.out.println("Carrello pieno, non è possibile aggiungere ulteriori prodotti.");
                break;
            }

            
            scanner.nextLine();
        }

        System.out.println("Carrello:");
        for (int i = 0; i < numeroProdotti; i++) {
            System.out.println(carrello[i]);
            System.out.println("-------------------");
        }
        
        String totaleFormattato = String.format("%.2f", totale);

        System.out.println("Totale: " + totaleFormattato + " euro");
    }
}



