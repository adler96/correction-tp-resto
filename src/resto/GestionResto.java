package resto;

import java.util.Scanner;

public class GestionResto {

	public static void main(String[] args) {
		/* declaration variables pour 
		 le choix de l'utilisateur et 
		 le montant total des achats
		*/
		int choix, facture = 0, repeter = 1;
		Scanner scan = new Scanner(System.in);
		
		while(repeter == 1) {
			// Affichage du menu pour les plats de resistance
			System.out.println("Bienvenue. Veuillez choisir un plat:");
			System.out.println("Tapez 1 pour choisir Thiebou Dieune a 1500F");
			System.out.println("Tapez 2 pour choisir Thiebou Yapp a 1000F");
			System.out.println("Tapez 3 pour choisir Yassa Poulet a 2000F");
			
			choix = scan.nextInt();
			System.out.println("\n\n");
			
			if(choix == 1) {
				System.out.println("Vous avez choisi Thiebou Dieune a 1500F");
				facture += 1500;
			} else if(choix == 2) {
				System.out.println("Vous avez choisi Tiebou Yapp a 1000F");
				facture += 1000;
			} else if(choix == 3) {
				System.out.println("Vous avez choisi Yassa Poulet a 2000F");
				facture += 2000;
			} else {
				System.out.println("Desole, ce choix n'est pas disponible.");
			}
			
			System.out.println("\n\n");
			// GESTION DES BOISSONS
			System.out.println("Bienvenue. Veuillez choisir une boisson:");
			System.out.println("Tapez 1 pour choisir Bissap a 200F");
			System.out.println("Tapez 2 pour choisir Bouye a 250F");
			System.out.println("Tapez 3 pour choisir Orange a 500F");
			
			choix = scan.nextInt();
			System.out.println("\n\n");
			
			if(choix == 1) {
				System.out.println("Vous avez choisi le Bissap a 200F");
				facture += 200;
			} else if(choix == 2) {
				System.out.println("Vous avez choisi le Bouye a 250F");
				facture += 250;
			} else if(choix == 3) {
				System.out.println("Vous avez choisi le jus d'Orange a 500F");
				facture += 500;
			} else {
				System.out.println("Desole, ce choix n'est pas disponible.");
			}
			
			System.out.println("\n\n");
			// GESTION DES DESSERTS
			System.out.println("Bienvenue. Veuillez choisir un dessert:");
			System.out.println("Tapez 1 pour choisir Tarte a la Pomme a 2000F");
			System.out.println("Tapez 2 pour choisir les Gaufres a 2500F");
			System.out.println("Tapez 3 pour choisir les crepes au Nutella a 3000F");
			
			choix = scan.nextInt();
			System.out.println("\n\n");
			
			if(choix == 1) {
				System.out.println("Vous avez choisi le Tarte a la Pomme a 2000F");
				facture += 2000;
			} else if(choix == 2) {
				System.out.println("Vous avez choisi les Gaufres a 2500F");
				facture += 2500;
			} else if(choix == 3) {
				System.out.println("Vous avez choisi les crepes au Nutella a 3000F");
				facture += 3000;
			} else {
				System.out.println("Desole, ce dessert n'est pas disponible.");
			}
			
			System.out.println("*********************************\n\n");
			
			// Demander a l'utilisateur s'il veut commander de nouveau
			System.out.println("Voulez-vous commander de nouveau ?");
			System.out.println("Tapez 1 pour continuer, tapez 0 pour arreter");
			repeter = scan.nextInt();
			System.out.println("\n\n");
		}
		
		// afficher la facture finale
		System.out.println("Votre facture finale s'eleve a "+facture+"F CFA");
		
	}

}
