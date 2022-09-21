import java.util.Scanner;
abstract class Drawing{
    abstract int draw(int paper);
    public void sketch(){
        System.out.println("cartoon sketching");

    }}

 class Art extends Drawing{
    public int draw(int paper){
        
        if (paper >= 5){
            System.out.println("please draw one circle,one rectangle,2 square & one trinagle");
        }
        else if(paper <3 && paper >2 ){
            System.out.println("please draw 2 circle");
        }
        else if (paper <=1){
            System.out.println("draw one rectangle");

        }
        else{
            System.out.println("Do nothing bad value entered");
        }
        return paper;
    }
    public static void main(String[] args) {
        Art a1 = new Art();
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the value");
        int paper = s1.nextInt();
        System.out.println("enter the value");
        int ans=a1.draw( paper);
        System.out.println("here is your answere :"+ans);
        a1.sketch();
    }
}
