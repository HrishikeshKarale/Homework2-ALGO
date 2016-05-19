import java.lang.Math.*;
import java.util.Scanner;


public class FibPow{
    
    public long[] fibPow(int pow, int a, int b) {
        double temp1= (1 + Math.sqrt(5))/2;
        double temp2= (1 - Math.sqrt(5))/2;
        
        if( pow<1)
            pow= 1;
        
        long value1 = (long) ((Math.pow(temp1, pow-1) - Math.pow(temp2, pow-1))/(Math.sqrt(5)));
        long value2 = (long) ((Math.pow(temp1, pow) - Math.pow(temp2, pow))/(Math.sqrt(5)));
        
        return new long[] {value1*a+value2*b, value2*a+value1*b};
    }

     public static void main(String []args){
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter value for pow:");
        int pow= scr.nextInt();
        System.out.print("Enter value for a:");
        int a= scr.nextInt();
        System.out.print("Enter value for b:");
        int b= scr.nextInt();
        FibPow hwObject= new FibPow();
        long[] output= hwObject.fibPow(pow, a, b);
        System.out.println();
        for(int i=0; i<output.length; i++)
        System.out.print(output[i]+", ");
     }
}
