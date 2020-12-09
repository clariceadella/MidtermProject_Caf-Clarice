import java.util.Scanner;

public class Player{
  public String playerName;
  public double profitGoal;

  public Player() {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Hello! What is your name?");
    playerName = userInput.nextLine();
    System.out.println("It is so nice to meet you " + playerName + ". I hope you are ready to work today. How much do you hope to make today at CaféClarice? ");

    //while loop will make sure input is an integer greater than 0
    while(true){
      if (userInput.hasNextDouble()){
        profitGoal = userInput.nextDouble();
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
    //print statement will print to the 2nd decimal
    System.out.printf("$%.02f", profitGoal);
    System.out.println("! I believe in you! Enter the command when you are ready to start.");

    String userCommand;
    while (true){
      userCommand = userInput.nextLine();
      if (userCommand.equals("Welcome to CafeClarice")){
        break;
      } else {
        System.out.println("The command to open shop is 'Welcome to CafeClarice'");
      }
    }

}
    

}