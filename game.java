import java.util.*;
public class game {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean flag=false;
        int randomnumber=(int)(Math.random()*100)+1;//math.random select number b/w 0 to 1(0.76,0.2,0.23) we add +1 on
        System.out.println("I have randomly choose a number between 1 and 100");
        System.out.println("Try to guess the number");
        for(int i=10;i>0;i--) {
            System.out.println("You have " + i + " given choices left");
            System.out.print("Enter your number: ");
            int guess = s.nextInt();
            if (guess > randomnumber) {
                System.out.println("Your number is larger than the guess number.");
            } else if (guess < randomnumber) {
                System.out.println("Your number is smaller than the guess number.");
            } else {
                flag = true;
                break;
            }
        }
            if(flag==true){
                System.out.println("Congratulation!!......You win ");
            }
            else{
                System.out.println("Better luck next time!!....you ran out of your chances");
                System.out.println("The actual number is "+randomnumber);
            }

    }
}
