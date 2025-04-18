package ObjectorientedProgramming;

public class Ooops {
    
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

classStudent {
    String name;
    int age;
    float percentage; //cgpa

    void calculatepercentage(int phy, int chem , int math) {
        percentage = (phy + chem + math) / 3;
    }
}
