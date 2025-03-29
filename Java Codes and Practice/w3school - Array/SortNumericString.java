
/* write a java programme to sort a numeric array and string array */

import java.util.Arrays ;

public class SortNumericString{
    public static void main(String[] args){

        //Numeric array
        int[] array = {3,4,7,2,9,10};

        //String array
        String[] words = {"ruchita" , "cherry" , "grapes" , "kaveri"};
        
        //sorting the numeric array
        Arrays.sort(array);
        System.out.println("sorted numeric array is:" + Arrays.toString(array));

        //sorting the string array
        Arrays.sort(words);
        System.out.println("Sorted String array:"+Arrays.toString(words));
    }


    }
 

    /* 
     
Sorting Type	Method
Default (A-Z)	Arrays.sort(array)
Case-Insensitive	Arrays.sort(array, String.CASE_INSENSITIVE_ORDER)
Reverse Order	Arrays.sort(array, Collections.reverseOrder())
Sort by Length	Arrays.sort(array, Comparator.comparingInt(String::length))
     */