
public class StarBuzzCoffee {
Beverage beverage;
	public static void main(String[] args) {

 Beverage b1 = new Espresso();
 System.out.println(b1.getDescription1() +" $"+b1.cost());
	
 Beverage b2 = new HourseBlend();
 b2 = new Mocha(b2);
 b2 = new whip(b2);
 System.out.println(b2.getDescription1() +" $"+b2.cost());	
	
 Beverage b3 = new Decaf();
 b3 = new SteamedMilk(b3);
 b3 = new whip(b3);
 b3 = new Soy(b3);
 System.out.println(b3.getDescription1() +" $"+b3.cost());		
	
	
 Beverage b4 = new DarkRoast();

 b4 = new Mocha(b4);
 b4 = new Soy(b4);
 System.out.println(b4.getDescription1() +" $"+b4.cost());	
	
	}

}
