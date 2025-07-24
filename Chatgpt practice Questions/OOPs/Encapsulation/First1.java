
 class Student {
    //step 1: make variables private:data hiding
    private String name;
    private int age;

    //step 2 : Create public methods to access/update data
    public void setName(String name){
       this.name = name; 
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }
}

public class First1{
    public static void main(String[] args){
         //step 3: create an object
         Student s1 = new Student();

         //step 4: set and get data using methods
         s1.setName("Ruchita");
         s1.setAge(21);

         System.out.println("Student Name: " + s1.getName());
         System.out.println("Student Age: "+ s1.getAge());
    }
}

/* getter and setters:
 * 1)getters and setters allowed controlled access,not direct or blind access.
 * 2)without getter and setter anyone can set anything , but with you controlled wht is allowed.
 * 3)✅ Top Reasons We Use Getters and Setters:
 * -->data hiding -> we keep variables private and use public methods (getter/setter) so:
 * -outside code cant directly access or change the data
 * -the class itself controls how and when data is modified or viewed
 * 4)2. ✅ Validation Before Setting
 * -you can add logic to prevent invalid data
 * 5)🧠 Read-only / Write-only Access
   -you can create only getter(no setter) - makes variable read only
   -you can create only setter(ni getter) - makes variable write only
 */

 /*
  * 1)data hiding = protects internal variables from outside misuse
  2)validation = prevents setting invalid data
  3)read/write control= allows custom access levels
  4)flexibility = internal implementation can change without affecting external code

  */