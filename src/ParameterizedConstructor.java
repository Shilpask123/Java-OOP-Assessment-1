//5. Write a program with a parameterized constructor that takes two numbers and prints their sum
public class ParameterizedConstructor {

    public ParameterizedConstructor(int num1, int num2){
        int sum=num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is :"+sum);
    }
    public static void main(String args[]){
        ParameterizedConstructor pc=new ParameterizedConstructor(10,20);
    }
}
