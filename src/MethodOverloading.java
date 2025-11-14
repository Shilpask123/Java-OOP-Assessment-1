//10. Write a program for method overloading where a class has two add() methods—one adds 2 numbers, and another adds 3 numbers.
public class MethodOverloading {
    void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is :"+sum);
    }
    void add(int num1, int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println("Sum of "+num1+" , "+num2+" and "+num3+" is :"+sum);
    }
    void add(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum of two number :"+sum);
    }

    public static void main(String args[]){
        MethodOverloading mo=new MethodOverloading();
        mo.add();
        mo.add(10,20);
        mo.add(10,20,30);
    }
}
