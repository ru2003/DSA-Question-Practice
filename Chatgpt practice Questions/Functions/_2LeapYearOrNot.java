package Functions ;
/*
2.Write a function to check if a given year is a leap year or not. */
public class _2LeapYearOrNot {

    public static boolean leapyear(int year ) {
       /*boolean result = ( year % 4 ==0  && year % 100 !=0  || (year % 100 ==0));
       return result;*/

       return (year %4 ==0 && year % 100 != 0) || ( year % 400==0);

    }
    public static void main(String[] args) {

    }
}
