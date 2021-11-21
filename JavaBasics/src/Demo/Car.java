package Demo;

public class Car {
	private String color;
	private String engineType;
	public Car(String color, String engineType) {
		this.color = color;
		this.engineType = engineType;
	}
	public void printCarInfo() {
		System.out.println("Color of car = " + color);
		System.out.println("Type of engine = " + engineType);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mercedes = new Car("Silver", "Petrol");
		Car audi = new Car("Black", "Diesel");
		audi.printCarInfo();
	}

}
