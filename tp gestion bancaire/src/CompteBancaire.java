
public abstract class CompteBancaire {
	private String libelle;
	private float solde;
	private Devise devise;
	
	public CompteBancaire (String libelle, Devise devise ) {
		this.libelle=libelle;
		this.devise=devise;
	}
	
	public float getSolde() {
		return solde;
	}
	protected void setSolde(float solde) {
		this.solde = solde;
	}
	public String getLibelle() {
		return libelle;
	}
	public Devise getDevise() {
		return devise;
	}
	
	
	public void crediter(Couple <Devise, Float> c) {
		c=OutilsFinanciers.convertir(c,devise);
		this.solde +=c.getB();
	}
	
	@Override
	public String toString() {
		return "CompteBancaire : " + libelle +"("+ solde + "-" + devise + ")"	;
	}
	
	
}
