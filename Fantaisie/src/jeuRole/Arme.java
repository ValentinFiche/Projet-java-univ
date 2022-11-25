package jeuRole;

public class Arme extends EntiteLivre{
	private Homme proprietaire;
	private String nature;
	public int degat;
	
	public Homme getProprietaire() {
		return proprietaire;
	}
	
	public String getNature() {
		return nature;
	}
	
	public boolean estPris() {
		return proprietaire != null;
	}
	
	public void prendre(Homme proprietaire) {
		this.proprietaire=proprietaire;
	}
	
	public void lacher() {
		this.proprietaire=null;
	}

	public void attaque(Dragon dragon) {
		livre.ecrire(proprietaire.getNom()+" : attaque "+dragon.getNom()+" avec son "+this.nature +"\n");
		dragon.subirAttaque(degat);
		
	}
}
