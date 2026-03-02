import java.util.Scanner;
class  UnderAgeRestriction extends Exception{
    public UnderAgeRestriction(String msg){
        super(msg);
    }
}
class OverAgeRestriction extends Exception{
    public OverAgeRestriction(String msg){
        super(msg);
    }
}
class License{
    int age;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        age=sc.nextInt();
    }
    public void verify()throws UnderAgeRestriction,OverAgeRestriction{
        if(age>=18 && age <=60){
            System.out.println("Your correct age to applying license.");
        }
        else if(age<18){
            UnderAgeRestriction uar=new UnderAgeRestriction("Your Kid not age to applying license");
            System.out.println(uar.getMessage());
            throw uar;
        }
        else{
            OverAgeRestriction oar=new OverAgeRestriction("You have to take rest in home.");
            System.out.println(oar.getMessage());
            throw oar;
        }
    }

}
class Rto{
    public void initiated(){
        License l=new License();
        try{
            l.input();
            l.verify();
        }
        catch(UnderAgeRestriction | OverAgeRestriction e){
            System.out.println("Try Again");
            try{
                 l.input();
                 l.verify();
            }
            catch(UnderAgeRestriction | OverAgeRestriction e2){
                    System.out.println("Your chances are expired try to apply after.");
            }
        }
    }

}

public class Task11 {
    public static void main(String[] args) {
        Rto r=new Rto();
        r.initiated();
    }
    
}
