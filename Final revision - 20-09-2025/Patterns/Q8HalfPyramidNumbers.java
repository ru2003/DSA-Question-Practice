/*
 * Half pyramid with numbers.

1
12
123
1234
 */
/*
public class Q9HalfPyramidNumbers {
     public static void main(String[] args){
        int m=5;

        for(int i=1;i<=m;i++){
            for(int j=1 ; j<=i;j++){
                if(j==1){
                   System.out.print("1");
                }else if(j==2){
                   System.out.print("2");
                }else if(j==3){
                    System.out.print("3");
                }else if(j==4){
                    System.out.print("4");
                }
               
            }
             System.out.println();
        }
     }    
}
      */

      public class Q8HalfPyramidNumbers{
        public static void main(String[] args){
            int m=5;
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
      }
