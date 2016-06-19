package Model;

public class Friebat extends Unit{
		public Friebat() {
				super(120);
					}
	
	public int HP = 50;
	public int damige = 5;
	public int flashdam = 2;
	
		
	public void attack(Marin target){
		target.HP = target.HP - this.damige;

	if(target.HP>0){
		System.out.println(target.HP);
	} else {
		System.out.println("»ç¸Á");
	}			
	}

	
	public void attack1(Friebat target){
		target.HP = target.HP - this.damige - this.flashdam;
		
		if(target.HP>0){
			System.out.println(target.HP);
		} else {
			System.out.println("»ç¸Á");
		}			
	}

}
	

