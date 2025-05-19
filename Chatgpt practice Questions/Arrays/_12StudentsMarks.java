package Arrays;
/*12.Problem 6: Given marks of 100 students, count how many scored more than 80%. */
public class _12StudentsMarks {
     

    public static int morethaneightperc(int[] arr) {
        int count =0;
        for(int marks:arr){
           if(marks>80) {
            count++;
           }
        }
        return count;

    }
    public static void main(String[] args) {
     int[] array = {
        12,23,78,67,54,33,22,77,88,
        34,99,778,98,80,67,5,43,23,88,90,
        98,98,87,76,65,54,43,45
     };

     int result =morethaneightperc(array);
     System.out.println(result);///final is reserved keyword in java.you cannot use in variable name.
    }
}
