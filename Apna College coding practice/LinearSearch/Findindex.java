package LinearSearch;
//find the index of an element .

public class Findindex{

    public static int linearSearch(int numbers[] , int key){
        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }  
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2,3,45,67,7,42,1,};
        int key = 10;

        int index = linearSearch(numbers,key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("Key is at index:"+ index);
        }

    }
}