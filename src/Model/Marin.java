package Model;

public class Marin extends Unit{
	public Marin() {
		super(100);
	}
	 
	
	
	
	public int HP = 50;
	public int damige = 5;
	
	public void inform0(){
		
	 System.out.println("체력은"+ this.HP);
//	 System.out.println("데미지는"+this.dam);
	 System.out.println("입니다");
	}
	
	public void attack(Marin target){
		target.HP = target.HP - this.damige;
		
	
	
		if(target.HP>0){
			System.out.println(target.HP);
			
		} else {
			System.out.println("사망");
		}		
		}
	

	public void attack(Friebat target){
		target.HP = target.HP - this.damige;
		
		if(target.HP>0){
			System.out.println(target.HP);
		} else {
			System.out.println("사망");
		}			
	}
	
	}


