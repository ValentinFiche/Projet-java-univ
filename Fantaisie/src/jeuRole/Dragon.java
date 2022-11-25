package jeuRole;
public class Dragon extends EtreVivant{
	int nbBouleDeFeu =10;

	public Dragon(String nom) {
		super(200, nom);
	}
	
	@Override
	public void rejointBataille(Bataille bataille) {
		bataille.ajouter(this);
		super.rejointBataille(bataille);
	}
	public void mourir() {
		bataille.eliminer(this);
		livre.ecrire("c'est ainsi que le dragon" + getNom()+" mourut \n");
	}
	
	public void cracheBouleFeu(Homme homme) {
		if (nbBouleDeFeu>0) {
			livre.ecrire(getNom() +"crache une boule de feu sur " + homme.getNom()+"\n");
			nbBouleDeFeu-=1;
		}else {
			livre.ecrire(getNom() +" n'avais plus de feu en lui " +homme.getNom() +" a eu beaucoup de chance\n");
		}
		
		
	}
}
