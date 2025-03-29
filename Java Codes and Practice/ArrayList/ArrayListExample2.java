
import java.util.ArrayList;

public class ArrayListExample2 {

  public  static void main(String[] args){
      
    ArrayList<Integer> numbers = new ArrayList<>();

    //Adding elements
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
   System.out.println(numbers);

    //accessing elements
    System.out.println("Elements at index 2 :" + numbers.get((2)));

    //updating an element 
    numbers.set(1,25);
    System.out.println(numbers);

    //Removing an element
    System.out.println("Contains 30?" + numbers.contains(30));

    //Printing the arrayList
    System.out.println("Updated List:"+numbers);
  }

}
