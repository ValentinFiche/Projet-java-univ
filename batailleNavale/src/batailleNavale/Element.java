package batailleNavale;

public class Element {
	public char lettre;
	public int chiffre;
	public boolean elementTouche = false;
	
	public Element(char lettre, int chiffre) {
		this.lettre = lettre;
		this.chiffre = chiffre;
	}
	
	public boolean isElementToucher() {
		return elementTouche;
	}
	
	public boolean verifierCoordonnee(char lettre, int chiffre) {
		
		return this.lettre==lettre && this.chiffre == chiffre;
	}
	
	public void touche() {
		elementTouche=true;
	}
	
	public static void main(String[] args) {
		Element element = new Element ('B',3); 
		System.out.println("l'�l�ment a-t-il pour coordonn�e('A',3) ?" + element.verifierCoordonnee('A', 3));
		System.out.println("l'�l�ment a-t-il pour coordonn�e('B',3) ?" + element.verifierCoordonnee('B', 3));
		System.out.println("l'�l�ment est-il touch� ?" + element.isElementToucher());
		System.out.println("Attaque de l'�l�ment"); 
		element.touche();
		System.out.println("l'�l�ment est-il touch� ?" + element.isElementToucher());		
		}
	
}
