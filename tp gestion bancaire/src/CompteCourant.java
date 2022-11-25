
public class CompteCourant extends CompteBancaire {

	public CompteCourant(String libelle, Devise devise) {
		super(libelle, devise);
		
	}

	public void debitable(Couple <Devise, Float> c) {
		c=OutilsFinanciers.convertir(c,this.getDevise());
		this.setSolde(getSolde() -c.getB());
	}
}
