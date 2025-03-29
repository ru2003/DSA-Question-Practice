class MyFlow{
    public static void main(String []args){
        int marks=89;
        if (marks>=90)
        {
            System.out.println("You are topper and you have secured the "+marks);
        }

        if(marks > 35 && marks<90)
        {
            System.out.println("your marks is:" 
            +marks);}

        if(marks <=35){
            System.out.println("You have scored only " + marks +",improvement required");
        }
    }  
}

class MyDemo{
    public static void main (String[]args){
        int marks=20;
        if(marks>35)
        {
            System.out.println("Your marks is:" +marks+",passed");
        }
        else{
            System.out.println("You have scored only "+marks+".you have to improved");
        }
    }
}

class MySwitch{
    public static void main(String[]args){
        int choice=3;
        switch (choice){
            case 1:
            System.out.println("podicchery is on");
            break;
            
            case 2:
            System.out.println("Goa is on");
            break;

            case 3:
            System.out.println("manali is on");

            default:
            System.out.println("choose correctly");
        }
    }
}


class MyCar{
    public static void main(String[]args)
    {
        String name= "ruchita";
        char ch = name.charAt(0);

        if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("hi vowel:" + ch);
        }
        else
        {
            System.out.println("hi consonent:" + ch);
        }
    }
}
 
class MyJeep{
    public static void main(String[]args)
    {
        String name="ruchita";
        int len=7;
        for(int pos=0 ; pos<len;pos++)
        //System.out.println(pos);
        {
       char ch = name.charAt(pos);
        if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')

        {
            System.out.println("ho Vowel:" +ch);
        }
        else{
            System.out.println("Hi conconent:" +ch);
        }

        }
}
}


class MyTree{
    public static void main(String[]args){
   
        int len= 8 ;

    for(int pos=1;pos<8;pos++){
        if(pos>5){
            break;
        }
        System.out.println(pos);
    }
   // int arr[]={5,7,90};
    //for (int element:arr){
      //  System.out.println(element);
   // }
} 
}


class MyCode{
    public static void main(String[]args){

        int number=27;
        while(number!=0){
            System.out.println(number);
            number=number/2;
        }
    }
}