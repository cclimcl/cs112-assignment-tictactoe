/*
 *
 * @author Chiara
 */
public class Player {
	// INSTANCE DATA: name, wins, losses
	private String player;
	private int wins=0;
	private int losses=0;

	//CONSTRUCTOR
	public Player(String playerName)
	{
		player = playerName;
	}

	// METHODS
	// getName(), setName(), getWins(), getLosses(), toString(), etc
	public String getName()
	{
		return player;
	}

	public void setName(String playerName)
	{
		player = playerName;
	}

	public int getWins(String playerName)
	{
		return wins;
	}

	public int getLosses(String playerName)
	{
		return losses;
	}

	public void setWins()
	{
		wins++;
	}

	public void setLosses()
	{
		losses++;
	}

	public String toString()
	{
		return "Name: "+player+"\nWins: "+wins+"\nLosses: "+losses+"\n";
	}
}
