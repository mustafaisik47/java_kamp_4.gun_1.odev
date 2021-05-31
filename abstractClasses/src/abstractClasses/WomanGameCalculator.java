package abstractClasses;

public class WomanGameCalculator extends GameCalculator {
	@Override
	public void hesapla() {
		System.out.println("Puanýnýz : 95");
	}
	
	@Override
	public void gameOver() {
		System.out.println("Bayan için oyun bitti!");
	}
	
}
