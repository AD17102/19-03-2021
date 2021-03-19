public class Car extends Veichle{

	public Car(String mark, String model, int wheels, int doors) {
		super(mark, model, wheels);
		
	}


	private int doors;

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String printInfo() {
		return "Mark: " + getMark() + " Model: " + getModel() + " Number of wheels: " + getWheels() + " Number of doors" + getDoors();
		

	}

	
	public static  void main(String[] args) {

		Car car1 = new  Car("volvo", "g15", 4, 4);
		System.out.println(car1.printInfo());
		
		
		
	}
}
	

	
