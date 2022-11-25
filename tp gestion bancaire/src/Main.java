
public class Main {
	public static void main(String[] args) {
		
		CompteCourant c1= new CompteCourant("tom",Devise.Euro);
		CompteCourant c2= new CompteCourant("kez",Devise.Dollars);
		System.out.println(c1);
		System.out.println(c2);
		c1.crediter(new Couple<>(Devise.Euro, 100F));
		c2.crediter(new Couple<>(Devise.Dollars, 100F));
		System.out.println(c1);
		System.out.println(c2);
	}
}
