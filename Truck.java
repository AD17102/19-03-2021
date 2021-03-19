
public class Truck extends Veichle{

	private int weight;
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Truck(String mark2, String model2, int wheels2, int wight) {
		super(mark2, model2, wheels2);
	}

	

	@Override
	String printInfo() {
		return "Mark: " + getMark() + " Model: " + getModel() + " Number of wheels: " + getWheels() + " maximum weight" + getWeight();	
		
	
	}
	public static void main(String[] args) {
	Truck truck1 = new Truck("toyota", "Supreme", 6, 1200);
	System.out.println(truck1.printInfo());
		
	}	
}
