
public class first {
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
         first s1 = new first();

         //step 4: set and get data using methods
         s1.setName("Ruchita");
         s1.setAge(21);

         System.out.println("Student Name: " + s1.getName());
    }
}