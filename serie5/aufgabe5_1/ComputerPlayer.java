// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 5 Aufgabe 5-1

package aufgabe5_1;

/** A very stupid computer player */
public class ComputerPlayer implements IPlayer
{
	private Token token;


	private int bababot(Token[][] board){

		//aufgabe3_2.Test Board
		VierGewinnt tF = new VierGewinnt(board);

		for(int i=0; i < VierGewinnt.COLS; i++){
			if(board[i][VierGewinnt.ROWS-1] == Token.empty){
				int row = tF.insertToken(i, token);
				boolean win = tF.checkVierGewinnt(i, row);
				board[i][row] = Token.empty;
				if(win) return i;
			}
		}

		//no instant win
		return -1;
	}


	/**
	 * Strategy is to chose a random column and select 
	 * the next valid column to the right (the chosen included)
	 */
	public int getNextColumn( Token[][] board )
	{
		int win = bababot(board);
		if(win >= 0) return win;
		java.util.Random generator = new java.util.Random();
		int col = generator.nextInt( board.length );
		int step = 0;
		while ( isColFull( col, board ) ) {
			col = ( col + 1 ) % board.length;
		}
		return col;
	}



	/**
	 * @return true if the column col is already full and false otherwise. 
	 */
	private boolean isColFull( int col, Token[][] board )
	{
		int topRow = board[ col ].length - 1;
		return ( board[ col ][ topRow ] != Token.empty );
	}


	public void setToken( Token token ){
		this.token = token;
	}

	public Token getToken(){
		return this.token;
	}

	public String getPlayersName(){
		return "Random Player";
	}
}
