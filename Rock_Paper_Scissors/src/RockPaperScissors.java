
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        System.out.println("INSTRUCTIONS : ");
        System.out.println("1 : Rock");
        System.out.println("2 : Paper");
        System.out.println("3 : Scissors");

        Scanner user = new Scanner(System.in);
        System.out.println("Enter number as per the instructions : ");
        int num = user.nextInt();
        if(num == 1){
            System.out.println("You : Rock");
        } else if (num == 2) {
            System.out.println("You : Paper");
        } else if (num == 3) {
            System.out.println("You : Scissors");
        }
        else{
            System.out.println("Enter a valid number!");
        }


        int comp = (int) (Math.random()*3+1);

        if (num != 1 && num!= 2 && num != 3){
            System.out.println(" ");
        }
        else if(comp ==2){
            System.out.println("Computer : Paper");
        } else if (comp ==1) {
            System.out.println("Computer : Rock");
        } else if (comp ==3) {
            System.out.println("Computer : Scissors");
        }


        if((num==1 && comp==3)||(num==2 && comp==1)||(num==3 && comp==2)){
            System.out.println("You won!!!");
        } else if (num == comp) {
            System.out.println("It's a draw");
        }
        else {
            System.out.println("Computer wins!");
        }
    }
}
