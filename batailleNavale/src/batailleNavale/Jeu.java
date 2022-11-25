package batailleNavale;

public class Jeu {
	public Grille grille1;
	public Grille grille2;

	public String[] nomsBateaux() {
	
		return EnumNomBateau.enumToArray();
	}
	
	public int nbElementBateau(String nomBateau) {
		int nbElement = 0 ;
        switch (EnumNomBateau.stringToEnum(nomBateau)) {
           case PORTE_AVION:
               nbElement = 5;
               break;

           case CROISEUR:
               nbElement = 4;
               break;

           default:
               System.out.println("Erreur de reconnaissance du nom du bateau.");
               break;
           }
       
       return nbElement ;
   }
	
	public void initialiser (int numJoueur, String nomBateau, int tailleBateau, char lettre, int chiffre, String sens) {
		 	//a finir
		if (numJoueur == 1){
			Grille grille1 = new Grille();
			Bateau torpilleur = new Bateau(nomBateau, tailleBateau);
			torpilleur.placerBateau(lettre, chiffre,sens);
			}
		
		if (numJoueur == 2){
			Grille grille2 = new Grille();
			Bateau torpilleur = new Bateau(nomBateau, tailleBateau);
			torpilleur.placerBateau(lettre, chiffre,sens);
			}
	}
}
