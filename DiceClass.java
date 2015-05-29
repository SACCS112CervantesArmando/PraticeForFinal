
public class DiceClass {

	private int diceValue;
	
	
	public int Roll() {
		diceValue = +(int) (Math.random() * 6) + 1;
		return diceValue;

	}
}
