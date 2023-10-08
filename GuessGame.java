import java.util.*;
public class GuessGame {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Random random=new Random();
        System.out.println("You have 10 chances to win! ");
        System.out.println("Please enter a number between 1-100 to win");
        GameBlueP game1=new GameBlueP(random.nextInt(1,100));

        for(int i=1;i<=10;i++)
        {
            game1.setNum(input.nextInt()); //inputting from user


            if (game1.getNum() == game1.getRand()) {
                System.out.println("YEY!! YOU WON!!!");
                return ; //if it is true then the loop breaks.
            } else if(game1.getNum()<game1.getRand()){
                System.out.println("SORRY! your number is less than the actual, try again");

            }else if(game1.getNum()>game1.getRand()){
                System.out.println("SORRY! your number is greater than the actual, try again");
            }
        }
    }
}