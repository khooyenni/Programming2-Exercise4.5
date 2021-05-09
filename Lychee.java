package Exercise4_5;

public class Lychee extends Fruits {

	private String type;
	private String seed; 
	private String placeofOrigin;
	private double weight;
	private double price;
	
	public Lychee(String n, String ty, String s, String o, double w, double p) {
		super(n);
		type = ty;
		seed = s;
		placeofOrigin = o;
		weight = w;
		price = p;
		
		System.out.print("Fruit\t\t: " + n);
		switch(type) {
		case "Souey Tung":
			System.out.print(Info());
			break;
		case "Wai Chee":
			System.out.print(Info("South-East Qld"));
			break;
		case"Tai So":
			System.out.print(Info("Yellow", "Small"));
			break;
			
		}
		
		if (weight<2.0) {
			System.out.println("\nTotal weight(kg): " + weight);
			System.out.printf("Price per "+ n + ": RM%.2f\n", p);
			System.out.printf("If total weight less than 2 kg, the total price is RM%.2f\n", TotalPrice());
		}
		else if (weight>=2.0 && weight<=5.0) {
			double p2 = 10.50;
			System.out.println("\nTotal weight(kg): " + weight);
			System.out.printf("Price per "+ n + ": RM%.2f\n", p2);
			System.out.printf("If total weight more than 2 kg, the total price is RM%.2f\n", TotalPrice(p2));
		}
		else {
			double p3 = 8.50;
			double d = 0.10;
			Discount ll = new LycheeDiscount();
			d= ll.rateofDiscount();
			TotalPrice(p3,d);
			System.out.println("\nTotal weight(kg): " + weight);
			System.out.printf("Price per "+ n + ": RM%.2f\n", p3);
			System.out.println("If the total weight more than 5 kg, You can get a 10% discount.");
			System.out.printf("Total Price is RM%.2f\n", TotalPrice(p3,d));
		}
		
	}
	
	public String Info() {//overloading method with no parameter
		return "\nType\t\t: " + type + "\nSize of Seed\t: " + seed + "\nPlace of Origin\t: " + placeofOrigin;
	}
		
	public String Info(String o) {//overloading method with 1 parameter
		return "\nType\t\t: " + type + "\nSize of Seed\t\t: " + seed + "\nPlace of Origin\t: " + o;
	}
		
	public String Info(String s, String o) {//overloading method with 2 parameter
		return "\nType\t\t: " + type + "\nSize of Seed\t\t: " + s + "\nPlace of Origin\t: " + o;
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
		return "Lychee contain Magnesium, copper, iron, vitamin C, manganese and folate.";
	}

	public String toString() { //overriding method
		return printBenefit();
	}

}
