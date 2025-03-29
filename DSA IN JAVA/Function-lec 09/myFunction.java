//without return type

class MyOne{
    public static void main(String[]args)
    {
         MyOne mf=new MyOne();
         mf.calculateArea(2 , 4);
    }
    public void calculateArea(int length,int width){
        System.out.println(length * width);
      //  int area = length * width;
        //return area;
    }
}  



//with return type
class MyTwo{
    public static void main(String []args)
    {
        MyTwo  rs=new MyTwo();
        int res=rs.calculateArea(2,4);
        System.out.println(res);

    }
    public void swap(int val1,int val2){
        int temp = val1;
        val1=val2;
        val2=temp; 
    }

    public int calculateArea(int length,int width){
        int area =length*width;
        return area;
    }
}