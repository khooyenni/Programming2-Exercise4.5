package Exercise4_5;

public class FujiApple extends Apple{
	
	public FujiApple(String n, int q, double p){
		super(n,q,p);
	}
	
	public String printBenefit() { //overriding method
		return "Fuji apples can boosts brain health.";
	}
	
	public String toString() { //overriding method
		return printBenefit();
	}

}
