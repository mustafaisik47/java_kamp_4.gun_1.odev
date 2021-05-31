package abstractClasses;

public class KidsGameCalculator extends GameCalculator {
	@Override
	public void hesapla() {
		System.out.println("Puanýnýz : 100");
	}
	
	@Override
	public void gameOver() {
		System.out.println("Çocuk için oyun bitti!");
	}
	
}
