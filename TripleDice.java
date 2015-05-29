
public class TripleDice extends DiceClass {

private int diceValue;
	
	@Override
	public int Roll() {
		
		diceValue = +(int) (Math.random() * 100) + 1;
		
				return diceValue;
		
		
	}
}
