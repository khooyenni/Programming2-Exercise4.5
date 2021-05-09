package Exercise4_5;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*****APPLE******");
		Apple a = new Apple("Apple", 5, 2.50);
		System.out.println(a);
		
		/*System.out.println("\n*****Lychee*****");
		Lychee l = new Lychee("Lychee", "Souey Tung", "Large", "Australia");
		System.out.println(l);
		
		System.out.println("\n*****Cherry*****");
		Cherry c = new Cherry("Cherry", "Red Cheries", "Red", "Russia");
		System.out.println(c);*/
		
		System.out.println("\n*****Granny Smith Apple*****");
		GrannySmithApple g = new GrannySmithApple("Granny Smith Apple", 3, 3.99);
		System.out.println(g);
		
		System.out.println("\n*****Fuji Apple*****");
		FujiApple f = new FujiApple("Fuji Apple", 62, 2.99);
		System.out.println(f);
		
	}
	

}
