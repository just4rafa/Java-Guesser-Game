import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Inntrodu maximul numar: ");
        int until = scan.nextInt();
        int num = rand.nextInt(until-1);
        boolean cond = true;
        while(cond == true){
           System.out.print("Introdu numarul: ");
           int numG = scan.nextInt();
          if(numG == num){
            System.out.println("You Win!, numarul corect a fost: '" + num + "'");
            cond = false;
          }
       
        }
    }
        

}
        
    
