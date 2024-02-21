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
                if (playerA.equalsIgnoreCase("R")) {
                    done = true;
                } else if (playerA.equalsIgnoreCase("P")) {
                    done = true;
                } else if (playerA.equalsIgnoreCase("S")) {
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
                if (playerB.equalsIgnoreCase("R")) {
                    done = true;
                } else if (playerB.equalsIgnoreCase("P")) {
                    done = true;
                } else if (playerB.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("Please enter a valid move: R, P, or S");
                    System.out.println(); //adding space for easier reading in case of invalid move
                }
            } while (!done);

            //cascaded if structure to output acceptable results according to the game
            if(playerA.equalsIgnoreCase("R"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie!");
                }
                if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
                if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                }
            }

            //Prompt to continue
            System.out.println("Do you want to continue [Y/N] ");
            continueYN = in.nextLine();
        } while(continueYN.equalsIgnoreCase("Y"));
    }
}

//do
//			output “PlayerA choose your move: [R,P,S]”
//			input moveA
//			output “PlayerB choose your move: [R,P,S]”
//			input moveB
//				if moveA == “R” then
//					if moveB == “R” then
//						output “It’s a tie!”
//					else if move B == “P” then
//						output “Paper covers Rock, PlayerB wins!”
//					else
//						output “Rock breaks Scissors, PlayerA wins!”
//					end if
//				else if moveA == “P” then
//					if moveB == “P” then
//						output “It’s a tie!”
//					else if move B == “S” then
//						output “Scissors cuts Paper, PlayerB wins!”
//					else
//						output “Paper covers Rock, PlayerA wins!”
//					end if
//				else if moveA == “S” then
//					if moveB == “S” then
//						output “It’s a tie!”
//					else if move B == “R” then
//						output “Rock breaks Scissors, PlayerB wins!”
//					else
//						output “Scissors cuts Paper, PlayerA wins!”
//					end if
//
//				end if
//			output “Are you done [Y/N]?”
//			input doneYN
//		while NOT doneYN == “Y”


//if(playerA.equalsIgnoreCase("R"))
//            {
//                if(playerB.equalsIgnoreCase("R"))
//                {
//                    System.out.println("It's a tie!");
//                }
//                else if(playerB.equalsIgnoreCase("P"))
//                {
//                    System.out.println("Paper covers Rock, Player B wins!");
//                }
//                else if(playerB.equalsIgnoreCase("S"))
//                {
//                    System.out.println("Rock smashes Scissors, Player A wins!");
//                }
//                else
//                {
//                    trash = in.nextLine();
//                    System.out.println("Please enter R, P, or S, not " + trash);
//                }
//            }