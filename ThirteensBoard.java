import java.util.List;

/**
 * The ThirteensBoard class represents the board in a game of Thirteens. Made by Percy Jang, based on ElevensBoard class.
 */
public class ThirteensBoard extends Board{
	
	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 10;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

	public ThirteensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		// TODO Auto-generated method stub
		if(selectedCards.size() == 2){
			return containsPairSum13(selectedCards);
		}
		else if(selectedCards.size() == 1){
			return containsKing(selectedCards);
		}
		
		return false;
	}

	@Override
	public boolean anotherPlayIsPossible() {
		// TODO Auto-generated method stub
		if(!containsKing(cardIndexes())){
			return containsPairSum13(cardIndexes());
		}
		return true;
	}
	
	/**
	 * Check for a King in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a King Card.
	 * @return true if the board entries in selectedCards
	 *              include a king; false otherwise.
	 */
	private boolean containsKing(List<Integer> selectedCards){
		if(selectedCards.size() != 1){
			return false;
		}
		else if(cardAt(selectedCards.get(0)).rank().equals("king")){
			return true;
		}
		
		return false;
	}
	
	/**
	 * Check for an 13-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 13-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 13-pair; false otherwise.
	 */
	private boolean containsPairSum13(List<Integer>selectedCards){
		if (selectedCards.size() < 2) {
            return false;
        }
        for (int i = 0; i < selectedCards.size() - 1; i++) {
            for (int j = i + 1; j < selectedCards.size(); j++) {
                if (cardAt(selectedCards.get(i)).pointValue() + cardAt(selectedCards.get(j)).pointValue() == 13) {
                    return true;
                }
            }
        }
        return false;
	}
}
