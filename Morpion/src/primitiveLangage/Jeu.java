package primitiveLangage;

import java.util.Scanner;

public class Jeu {
	
	public static void jouerPartie() {
        String[] jeu = creationGrille();
        boolean joueur = true;
        do {
            afficherTableau(jeu);
            joueurUneCase(jeu,joueur);
            if(joueur) {
                joueur = false;
            } else {
                joueur = true;
            }
        }while(isPartieFinie(jeu) == false );
        afficherTableau(jeu);
    }
	
	public static void joueurUneCase(String[] tableau,boolean joueur ) {
		int ligne =lireEntier(" ligne");
		int colonne =lireEntier(" colonne");
		String valide = isCaseValide(tableau,ligne,colonne);
        if(valide.equals("OK")) {
        	System.out.println("coordonnee OK");
        	entrerCoordonnee(tableau,joueur,ligne,colonne);
        }
	}

	public static String[]  creationGrille() {
		String[] grille = new String[9];
		grille[0] ="|";
			for (int i = 0 ; i<grille.length ; i++) {
				grille[i] ="  |";
		        if (i==5 || i==2) {
		        	grille[i] ="\n------------";
		        	grille[i] ="  |";
		        }
			}
		 return grille;

	}

	public static boolean[]  creeationTableauVerif(String[] tableau,String joueur ) {
		
		 boolean res[]=new boolean[9];
			for (int i = 0 ; i<tableau.length ; i++) {
				 if (tableau[i].equals(joueur)) {
			        	res[i] =true;
			        }else {
			        	res[i] =false;
			        }
			}
			 return res;
	}
	
	public static boolean controlTableauVerif(boolean[] tabVerif) {
		boolean status = false;
		if (tabVerif[0]== true && tabVerif[1]==true && tabVerif[2]==true) {status = true;}
		if (tabVerif[0]== true && tabVerif[4]==true && tabVerif[8]==true) {status = true;}
		if (tabVerif[0]== true && tabVerif[3]==true && tabVerif[6]==true) {status = true;}
		if (tabVerif[3]== true && tabVerif[4]==true && tabVerif[5]==true) {status = true;}
		if (tabVerif[6]== true && tabVerif[7]==true && tabVerif[8]==true) {status = true;}
		if (tabVerif[2]== true && tabVerif[4]==true && tabVerif[6]==true) {status = true;}
		if (tabVerif[2]== true && tabVerif[5]==true && tabVerif[8]==true) {status = true;}
		if (tabVerif[1]== true && tabVerif[4]==true && tabVerif[7]==true) {status = true;}

		return status;
	}
	public static boolean isPartieFinie(String[] tableau ) {
		boolean statusParti = false;
		
		boolean tabVerif[] =creeationTableauVerif(tableau," o |");
		boolean contTabVerif = controlTableauVerif(tabVerif);
		for (int i = 0 ; i<tableau.length ; i++) {
			if (tableau[i] == "  |") {
				return statusParti;
			}else if ((tableau[i] ==" o |" ||  tableau[i] ==" x |") && contTabVerif== true){
				statusParti = true;

				}
		}
		return statusParti;

	}
	
	public static String isCaseValide(String[] tableau,int ligne, int colonne ) {
		String chaine ="";
		if (colonne >3 || ligne >3) {
			System.out.println("Hors multivers");
		}else {
			int indice =-1;
			switch(ligne) {
				case  1:
					indice =colonne - 1;
					break;
				case 2:
					indice =colonne + 2;
					break;
				case 3:
					indice =colonne + 5;
					break;
				default:
					chaine="erreur";
		    		break;
			}
			
			if (tableau[indice] == "  |" ) {
				chaine="OK";
		 	} else {
		 		chaine="deja utiliser";
		 	}
			System.out.println("000000000000"+chaine);
		}
		return chaine;
	}

