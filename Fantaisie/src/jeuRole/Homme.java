package jeuRole;
public class Homme extends EtreVivant {

	protected  Arme maPossession;
	
	public Homme(String nom) {
		super(100, nom);
	}

	public void parler(String texte) {
		livre.ecrire(getNom() + " : " + texte+"\n");
	}

	@Override
	public void rejointBataille(Bataille bataille) {
		bataille.ajouter(this);
		super.rejointBataille(bataille);
	}
	@Override
	public void mourir() {
		bataille.eliminer(this);
		livre.ecrire("c'est ainsi que le courageaux" + getNom() + " mourut. \n");
		lacher();
	}
	
	public void lacher() {
		livre.ecrire(getNom()+" : a lacher " +maPossession.getNature());
		maPossession.lacher();
		maPossession=null;
	}
	
	public void prendre(Arme arme) {
		if(arme instanceof Epee) {
			prendreEpee((Epee)arme);
			}
		if(maPossession != null) {
            maPossession.lacher();
        }
        
        if(arme.estPris()) {
            Homme proprietaire = arme.getProprietaire();
            livre.ecrire(getNom() + " : " + proprietaire.getNom() + " peux tu me laisser ton " + arme.getNature() + "? \n");
            livre.ecrire(proprietaire.getNom() + " : pas de soucis, cela me permettre de reprendre mon soufle \n");
            livre.ecrire(getNom() + " : Je prends" + arme.getNature() + ".\n");
            arme.lacher();
            proprietaire.lacher();
        }
        maPossession = arme;
        arme.prendre(this);
	}
	
	public void combattre(Dragon dragon) {
		if(maPossession==null) {
			mourir();
		}else {
			maPossession.attaque(dragon);
		}

	}
	public void  prendreEpee(Epee epee) {
		this.vie = vie - 10;
		livre.ecrire("je prend lepee meme si pour cela je dois perdre des forces\n");
		if(vie<=0) {
			livre.ecrire(getNom() +" : a voulu prendre lepee mais son etat de fatigue ne lui permettait pas cet ultime effoert, il en est mort \n");
			mourir();
		}

	}
}
