package myPackage;

//Create a class circle
public class Circle {
	// with radius as data member. 
	private double radius;
	private String color;

	
	//Create two constructors (no argument, and two arguments)
	public Circle()
	{
		this.radius=1.0;
		this.color="blue";
	}
	
	public Circle(double rad, String col)
	{
		this.radius=rad;
		this.color=col;
	}
	
	//a method to calculate Circumference.
	public double circumference()
	{
		return 2*3.14*this.radius;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Grand Circle Festival!\n");

        // A circle is born, as fate decides.
        Circle c1 = new Circle();
        Circle c2 = new Circle(2, "green");
        Circle c3 = new Circle(5, "red");

        // The eternal truth of all circles—round and round they go!
        System.out.println("\nDestiny speaks! Here are the sacred numbers:");
        System.out.println("The circumference of the blue circle is: " + c1.circumference());
        System.out.println("The circumference of the green circle is: " + c2.circumference());
        System.out.println("The circumference of the red circle is: " + c3.circumference());

        System.out.println("\n And thus, the circles roll forward, whispering secrets of geometry!");
	}

}
