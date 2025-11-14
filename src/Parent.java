//9. Write a program for method overriding where parent class has method message() and child class overrides it.
public class Parent {
    void message()
    {
        System.out.println("Inside Parent class");
    }
}
class Child extends Parent{
    @Override
    void message(){
        System.out.println("Inside Child class");
    }
    public static void main(String[] args){
        Parent p=new Parent();
        p.message();  // calling parent class method
        p=new Child(); //Parent reference to child object for accessing overidden method
        p.message(); // calling child class method
    }
}

