package Demo;

public class Calculator {
	//Below we are defining add()
			public void add(int a, int b) { //a and b are the parameters of the method
			System.out.println(a+b);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		//object.method()
		obj.add(10, 20); //We are calling the add(), 10 and 20 are the arguments we are providing to the add()
		

	}

}
