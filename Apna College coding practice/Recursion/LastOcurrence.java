package Recursion;
//WAF to find the last occurence of an element in an array.jo key chaiye woh sabse jyada last konse index me ayi hain.
public class LastOcurrence {
    public static int lastOccurenc(int arr[] , int key,int i) {
            if(i==arr.length) {
                return -1;
            }
            int isFound = lastOccurenc(arr, key,i+1);
            if(isFound == -1 && arr[i] == key) {
                return i;
            }
            return isFound;

    }
    public static void main(String[] args) {
         int arr[] = {4,6,2,1,6,3,2,6};
         System.out.println(lastOccurenc(arr, 02, 0));
    }
    
}
