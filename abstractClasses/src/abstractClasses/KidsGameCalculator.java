package abstractClasses;

public class KidsGameCalculator extends GameCalculator {
	@Override
	public void hesapla() {
		System.out.println("Puan�n�z : 100");
	}
	
	@Override
	public void gameOver() {
		System.out.println("�ocuk i�in oyun bitti!");
	}
	
}
