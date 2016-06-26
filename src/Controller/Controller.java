package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Friebat;
import Model.Marin;
import Model.Unit;

public class Controller {

	public static void main(String[] args) {
		
//		Unit m1 = new Marin();
//	    Unit m2 = new Marin();	
//	    Unit f1 = new Friebat();
//	    Unit f2 = new Friebat();
	    
	  
	    
	    List<Unit> list = new ArrayList<Unit>();
	    Scanner scanner = new Scanner(System.in);
	    while(true) {
	    	System.out.println("마린생성: 1");
	    	System.out.println("파벳생성: 2");
	    	System.out.println("마린 현황 보기: 3");
	    	System.out.println("유닛선택: 4");
	    	int input = scanner.nextInt();
	    	
	    	switch(input) {
	    	
	    	case 1 :
	    		System.out.println("이름을입력해");
	    		String name = scanner.next();
	    		Marin marin = new Marin(name);
	    		list.add(marin);
	    		break;

	    	case 2 :
	    		System.out.println("이름을입력해");
	    		String name1 = scanner.next();
	    		Friebat friebat = new Friebat(name1);
	    		list.add(friebat);
	    		break;
	    	
	    	case 3 :
	    		System.out.println(list.size() + "마리");
	    		for(int i=0; i<list.size(); i++){
	    			Unit unit = list.get(i);
		    		unit.name();
		    		break;
	    		}
	    	
	    	case 4 :
	    		for (int i = 0; i < list.size(); i++) {
	    			Unit unit = list.get(i);
	    			System.out.println( i +":"+ unit.getName());
				}
	    		
	    		int input1 = scanner.nextInt();
	    		if(input1 >0) {
	    			System.out.println("1:공격개시");
	    			System.out.println("2:이동하라");
	    		} else {
	    			System.out.println("1:공격개시");
	    			System.out.println("2:이동하라");
	    			break;
	    		}
	    	int input2 = scanner.nextInt();	
	    		Unit unit = list.get(input2);
			System.out.println("공격할수없는대상 : " + unit.getName());
			 
					
				
	    	}
	    	}
	    }
}




//TODO Auto-generated method stub


		//Unit m1 = new Marin();
	    //Unit m2 = new Marin();	
	    //Unit f1 = new Friebat();
	    //Unit f2 = new Friebat();
	    
	    
	    //m1.inform();
	    //m1.attack(f2);