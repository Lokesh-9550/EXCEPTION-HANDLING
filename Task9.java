import java.util.InputMismatchException;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
            try{
                int c=sc.nextInt();
                int d=sc.nextInt();
                System.out.println(c/d);

            }
            catch(InputMismatchException e){
                System.out.println("Exception is at inner block");
            }
            finally{
                System.out.println("Inner finally block");
            }
            System.out.println("inner block after finally block");

        }catch(InputMismatchException  e){
            System.out.println("Exception is at outer block");
        }
        finally{
            System.out.println("it is outer finally block");
        }
        System.out.println("outer block after finally block");

    }
    
}
