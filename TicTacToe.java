/*
 * TicTacToe class
 * @author Chiara
 */
public class TicTacToe
{
	//INSTANCE DATA
	private int[][] board = new int[3][3];

	//CONSTRUCTOR
	public TicTacToe()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				board[i][j] = 0;
		}
	}

	public void move(int player, int row, int column)
	{
		if(player ==1)
		{
			board[row][column]=1;
		}
		else
		{
			board[row][column]=2;
		}
	}

	public boolean check(int row, int column)
	{
		if(board[row][column]==1)
		{
			System.out.println("This spot is taken by player 1.");
			return false;
		}
		else if(board[row][column]==2)
		{
			System.out.println("This spot is taken by player 2.");
			return false;
		}
		else
			return true;
	}

	public boolean win(int player)
	{
		//horizontal
		for(int i=0;i<3;i++)
		{
			if(board[i][0]==player && board[i][1]==player && board[i][2]==player)
				return true;
		}
		//vertical
		for(int j=0; j<3; j++)
		{
			if(board[0][j]==player && board[1][j]==player && board[2][j]==player)
				return true;
		}
		//diagonal
		for(int k=0; k<3; k++)
		{
			if(board[0][0]==player && board[1][1]==player && board[2][2]==player)
				return true;
			else if(board[2][0]==player && board[1][1]==player && board[0][2]==player)
				return true;
		}
		return false;
	}

	public boolean tie()
	{
		boolean ans = false;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(board[i][j]==0)
					return false;
			}
		}
		return true;
	}

	public void restart()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				board[i][j] = 0;
		}
	}

	public String toString()
	{
		String output ="   1  2  3 \n";
	   	for(int i=0; i<3; i++)
		{
			output += (i+1 + " ");
			for(int j=0; j<3; j++)
			{
				if(board[i][j]==1)
					output+="[X]";
				else if(board[i][j]==2)
					output+="[O]";
				else
					output+="[-]";
			}
			output += "\n";
		}
		return output;
	}
}
