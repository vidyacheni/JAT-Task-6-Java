package myPackage;

class Person 
{
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Create a class called "Person" with attributes "name" and "age". Also, create a constructor and getter methods for the attributes.
		Person p =new Person("Vidya",32);
		System.out.println("Behold! A soul named " + p.getName() + " was born.");
		System.out.println("Time has danced for " + p.getAge() + " graceful turns of the sun.");

	}

}
