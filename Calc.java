import java.util.Scanner;
public class Calc{
	
    public void Addsubmultdiv(){
        
        System.out.println("calculation");
       }
        public static void main(String... arg){
    
            Calc abcd = new Calc();
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert first number :-");
            int a = sc.nextInt();
            System.out.println("Insert second number :-");
            int b = sc.nextInt();
            abcd.Addsubmultdiv();
            System.out.println("the value of c is :"+(a+b));       
        
            
        
        if ( b==1){
            System.out.println("the subtraction method" +( a-b));
        }
        else if ( b==2){
            System.out.println("the add method " +( a+b) );
        }
        else if ( b==3){
            System.out.println("the Multiplication method " + (a*b));

        }
        else if (b==4){
            System.out.println("the divide method " + (a/b));
        }
        else {
            System.out.println("what to do");
        }
    }
        
    }
    


