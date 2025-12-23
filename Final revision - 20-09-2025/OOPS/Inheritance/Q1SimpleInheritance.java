package OOPS.Inheritance;


  class Parent {
        void show() {
            System.out.println("This is Parent Class.");
        }
    }

    class Child extends Parent{
        void display() {
            System.out.println("Child class method.");
        }
    }
public class Q1SimpleInheritance {
    public static void main(String[] args){
        Child c = new Child();
        c.show();
        c.display();

    }
}
