class Gamma{
    public int display(){
        try{
        System.out.println("Gamma block is executed");
        return 10;
        }
        finally{
            System.out.println("This is from finally block");
            return 44;
        }
    }
}


public class Task6{
    public static void main(String[] args) {
        Gamma g=new Gamma();
            System.out.println(g.display());
    }

}