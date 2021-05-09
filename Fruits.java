package Exercise4_5;

public abstract class Fruits {
	
	private String name;
	
	public String printBenefit() {
		return "People who eat more fruits as part of an overall healthy diet are likely to have a reduced risk of some chronic diseases.";
	}
	
	public Fruits(String n) { 
		name = n;
		System.out.println(name + " constructor is invoked.");
	}
	
	public abstract double TotalPrice();
	public abstract double TotalPrice(double p2); 
	public abstract double TotalPrice(double p3, double d);
	public abstract String toString();
	
}
