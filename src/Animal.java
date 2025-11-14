//7. Write a simple inheritance program where class Animal has a method eat() and class Dog has method bark(). Create object of Dog and call both methods.
public class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
