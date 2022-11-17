import java.util.*;

public class Exception{
    private int a, b, c = 0;
    // double c
    void get(){
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter two numbers");
            a=sc.nextInt();
            b=sc.nextInt();
            c=a/b;
        }
        catch(ArithmeticException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        Exception i = new Exception();
        i.get();
    }
}