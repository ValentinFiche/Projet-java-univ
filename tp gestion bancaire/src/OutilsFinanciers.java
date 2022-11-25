
public class OutilsFinanciers {
	
	public static float tauxDeChange(Devise d1, Devise d2) {
		
		switch (d1) {
		  case Euro:
		    switch (d2) {
		    	case Euro:
		    		return 1F;
		    	case Dollars:
		    		return 1.31486F;
		    }
		  case Dollars:
		    switch (d1) {
		    	case Euro:
		    		return 0.760541F;
		    	case Dollars:
		    		return 1F;
		    }
		}
		return 1F;
	}
	
	public static Couple<Devise , Float> convertir (Couple <Devise , Float> couple ,Devise d) {
		Couple<Devise , Float> c = new Couple<> (d , couple.getB()*tauxDeChange (couple.getA() , d));
		return c;
	}
	
}
