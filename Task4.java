import java.util.Scanner;

class Alpha{
    Scanner sc=new Scanner(System.in);
    public void calc() throws ArithmeticException{
        
        try{
        System.out.println("Alpha connection is created");
        System.out.println("Enter numaratoe");
        int n1=sc.nextInt();
        System.out.println("Enter Dinominator");
        int n2=sc.nextInt();
        int res=n1/n2;
        System.out.println("Result is: "+res);
        }
        catch(ArithmeticException e){
            System.out.println("do not enter zero at divider");
            throw e;
        }
        System.out.println("Alpha connection is terminated");
       
    }
}

public class Task4 {
    public static void main(String[] args) {
        try{
            System.out.println("Main connection is created");
            Alpha a=new Alpha();
            a.calc();
            System.out.println("Main connection is terminated");
        }
        catch(ArithmeticException e){
            System.out.println("Exception is caught in main method");

        }
    }
    
}
