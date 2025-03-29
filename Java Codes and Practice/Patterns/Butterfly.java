public class Butterfly {
  public static void main(String[] args){
    int n=4;
    for(int i=1 ; i<=4 ;i++ ){
        for(int j=1 ; j<=i ;j++){
            System.out.print("*");
        }
        for(int j=1 ; j<=n-i ; j++){
            System.out.print(" "); //space require here.
        }
        
        for(int j=1 ; j<=n-i ; j++){
            System.out.print(" "); //space require here.
        }
        for(int j=1 ; j<=i ;j++){
            System.out.print("*");
        }
        System.out.println();
    }
      

       //reverse patterrn.
       for(int i=n ; i>=1 ; i--){
        for(int j=1 ; j<=i ; j++ ){
            System.out.print("*");
        }
        for (int j=1 ; j<=n-i ; j++){
            System.out.print(" "); //space

        }
        for (int j=1 ; j<=n-i ; j++){
            System.out.print(" "); //space

        }
        for(int j=1 ; j<=i ; j++ ){
            System.out.print("*");
        }
        System.out.println("");



       }

       
  }   
}
