package com.example;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Génération d'un nombre aléatoire entre 1 et 100
        int nombreMystere = random.nextInt(100) + 1;
        int essais = 0;
        boolean trouve = false;

        System.out.println("Bienvenue au jeu 'Devinez le nombre' !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. À vous de deviner !");

        while (!trouve) {
            System.out.print("Entrez votre supposition : ");
            int supposition = scanner.nextInt();
            essais++;

            if (supposition == nombreMystere) {
                trouve = true;
                System.out.println("Quel bol, vous avez trouvé en " + essais + " essais !");
            } else if (supposition < nombreMystere) {
                System.out.println("Perdu ! Il vous manquait " + (nombreMystere - supposition) + ".");
            } else {
                System.out.println("Perdu ! Vous avez dépassé de " + (supposition - nombreMystere) + ".");
            }
        }

        scanner.close();

    }
}