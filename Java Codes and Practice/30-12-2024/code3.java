//write a programme to calculate CGPA using marks of three subjects out of 100
//agr result float me chaiye hoto input bhi float me hi lene padte hai otherwise int me hi ata hai 
public class code3 {
    public static void main(String args[]){
        float maths=45;
        float english=95;
        float science=48;
        float cgpa=((maths+english+science)/3)/10;
        System.out.println(cgpa);
    }
}
