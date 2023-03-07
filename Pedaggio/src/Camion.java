
public class Camion	extends Veicolo {
	float peso;
	int mp;
	public Camion(int resac, int quSerb, String tipoC, float peso, int mp) {
		super(resac, quSerb, tipoC);
		this.peso = peso;
		this.mp = mp;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
}
