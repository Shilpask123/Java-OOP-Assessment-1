//4. Write a program to create a default constructor that prints “Object Created Successfully”.
public class DefaultConstructor {

    public DefaultConstructor() //Default Constructor
    {
        System.out.println("Object Created Successfully");
    }
    public static void main(String[] args){
        DefaultConstructor t=new DefaultConstructor(); //Automatically constructor called during object creation
    }
}
