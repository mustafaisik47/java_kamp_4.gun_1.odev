package abstractClasses;

public class WomanGameCalculator extends GameCalculator {
	@Override
	public void hesapla() {
		System.out.println("Puan�n�z : 95");
	}
	
	@Override
	public void gameOver() {
		System.out.println("Bayan i�in oyun bitti!");
	}
	
}
