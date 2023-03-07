
public class Camper extends Veicolo {
	float lunghezza;

	public Camper(int resac, int quSerb, String tipoC, float lunghezza) {
		super(resac, quSerb, tipoC);
		this.lunghezza = lunghezza;
	}

	public float getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(float lunghezza) {
		this.lunghezza = lunghezza;
	}
	
}
