public class HollowRectangle {
    
    public static void main(String[] args){
        
        int n = 4 ;
        int m = 5 ;
        //outer loop

        for (int i=1 ; i <= 4 ; i++){
            for(int j = 1 ; j <= m ; j++){
                //cell -< (i,j)
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
 
    }
}
