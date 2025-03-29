public class RhombusSolid {
    public static void main(String[] args){

        int n=5 ;
        for(int i=1 ; i<=n ; i++){
            //spaces.
             for( int j=1 ; j<=n-i ; j++){ //here n-i is very important 
                System.out.print(" ");
             }
             for(int j=1 ; j<=n ; j++){
                System.out.print("*");
             }
             System.out.println();
        }
    }
}
 