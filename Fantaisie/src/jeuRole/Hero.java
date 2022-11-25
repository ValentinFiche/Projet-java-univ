package jeuRole;

public class Hero extends Homme {

	public Hero(String nom) {
		super(nom);
		super.vie=150;
	}
	@Override
	public void parler(String texte) {
		livre.ecrire("\nle heros ");
		super.parler(texte);
	}
	
	@Override
	public void  prendreEpee(Epee epee) {
		livre.ecrire("je prend lepee meme si pour cela je dois perdre des forces\n");
		if(vie<=0) {
			livre.ecrire(getNom() +" : a voulu prendre lepee mais son etat de fatigue ne lui permettait pas cet ultime effoert, il en est mort\n");
			mourir();
		}
	}
}
