import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter Integer value: ");
            int n=sc.nextInt();

        }
        catch(ArithmeticException e){
            System.out.println("donot enter other then Integer");
        }
        finally{
            System.out.println("finally is handled");
        }
    }
    
}
