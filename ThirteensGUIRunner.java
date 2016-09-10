/**
 * This is a class that plays the GUI version of the Thirteens game.
 * gg man.
 */
public class ThirteensGUIRunner {
	
	
	/**
	 * Plays the GUI version of Thirteens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}

}
