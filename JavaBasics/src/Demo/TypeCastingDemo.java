package Demo;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int numl = 20;
		double num2 = numl; //Implicit Conversion
		System.out.println(num2);
		double num3 = 54.55;
		int num4 = (int)num3; //Explicit Conversion
		System.out.println(num4);
		String num5 = "20";
		String num7 = "25";
		System.out.println(num5+num7); //Concatenation
		int num6 = Integer.parseInt(num5); //Explicit Conversion
		System.out.println(num6 + 5); //Addition of 2 numbers
		
	}

}
