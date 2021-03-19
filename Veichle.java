
public abstract class Veichle {



	public Veichle(String mark2, String model2, int wheels2) {
	}


	private String Mark;
	private String Model;
	private int wheels;

	
abstract String printInfo();
	
	


	public  String getMark() {
	return Mark;
}


public void setMark(String mark) {
	Mark = mark;
}


public String getModel() {
	return Model;
}


public void setModel(String model) {
	Model = model;
}


public int getWheels() {
	return wheels;
}


public void setWheels(int wheels) {
	this.wheels = wheels;
}


}


