package batailleNavale;

public class Bateau {
	private String nom;
	private int tailleBateau;
	private char etatBateau = 'S';
	private Element[] bateau;

	public Bateau(String nom, int tailleBateau) {
		this.nom = nom;
		this.tailleBateau = tailleBateau;
		this.bateau = new Element[tailleBateau];
	}

	public int getTailleBateau() {
		return tailleBateau;
	}

	public char getEtatBateau() {
		return etatBateau;
	}

	public void placerBateau(char lettre, int chiffre, String sens) {
		for (int i = 0; i < bateau.length; i++) {
			if (sens == "H") {
				int nouveauChiffre = chiffre + i;
				bateau[i] = new Element(lettre, nouveauChiffre);
			} else {
				char nouveaulettre = (char) (lettre + i);
				bateau[i] = new Element(nouveaulettre, chiffre);
			}

		}
	}

	public boolean appartientBateau(char lettre, int chiffre) {
		boolean appartient = false;
		for (int i = 0; i < bateau.length && !appartient; i++) {
			if (bateau[i].verifierCoordonnee(lettre, chiffre)) {
				appartient = true;
			}
		}
		return appartient;
	}

	public static void main(String[] args) {
		Bateau torpilleur = new Bateau("torpilleur", 2);
		torpilleur.placerBateau('A', 2, "H");
		System.out.println("le torpilleur a-t-il un élément en 'A',2 ?" + torpilleur.appartientBateau('A', 2));
		System.out.println("le torpilleur a-t-il un élément en 'B',2 ?" + torpilleur.appartientBateau('B', 2));
		System.out.println("l'état du torpilleur est : " + torpilleur.getEtatBateau());
	}
}
