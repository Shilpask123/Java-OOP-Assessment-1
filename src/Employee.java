//3. Write a program using the this keyword to differentiate between instance variables and local variables.
public class Employee {
    int id; //instance Variables
    double salary; //instance Variable

    public Employee(int id,double salary){
        //local Variable(id, salary) and instance variable both have the same name ,
        // so we use "this" keyword
        this.id=id;
        this.salary=salary;
    }

    void display(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String args[]) {
        Employee e = new Employee(40, 25467.76);
        e.display();
    }
}
