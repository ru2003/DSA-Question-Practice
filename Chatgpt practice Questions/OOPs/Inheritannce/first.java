package OOPs.Inheritannce;


class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}


class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks.");
    }
}
public class first {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        //access method from parent class
        myDog.eat();

        //access ethod from child class
        myDog.bark();
    }
}
