
public class SteamedMilk extends ComdimentDecorator {
	Beverage beverage;
	public  SteamedMilk (Beverage beverage){
		this.beverage =  beverage;}
	
		// TODO Auto-generated constructor stub
	
	@Override
	public String getDescription1() {
		// TODO Auto-generated method stub
		return beverage.getDescription1()+",SteamedMilk";
	}
	public  double cost(){
		return 0.10+beverage.cost();
}
}
