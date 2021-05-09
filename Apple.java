package Exercise4_5;

public class Apple extends Fruits{
	
	private int quantity;
	private double price;
	
	public Apple(String n, int q, double p) {
		super(n);
		quantity = q;
		price = p;
		
		System.out.println("Fruit\t\t : " + n);
		if (quantity<10) {
			System.out.println("Quantity bought  : " + quantity);
			System.out.printf("Price per "+ n + "  : RM%.2f\n", p);
			System.out.printf("If quantity less than 10, the total price is RM%.2f\n", TotalPrice());
		}
		else if (quantity>=10 && quantity<=60) {
			double p2 = 1.99;
			System.out.println("Quantity bought  : " + quantity);
			System.out.printf("Price per "+ n + "  : RM%.2f\n", p2);
			System.out.printf("If quantity more than 10, the total price is RM%.2f\n", TotalPrice(p2));
		}
		else {
			double p3 = 1.29;
			double d = 0.05;
			Discount aa = new AppleDiscount();
			d= aa.rateofDiscount();
			TotalPrice(p3,d);
			System.out.println("Quantity bought  : " + quantity);
			System.out.printf("Price per "+ n + "  : RM%.2f\n", p3);
			System.out.println("If quantity more than 60, You can get a 5% discount.");
			System.out.printf("Total Price is RM%.2f\n", TotalPrice(p3,d));
		}
		
	}
	
	public double TotalPrice(){
		return price*quantity; 
	}
	
	public double TotalPrice(double p2) {
		return p2*quantity;
	}
	
	public double TotalPrice(double p3, double d) {
		return (p3*quantity)-((p3*quantity)*d);
	}
	
	public String printBenefit() { //overriding method
		return "\nApples are low in sodium, fat, and cholesterol and apples provide vitamin C and fiber. ";
	}
	
	public String toString() {
		return super.printBenefit();
	}

}
