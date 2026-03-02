import java.io.IOException;
import java.util.InputMismatchException;

class Parent{
    public void work() throws IOException{
        System.out.println("Parent is do work");
    }

}
class Child1 extends Parent{

    @Override
    public void work() {
        System.out.println("Child1 is work hard");
    }


}
class Child2 extends Parent {

    @Override
    public void work()throws InputMismatchException {
        System.out.println("Child2 is work hard");
    }

}
class Child3 extends Parent {

    @Override
    public void work() {
        System.out.println("Child3 is work hard ");
    }


}
public class Task8 {
    public static void main(String[] args) {
        Parent p=new Child1();
        p.work();
        Parent p2=new Child2();
        p2.work();
        Parent p3=new Child3();
        p3.work();

    }
    
}
