//2. Create a class with a method display() and call it using an object.
public class Student {
    void display(){
        String name="Shilpa";
        int rollNo=40;
        System.out.println("Student Name: "+name);
        System.out.println("Student Rollno: "+rollNo);
    }
    void display(String name){
        System.out.println("My name is: "+name);

    }
    public static void main(String[] args){
        Student s=new Student();
        s.display();
        s.display("Shilpa");
    }
}
