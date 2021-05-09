package Exercise4_5;

public class Cherry extends Fruits{
	
	private String type;
	private String colour; 
	private String placeofOrigin;
	private double weight;
	private double price;
	
	public Cherry(String n, String ty, String c, String o, double w, double p) {
		super(n);
		type = ty;
		colour = c;
		placeofOrigin = o;
		weight = w;
		price = p;
		
		System.out.print("Fruit\t\t: " + n);
		switch(placeofOrigin) {
		case "Russia":
			System.out.print(Info());
			break;
		case "Turkey":
			System.out.print(Info("Dark Sweet Cheries"));
			break;
		case"Washington":
			System.out.print(Info("Rainier", "Yellow"));
			break;
		}
		
		if (weight<2.0) {
			System.out.println("\nTotal weight(kg): " + weight);
			System.out.printf("Price per "+ n + ": RM%.2f\n", p);
			System.out.printf("If total weight less than 2 kg, the total price is RM%.2f\n", TotalPrice());
		}
		else if (weight>=2.0 && weight<=5.0) {
			double p2 = 85.50;
			System.out.println("\nTotal weight(kg): " + weight);
			System.out.printf("Price per "+ n + ": RM%.2f\n", p2);
			System.out.printf("If total weight more than 2 kg, the total price is RM%.2f\n", TotalPrice(p2));
		}
		else {
			double p3 = 82;
			double d = 0.10;
			Discount cc = new CherryDiscount();
			d= cc.rateofDiscount();
			TotalPrice(p3,d);
			System.out.println("\nTotal weight(kg): " + weight);
			System.out.printf("Price per "+ n + ": RM%.2f\n", p3);
			System.out.println("If the total weight more than 5 kg, You can get a 8% discount.");
			System.out.printf("Total Price is RM%.2f\n", TotalPrice(p3,d));
		}
		
	}
	
	public String Info() {//overloading method with no parameter
		return "\nType\t\t: " + type + "\nColour\t\t: " + colour + "\nPlace of Origin\t: " + placeofOrigin;
	}
		
	public String Info(String ty) {//overloading method with 1 parameter
		return "\nType\t\t: " + ty + "\nColour\t\t: " + colour + "\nPlace of Origin\t: " + placeofOrigin;
	}
		
	public String Info(String ty, String c) {//overloading method with 2 parameter
		return "\nType\t\t: " + ty + "\nColour\t\t: " + c + "\nPlace of Origin\t: " + placeofOrigin;
	}
	
	public double TotalPrice(){//overloading method with no parameter
		return price*weight; 
	}
	
	public double TotalPrice(double p2) {//overloading method with 1 parameter
		return p2*weight;
	}
	
	public double TotalPrice(double p3, double d) {//overloading method with 2 parameter
		return (p3*weight)-((p3*weight)*d);
	}
	
	public String printBenefit() { //overriding method
		return "Cherries contain vitamin C, A, K, potassium, magnesium, and calcium.";
	}
	
	public String toString() {
		return printBenefit();
	}

}
