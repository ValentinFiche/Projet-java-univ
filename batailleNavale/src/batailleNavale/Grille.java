package batailleNavale;

public class Grille {

	private Bateau[]flotte = new Bateau[5];
	private int nbBateau =0;
	
	public void placerBateau(Bateau bateau, String sens,char lettre, int chiffre) {
		bateau.placerBateau(lettre,chiffre,sens);
		flotte[nbBateau]=bateau;
		nbBateau++;
	}
	public static void main(String[] args) {

	Grille grille = new Grille();
	Bateau torpilleur = new Bateau("torpilleur",3);
	grille.placerBateau(torpilleur, "H", 'A', 1);
	System.out.println("le torpilleur a-t-il un élément en 'A',2 ?" + torpilleur.appartientBateau('A', 2));
	System.out.println("le torpilleur a-t-il un élément en 'B',2 ?" + torpilleur.appartientBateau('B', 2));
	System.out.println("l'état du torpilleur est : " + torpilleur.getEtatBateau());

	}
}
