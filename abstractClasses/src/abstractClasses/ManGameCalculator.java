package abstractClasses;

public class ManGameCalculator extends GameCalculator {
	@Override
	public void hesapla() {
		System.out.println("Puanýnýz : 90");
	}

	@Override
	public void gameOver() {
		System.out.println("Bay için oyun bitti!");
	}
}
