 
 import java.util.Scanner;//this is required in java for taking the inpur from the user.
 public class MyArray{
    public static void main(String[]args){
        int rollNo[]  = new int[5];

        int dummy[]={2,4,5,3,7,7};
       
       
          rollNo[0]=54;
          Scanner sc = new Scanner(System.in);
        //  System.out.println(rollNo);
        
        for(int i=0;i<3;i++){
            System.out.println("Enter "+i+ " element:");
            int element=sc.nextInt();
            rollNo[i]=element;
        


           // System.out.println(rollNo[i]);//this gives whole array  in vertical form
           // System.out.print(rollNo[i]+" ");//output will be like the array format
           //System.out.println(rollNo);//gives address of all array element
        }

        printArray(rollNo);
        insert(rollNo,1,22);
        printArray(rollNo);
        delete(rollNo,1);
        printArray(rollNo); //pass by reference
   
     }

public static void delete(int arr[],int pos){
   //shifting towards starting index
   for(int i=pos;i<=arr.length-2;i++){
      arr[i] = arr[i+1];

   }
   arr[arr.length-1]=0;
}


    //insert an element  
        public static void insert(int arr[],int pos,int element){
         int size = arr.length;
         if(pos<0 || pos>size-1){
            System.out.println("Wrong position");
            return;

         }
         //shifting towards the end. 
         for(int i=size-2;i>=pos;i--){
            arr[i+1 ] = arr[i];
         }
         arr[pos] = element;

        }
     
//traverse ur array==>ek ek krke sare element visit krna.
        public static void printArray(int arr[]){
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+",");
         }
         System.out.println();
        }
}