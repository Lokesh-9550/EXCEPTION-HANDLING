import java.util.Scanner;

class Alpha{
    public void calc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Alpha connection is created");
        System.out.println("Enter numaratoe");
        int n1=sc.nextInt();
        System.out.println("Enter Dinominator");
        int n2=sc.nextInt();
        int res=n1/n2;
        System.out.println("Result is: "+res);
        System.out.println("Alpha connection is terminated");
    }


}
class Beta{
    public void dis(){
        System.out.println("Beta connection is created");
        Alpha a=new Alpha();
        a.calc();
        System.out.println("Alpha connection is terminated");
    }

}

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Main connection is created");
        Beta b=new Beta();
        b.dis();
        System.out.println("Mian connection is terminated");
    }
    
}
