public class RightAngleTriangle {
    
    public static void main(String[] args){

        int n = 4;
        //outer loop
        for(int i=1 ; i<=n ; i++){
            //inner loop -> space print
            for(int j=1 ; j<=n-i ; j++){
                System.out.print(" "); //space require here.
            }
            //inner loop -> star print
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
//sabse pehle outer loop open hoga phir usme woh line me n-i space print honge
// and uss for loop ke baad dusra for loop execute hoga usme jitne i hai utne star ayenge space ke baad simple logic.
