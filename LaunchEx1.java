import java.util.Scanner;

public class LaunchEx1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Connection is created");
        try{
        System.out.println("Enter numaratoe");
        int n1=sc.nextInt();
        System.out.println("Enter Dinominator");
        int n2=sc.nextInt();
        int res=n1/n2;
        System.out.println("Result is: "+res);
        System.out.println("Enter size of Array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the Element in a Array");
        int ele=sc.nextInt();
        System.out.println("Enter Which position to Enter Array value ");
        int pos=sc.nextInt();
        arr[pos]=ele;
        System.out.println("Data is Entered and value is "+arr[pos]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("enetr values in with in the array");
        }
        catch(NegativeArraySizeException e){
            System.out.println("Do not enter negative value sin array");
        }
        catch(ArithmeticException e){
            System.out.println("Do not Enter zero values in diverder");
        }
        catch(Exception e){
            System.out.println("some of problem");

        }
        System.out.println("Connection is terminated");
    }
}