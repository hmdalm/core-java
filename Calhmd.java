import java.util.Scanner;
abstract class Calculation{
    abstract int multiply(int x,int y);
    abstract int divison(int h,int r);
    abstract int remainder(int x,int y);
}
public class Calhmd extends Calculation{
    public int multiply(int a,int b){
        int c = a * b;
        
        return c;
    }
    public int divison(int h,int r){
        int hmd = h / r;
       
        return hmd;
    }
    public int remainder(int a,int b){
        int c = a % b;
        
        return c;
    }
public static void main( String[] args){
    Scanner h1 = new Scanner(System.in);
    System.out.println("enter the first number ");
    int z = h1.nextInt();
    System.out.println("enter the 2nd number");
    int y=h1.nextInt();
    Calhmd x = new Calhmd();
    int ans = x.multiply(z,y);
    System.out.println("the ans is"+" "+ans);
    int ans1 = x.divison(z,y);
    System.out.println("the ans is"+" "+ans1);
    int ans11 = x.remainder(z,y);
    System.out.println("the ans is"+" "+ans11);
}




}
