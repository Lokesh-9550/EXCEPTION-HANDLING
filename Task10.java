import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;
class InvalidDetailsToWithDrawException extends Exception{
    public InvalidDetailsToWithDrawException(String msg){
        super(msg);
    }

}
class Atm{
    
    private int acc=4545;
    private int pass=12345;
    int accountNumber;
    int password;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Pleas Enter Account Number: ");
         accountNumber=sc.nextInt();
        System.out.println("Please Enter Password: ");
         password=sc.nextInt();
    }
    public void verify() throws InvalidDetailsToWithDrawException{
        if(acc==accountNumber && pass==password){
            System.out.println("withdraw cash to proceed");
        }
        else{
          InvalidDetailsToWithDrawException exe=new InvalidDetailsToWithDrawException("Invalid Credentials");
          System.out.println(exe.getMessage());
          throw exe;
        }
    }
}
class Bank{
    public void initiated(){
        Atm a=new Atm();
        try{
            a.input();
            a.verify();
        }
        catch(InvalidDetailsToWithDrawException e){
            System.out.println("try again");
            try{
                a.input();
                a.verify();
            }
            catch(InvalidDetailsToWithDrawException e2){
                System.out.println("enter wrong details please check account number and password");
                // e.printStackTrace();
               
            }
        }
    }

}

public class Task10 {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.initiated();
    }
    
}
