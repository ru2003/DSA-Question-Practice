package Recursion;

// WAF to find the first occurence of an element in an array.
// given key first time konse inde pe occur krega , woh index return krna hai.
public class FirstOcuurence {

    public static int firtOccurenceofelement(int arr[] , int key , int i) {
        //base case which is requried to stop the function.
        if(i == arr.length) {
            return -1;
        }
        if (arr [i] == key) {
            return i;
        }//in recursion this is the only 1 case which is getting chencked

        return firtOccurenceofelement( arr, key , i+1);//after that its just a assumption that ki baki ke bache hue check ho jayenge.
    }
    public static void main(String[] args) {

    }
    
}
