//write a java proramme to find the maximum element in an array 

  public class maximum{
    public static void main(String args[]){

        int [] arr = {1,2100,3,455,5,34,67};

        int max = 0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("the value of the maximum eleemnt in this array " + max);
    }
  }