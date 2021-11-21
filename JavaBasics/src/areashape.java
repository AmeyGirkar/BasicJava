import java.util.InputMismatchException;
import java.util.Scanner;

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }
}

class Square
{
    double side;

    Square(double side)
    {
        this.side = side;
    }

    double getArea()
    {
        return side * side;
    }
}

class Circle
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return (22.0/7.0) * radius * radius;
    }
}

class Triangle{
	double height;
    double base;

    Triangle(double height, double base)
    {
        this.height = height;
        this.base = base;
    }
    double getArea()
    {
        return 0.5*height* base;
    }
}
	
public class areashape {
	
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Please enter shape choice");
		System.out.println("a -->Circle \n"
							+ "b -->Square \n"
							+ "c -->Rectangle \n"
							+ "d --> Triangle");
		
		char choice = sc.next().charAt(0);

		if(choice =='a') {
			
			System.out.println("You are selected circle");
			System.out.println("Please enter radius of circle");
			
			double radius=sc.nextDouble();
			Circle c = new Circle(radius);
			System.out.println("Circle Area ="+c.getArea());
			
		
			}
		else if(choice =='b') {
			System.out.println("You are selected square");
			System.out.println("Please enter side of square");
			
			double side =sc.nextDouble();
			Square s = new Square(side);
			System.out.println("Square Area ="+s.getArea());
			
		}
		
		else if(choice =='c') {
			System.out.println("You are selected rectangle");
			System.out.println("Please enter length of rectangle");
			double length  =sc.nextDouble();
			System.out.println("Please enter breadth of rectangle");
			double breadth  =sc.nextDouble();
			Rectangle r = new Rectangle(length,breadth);
			System.out.println("Rectangle Area ="+r.getArea());
			}
			
		else {
			System.out.println("You are selected triangle");
			System.out.println("Please enter height of Triangle");
			double height  =sc.nextDouble();
			System.out.println("Please enter base of Triangle");
			double base  =sc.nextDouble();
			Triangle t = new Triangle(height,base);
			System.out.println("Triangle Area ="+t.getArea());
		}
		
	}
	catch(InputMismatchException e) {
		System.out.println("Please enter only integer input");
		}
			}	
	}


	
	
