//8. Write a program for multilevel inheritance (Grandfather → Father → Son) where each class has its own method. Call all methods using Son object.
public class GrandFather {
    void property1(){
        System.out.println("Grand Father");
    }
}
class Father extends GrandFather{
    void property2(){
        System.out.println("Father");
    }
}
class Son extends Father{
    void property3(){
        System.out.println("Son");
    }
    public static void main(String[] args){
        Son s=new Son();
        s.property1();
        s.property2();
        s.property3();
    }
}
