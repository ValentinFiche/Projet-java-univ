package jeuRole;

public class Arc extends Arme{
	private int nbrFleche;
	public Arc(int nbrFleche) {
		super();
		this.degat=30;
		this.nbrFleche=nbrFleche;
	}
	@Override
	public void attaque(Dragon dragon) {
		livre.ecrire(getProprietaire().getNom()+" attaque"+dragon+" avec son "+getNature()+"\n");
		if(nbrFleche>=1) {
			dragon.subirAttaque(degat);
			nbrFleche--;
		}else {
			livre.ecrire("malheureusement "+ getProprietaire().getNom()+"ne possedait plus de fleches \n");
		}

	}
}
