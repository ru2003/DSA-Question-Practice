package ObjectorientedProgramming;

public class Ooops {
    /* by convention ye main function  public hona important hai , and access specifieer void hona jaruri hain. */
    public static void main(String[] args) {
         /*new ==> Pen class ka p1 object create kiya and then new keyword se jagah bana rhe hai jaha sari properties store hogi   */
         Pen p1 = new Pen();
         p1.setColor("Blue");
         System.out.println(p1.color);
    }
    
}


class Pen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; //cgpa

    void calculatepercentage(int phy, int chem , int math) {
        percentage = (phy + chem + math) / 3;
    }
}