	public static void afficherTableau(String[] tableau) {
		System.out.print("|");
		for (int i = 0 ; i<tableau.length ; i++) {
	        System.out.print(tableau[i]);
	        if (i==5 || i==2) {
	    		System.out.println("\n------------");
	    		System.out.print("|");
	        }
		}
		
	}
	public static int lireEntier(String zone) {
		System.out.println("entre la" + zone + ":");
		Scanner clavier = new Scanner(System.in);
		return clavier.nextInt();
	
	}
	public static void entrerCoordonnee(String[] tableau, boolean joueur0, int ligne, int colonne) {
		String symbole = " x |"; 
		if (joueur0) {
			symbole= (" o |");
			}
		int indice =-1;
		switch(ligne) {
			case  1:
				indice =colonne - 1;
				break;
			case 2:
				indice =colonne + 2;
				break;
			case 3:
				indice =colonne + 5;
				break;
			default:
	    		System.out.println("erreur");
	    		break;
		}
		tableau[indice]=symbole;
			
		
	}
	
	public static void main(String[] args) {
//ex1
		/*
		 * System.out.println("EXO 1"); System.out.println("Jeu du morpion"); //ex2
		 * System.out.println("EXO 2"); // String playeur = ""; boolean joueur0 = false;
		 * // if (joueur0) { // playeur = "o"; // } else { // playeur = "x"; // } // //
		 * System.out.println("|"+playeur+"|"); //
		 * 
		 * //ex3 System.out.println("EXO 3"); String[] tab = new String[9];
		 * System.out.print("|"); for (int i = 0 ; i<tab.length ; i++) { tab[i] =
		 * "   |"; } for (int i = 0 ; i<tab.length ; i++) { System.out.print(tab[i]); }
		 * //ex4 System.out.println(""); System.out.println("EXO 4");
		 * afficherTableau(tab);
		 * 
		 * //ex5 System.out.println("");
		 * 
		 * System.out.println("EXO 5"); entrerCoordonnee(tab,joueur0,1,2);
		 * entrerCoordonnee(tab,joueur0,3,2); entrerCoordonnee(tab,joueur0,2,1);
		 * entrerCoordonnee(tab,joueur0,2,3);
		 * 
		 * entrerCoordonnee(tab,joueur0,1,1); joueur0 = true;
		 * entrerCoordonnee(tab,joueur0,2,2);
		 * 
		 * entrerCoordonnee(tab,joueur0,3,3); entrerCoordonnee(tab,joueur0,3,1);
		 * 
		 * 
		 * afficherTableau(tab);
		 * 
		 * //ex6 System.out.println(""); System.out.println("EXO 6");
		 * 
		 * int ligne =lireEntier("ligne"); int colonne =lireEntier("colonne");
		 * entrerCoordonnee(tab,joueur0,ligne,colonne); afficherTableau(tab);
		 * 
		 * //ex 3 du tp System.out.println(""); System.out.println("ex 3 du tp"); String
		 * caseValide= ""; caseValide=isCaseValide(tab,1,1);
		 * System.out.println(caseValide);
		 * 
		 * caseValide=isCaseValide(tab,3,3); System.out.println(caseValide);
		 * 
		 * caseValide=isCaseValide(tab,2,2); System.out.println(caseValide);
		 * 
		 * //ex4 du tp System.out.println(""); System.out.println("ex 4 du tp"); boolean
		 * tabVerif[] =creeationTableauVerif(tab," o |"); //ex4 2 boolean contTabVerif =
		 * controlTableauVerif(tabVerif); //ex4 3
		 * 
		 * boolean partiFinito = isPartieFinie(tab);
		 * 
		 * System.out.println("parti fini ?" + partiFinito ); //ex5 du tp
		 * System.out.println(""); System.out.println("ex 5 du tp"); String[] creaGrille
		 * =creationGrille(); joueur0 = true; //ex5 2 du tp
		 * 
		 * joueurUneCase(creaGrille,joueur0); afficherTableau(creaGrille);
		 */
    		jouerPartie() ;
		}
	}

