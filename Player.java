import java.util.Scanner;

public class Player{
  String playerName;
  float profitGoal;

  public Player() {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Hello! What is your name?");
    playerName = userInput.nextLine();
    System.out.println("It is so nice to meet you " + playerName + ". I hope you are ready to work today. How much do you hope to make today at CaféClarice? ");

    while(true){
      if (userInput.hasNextFloat()){
        profitGoal = userInput.nextFloat();
       if (profitGoal > 0){
         break;
      } else {
         System.out.println("Please enter a positive number greater than 0");
         userInput.nextLine();
      }
      }
      else {
         System.out.println("Please enter a valid integer");
          userInput.nextLine();
      }
    }
    
    System.out.printf("$%.02f", profitGoal);
    System.out.println("! I believe in you! The command to open shop is 'Welcome to CafeClarice.' Enter the command when you are ready to start.");
    
  }
}