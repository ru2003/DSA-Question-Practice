
public class First1 {
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