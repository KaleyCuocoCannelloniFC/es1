
public class Moto extends Veicolo {
	int cc;

	public Moto(int resac, int quSerb, String tipoC, int cc) {
		super(resac, quSerb, tipoC);
		this.cc = cc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
