import java.util.ArrayList;
import java.util.List;

public class practice {

	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	
	public practice(String[] ranks, String[] suits, int[] values){
		cards = new ArrayList<Card>();
		for(int i = 0; i<suits.length; i++){
			for(int d = 0; d<ranks.length; d++){
				cards.add(new Card(ranks[d], suits[i], values[d]));
			}
		}
		
	}
	
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[]shuffled = new int[values.length];
		int k = 0;
		for(int i = 0; i<(values.length+1)/2; i++){
			shuffled[k] = values[i];
			k+=2;
		}
		k = 1;
		for(int c = (values.length+1)/2; c<values.length; c++){
			shuffled[k] = values[c];
			k+=2;
		}
		
		
		
}
	public void shuffle1(){
		for(int i = cards.size()-1; i>=0; i--){
			int random = (int)(Math.random()*i);
			Card temp = cards.get(random);
			cards.set(random, cards.get(i));
			cards.set(i, temp);
		}
	}
	
	public void shuffle(){
		for(int i = cards.size()-1; i>=0; i--){
			int random = (int)(Math.random()*i);
			Card temp = cards.get(random);
			cards.set(random, cards.get(i));
			cards.set(i, temp);
		}
		
	}

}