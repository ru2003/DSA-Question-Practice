/*
 * Hollow right triangle.

*
**
* *
*  *
****
 */
public class Q7HollowTriangle {
    public static void main(String[]args){
        int n=5;
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || i==n ||  i==j ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}
