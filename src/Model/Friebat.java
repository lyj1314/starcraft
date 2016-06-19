package Model;

public class Friebat extends Unit{
		public Friebat() {
			super(120);
		}
	int HP = 50;
	int damige = 5;
	int flashdam = 2;
	
		
	public void attack(Marin target){
		target.HP = target.HP - this.damige;

	if(target.HP>0){
		System.out.println(target.HP);
	} else {
		System.out.println("»ç¸Á");
	}			
	}

	
	public void attack(Friebat target){
		target.HP = target.HP - this.damige - this.flashdam;
		
		if(target.HP>0){
			System.out.println(target.HP);
		} else {
			System.out.println("»ç¸Á");
		}			
	}

}
	

