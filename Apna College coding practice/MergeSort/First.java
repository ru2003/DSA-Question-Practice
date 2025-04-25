package MergeSort;

public class First {
   public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) { 
        System.out.print(arr[i] + " ");
    }
    System.out.println();
   }
    

   //recursive function 
   public static void mergeSort(int arr[] , int si, int ei) {
        if(si >= ei) {
            return;//base case for recusrion
        }
         //work
         int mid = si + (ei - si)/2; //(si+ei)/2
         mergeSort(arr,si,mid); //left part , recursive function hai woh. recursively left chhote part ko sort kr dega. 
         mergeSort(arr, mid+1, ei);//right part
         merge(arr,si,mid,ei);
   }


   //right and left part dono sorted hokr agye recursive function se .
   public static void merge(int arr[], int si, int mid, int ei) {
    //left(0,3)=4 right(4,6) =3 -->6-0+1
    int temp[]= new int[ei-si+1];
    int i = si;  //iterator for left part 
    int j = mid+1; //iterator for right part
    int  k = 0;  //iterator for temp arr

     while(i <= mid && j <= ei) {
        if(arr[i] < arr[j]) {
            temp[k] = arr[i];
            i++;
            
        }else {
            temp[k] = arr[j];
            j++;
           
        }
        k++;
     }
     //agr first part ke khatam hogye sare and 2nd part ke bache hue hai uske liye while loop
     //then later second part ke hogya and first part kebache hue hai uske liye while loop likhan padega.
     //left part 
     while(i <= mid) {
        temp[k++] = arr[i++];
     }
     //right part
     while(j <= ei) {
        temp[k++] = arr[j++];
     }
     //copy temp to origin arr
     for(k=0, i=si; k<temp.length; k++, i++) {
          arr[i] = temp[k];
     }
}   

   

    public static void main(String[] args) {
        int arr[] = {6 , 3 , 9 , 5 , 2 , 8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
   
}
