package abstractClasses;

public class ManGameCalculator extends GameCalculator {
	@Override
	public void hesapla() {
		System.out.println("Puan�n�z : 90");
	}

	@Override
	public void gameOver() {
		System.out.println("Bay i�in oyun bitti!");
	}
}
