package OOPs.Inheritannce;


class Animal{
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class puppy extends Dog{
    void weep(){
        System.out.println("Puppy weeps");
    }

}
public class multilevel {
    public static void main(){
        puppy p = new puppy();

     p.eat();//from animal
     p.bark();//from dog
     p.weep();//from puppy 
    }
}
