package OOPS.Inheritance;
/*✅ Question 1: Multilevel Inheritance
📝 Problem:

Create a class hierarchy:

Employee

Developer

BackendDeveloper

Each class should add one method. */
class Employee {
    void work() {
        System.out.println("Employee Working.");
    }
}

class Developer extends Employee{
    void code() {
        System.out.println("Developing coding.");
    }
}

class BackendDeveloper extends Developer{
     void backend() {
        System.out.println("Backedn developer working on the APIs.");
     }
}
public class multilevel {
    public static void main(String[] args){
        BackendDeveloper bd = new BackendDeveloper();
        bd.backend();
        bd.code();
        bd.work();
        
    }
}
