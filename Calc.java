import java.util.Scanner;
public class Calc{
    public int Addsubmultdiv(int a,int b){
        int c= a + b;
        int d= a - b;
        int e= a * b;
        int f= a / b;
        return c;}
        public static void main(String... arg){
    
            Calc abcd = new Calc();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            
            int b = sc.nextInt();
            int ans = abcd.Addsubmultdiv(a, b);
            System.out.println(ans);            
        
            
        
        if ( b==1){
            System.out.println("the subtraction method" + d);
        }
        else if ( b==2){
            System.out.println("the add method " + c);
        }
        else if ( b==3){
            System.out.println("the Multiplication method " + e);

        }
        else if (b==4){
            System.out.println("the divide method " + f);
        }
        else {
            System.out.println("what to do");
        }
    }
        
    }
    


