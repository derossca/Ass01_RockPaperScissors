//importing scanner
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaring variables
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String moves = "enter your move: R, P, or S: ";
        boolean done = false;
        String continueYN = "";
        String trash = "";

        //do while loop that loops the whole game
        do
        {
            //do while loop for player A move
            do
            {
                //display the moves
                System.out.println("Player A " + moves);
                playerA = in.nextLine(); //getting input then cascading if structure for each potential move or invalid move
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) { // use || for or and condense code
                    done = true;
                } else {
                    System.out.println("Please enter a valid move: R, P, or S");
                    System.out.println(); //adding space for easier reading in case of invalid move
                }
            } while (!done);

            done = false; // resetting boolean

            //do while loop for playerB move
            do
            {
                //display the moves
                System.out.println("Player B " + moves);
                playerB = in.nextLine(); //getting input then cascading if structure for each potential move or invalid move
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) { // use || for or and condense these bottom lines
                    done = true;
                } else {
                    System.out.println("Please enter a valid move: R, P, or S");
                    System.out.println(); //adding space for easier reading in case of invalid move
                }
            } while (!done);

            //cascaded if structure to output acceptable results according to the game for player A move R
            if(playerA.equalsIgnoreCase("R"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
                else
                {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                }
            }

            //cascaded if structure to output acceptable results according to the game for player A move P
            if(playerA.equalsIgnoreCase("P"))
            {
                if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie!");
                }
                else if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, Player A wins!");
                }
                else
                {
                    System.out.println("Scissors cut Paper, Player B wins!");
                }
            }

            //cascaded if structure to output acceptable results according to the game for player A move S
            if(playerA.equalsIgnoreCase("S"))
            {
                if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("It's a tie!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut Paper, Player A wins!");
                }
                else
                {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                }
            }

            while(true) {
                //Prompt to continue
                System.out.println("Do you want to continue [Y/N] ");
                continueYN = in.nextLine(); // make this the same as end of craps
                if (continueYN.equalsIgnoreCase("Y") || (continueYN.equalsIgnoreCase("N"))) {
                    break;
                } else {
                    System.out.println("Incorrect input: " + continueYN);
                }
            }
        } while(continueYN.equalsIgnoreCase("Y"));
    }
}