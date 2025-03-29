//calcualte the average marks from an array containing marks of all student in physics

public class average {
    public static void main(String []args){

        int []marks= {12,34,56,78,34};
        int sum =0;

        for(int element : marks){
            sum = sum +element;

        }
        System.out.println("the value of average is " + sum/marks.length);
    }
    
}
