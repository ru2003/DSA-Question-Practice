public class Diamond {
    public static void main(String[] args){
        int n=4 ;
        
      
        for (int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=n-1 ; j++)
            System.out.print("");
        }
        for (int j=1 ; j<=2*i-1 ; j++){
            System.out.print("*");
        }
        System.out.println();

    }
    
}
