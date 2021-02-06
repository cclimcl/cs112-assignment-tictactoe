import java.util.*;

/* GameDriver - Client program that allows a user to play the Game TictacToe.
 * Main is the only method found here. Other static helper methods can 
 * be used to organize the statements in main.
 * @author : Chiara
 * 
 */
public class GameDriver 
{
	public static void main(String[] args)
	{
		String name1, name2; //names of player
		TicTacToe board = new TicTacToe();
		Player player1, player2 = null;
		Scanner scan = new Scanner(System.in);
		Boolean win = false; //determines if anyone won
		Boolean tie = false; //determines if there was a tie
		Boolean again = true; //determines if players want to play again
		int r1,r2,c1,c2 = 0;
		Boolean check; //checks if the location is valid in board.check()
		int turn = 2; //determines who's turn it is: even (p1) and odd (p2)

		System.out.println("=======================");
		System.out.println("LET'S PLAY TIC TAC TOE!");
		System.out.println("=======================");
		System.out.println(board);

		
		System.out.println("> Enter the name of Player 1:");
		name1 = scan.next();
		player1 = new Player(name1);
		System.out.println("\nWelcome "+player1.getName()+"!\n");
		
		System.out.println("> Enter the name of Player 2:");
		name2 = scan.next();
		player2 = new Player(name2);
		System.out.println("\nWelcome "+player2.getName()+"!\n");

		while(again == true)
		{
			System.out.println("=========================");
			System.out.println("\tGAME "+(turn-1));
			System.out.println("=========================\n");
			System.out.println(board+"\n");

			while(win == false && tie == false)
			{
				if(turn%2==0)
				{
					//p1's turn
					System.out.println("> " + player1.getName() +", enter a row number: ");
					r1 = scan.nextInt()-1;
					System.out.println("> " + player1.getName() +", enter a column number: ");
					c1 = scan.nextInt()-1;
					check = board.check(r1, c1);
					//checks if location is valid
					while(check == false)
					{
						System.out.println("> " + player1.getName() +", enter a row number: ");
						r1 = scan.nextInt()-1;
						System.out.println("> " + player1.getName() +", enter a column number: ");
						c1 = scan.nextInt()-1;
						check = board.check(r1, c1);
					}
					//allocates spot to p1
					board.move(1, r1, c1);
					System.out.println(board);
					//check for wins for p1
					win = board.win(1);
					if(win == true)
					{
						System.out.println("YOU WON "+player1.getName()+"!\n");
						player1.setWins();
						player2.setLosses();
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
					//check for ties
					tie = board.tie();
					if(tie == true)
					{
						System.out.println("=========================");
						System.out.println("GAME OVER! YOU GUYS TIED!");
						System.out.println("=========================\n");
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
					
					//p2's turn
					System.out.println("> " + player2.getName() +", enter a row number: ");
					r2 = scan.nextInt()-1;
					System.out.println("> " + player2.getName() +", enter a column number: ");
					c2 = scan.nextInt()-1;
					//check if location is valid
					check = board.check(r2, c2);
					while(check == false)
					{
						System.out.println("> " + player2.getName() +", enter a row number: ");
						r2 = scan.nextInt()-1;
						System.out.println("> " + player2.getName() +", enter a column number: ");
						c2 = scan.nextInt()-1;
						check = board.check(r2, c2);
					}
					//allocates spot to p2
					board.move(2, r2, c2);
					System.out.println(board);
					//check for wins
					win = board.win(2);
					if(win == true)
					{
						System.out.println("YOU WON "+player2.getName()+"!\n");
						player2.setWins();
						player1.setLosses();
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
					//check for ties
					tie = board.tie();
					if(tie == true)
					{
						System.out.println("=========================");
						System.out.println("GAME OVER! YOU GUYS TIED!");
						System.out.println("=========================\n");
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
				}
				//swap turns
				else
				{
					//p2's turn
					System.out.println("> " + player2.getName() +", enter a row number: ");
					r2 = scan.nextInt()-1;
					System.out.println("> " + player2.getName() +", enter a column number: ");
					c2 = scan.nextInt()-1;
					//check if location is valid
					check = board.check(r2, c2);
					while(check == false)
					{
						System.out.println("> " + player2.getName() +", enter a row number: ");
						r2 = scan.nextInt()-1;
						System.out.println("> " + player2.getName() +", enter a column number: ");
						c2 = scan.nextInt()-1;
						check = board.check(r2, c2);
					}
					//allcoates spot for p2
					board.move(2, r2, c2);
					System.out.println(board);
					//check for wins
					win = board.win(2);
					if(win == true)
					{
						System.out.println("YOU WON "+player2.getName()+"!\n");
						player2.setWins();
						player1.setLosses();
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
					//check for ties
					tie = board.tie();
					if(tie == true)
					{
						System.out.println("=========================");
						System.out.println("GAME OVER! YOU GUYS TIED!");
						System.out.println("=========================\n");
						System.out.println(player1);
						System.out.println(player2);
						break;
					}

					//p1's turn
					System.out.println("> " + player1.getName() +", enter a row number: ");
					r1 = scan.nextInt()-1;
					System.out.println("> " + player1.getName() +", enter a column number: ");
					c1 = scan.nextInt()-1;
					//check if location is valid
					check = board.check(r1, c1);
					while(check == false)
					{
						System.out.println("> " + player1.getName() +", enter a row number: ");
						r1 = scan.nextInt()-1;
						System.out.println("> " + player1.getName() +", enter a column number: ");
						c1 = scan.nextInt()-1;
						check = board.check(r1, c1);
					}
					//allocates spot for p1
					board.move(1, r1, c1);
					System.out.println(board);
					//check for wins
					win = board.win(1);
					if(win == true)
					{
						System.out.println("YOU WON "+player1.getName()+"!\n");
						player1.setWins();
						player2.setLosses();
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
					//check for ties
					tie = board.tie();
					if(tie == true)
					{
						System.out.println("=========================");
						System.out.println("GAME OVER! YOU GUYS TIED!");
						System.out.println("=========================\n");
						System.out.println(player1);
						System.out.println(player2);
						break;
					}
				}

			}
		//asks user if user wants to repeat
		System.out.println("> Want to play again? (Y/N): ");
		String result = scan.next();
		result = result.toUpperCase();
		System.out.println();
		//determines if to repeat game or not
		if(result.equals("Y"))
		{
			//resets game
			board.restart();
			win = false;
			tie = false;
			turn++;
			again = true;
		}
		else
		{
			//resets game
			board.restart();
			win = false;
			tie = false;
			turn++;
			again = false;
			System.out.println("==================================");
			System.out.println("THANKS FOR PLAYING! SEE YOU AGAIN!");
			System.out.println("==================================\n");
			System.out.println(player1);
			System.out.println(player2);
		break;
		}
		}
	}
}
