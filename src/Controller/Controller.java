package Controller;

import Model.Friebat;
import Model.Marin;
import Model.Unit;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Unit m1 = new Marin();
	    Unit m2 = new Marin();	
	    Unit f1 = new Friebat();
	    Unit f2 = new Friebat();
		
	    
	    
	    m1.inform();
	    m1.attack(f2);
	    
	    
	    
	
		
		
	}

}
