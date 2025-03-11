package myPackage;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor - The Grand Birth of an Employee!
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        System.out.println("Behold! " + firstName + " " + lastName + " joins the corporate battlefield!");
    }

    // Getters - Because Privacy is Power!
    public int getID() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public int getSalary() { return salary; }

    // Setter - Because Fortune Can Change
    public void setSalary(int salary) {
        System.out.println("Fate shifts! Salary now dances at ₹" + salary);
        this.salary = salary;
    }

     public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        int hike = (salary * percent) / 100;
        salary += hike;
        System.out.println("Fortune smiles upon " + firstName + "! Salary rises by ₹" + hike + " to ₹" + salary);
        return salary;
    }
   
    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + firstName + " " + lastName + ", Salary: ₹" + salary + "]";
    }

   public static void main(String[] args) {
       System.out.println("The tale of corporate conquest begins...\n");
       Employee emp = new Employee(105, "Sarah", "Ibrahim", 60000);
       System.out.println(emp);
       System.out.println("Annual Salary: ₹" + emp.getAnnualSalary());
       emp.raiseSalary(10);
       System.out.println("After Raise: " + emp);
       System.out.println("\nThus starts the first chapter of Sarah’s journey in the corporate jungle...");
    }
}