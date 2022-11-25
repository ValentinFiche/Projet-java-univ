package jeuRole;

public abstract class EtreVivant extends EntiteLivre{
	protected int vie;
	private String nom;
	protected Bataille bataille;

	public EtreVivant(int vie, String nom) {
		this.vie = vie;
		this.nom = nom;
	}

	public int getVie() {
		return vie;
	}

	public String getNom() {
		return nom;
	}

	public Bataille getBataille() {
		return bataille;
	}

	public void rejointBataille(Bataille bataille) {
		this.bataille = bataille;
	}

	public abstract void mourir() ;
			
	public void subirAttaque(int degat) {
		livre.ecrire(nom +" : subit une violente attaque,"); 
		this.vie = vie - degat;
		if (vie <=0) {
			livre.ecrire(" trop violente pour survivre \n"); 
			mourir();
		}else {
			livre.ecrire(" mais il parvient à se relever\n"); 
		}

	}

}
