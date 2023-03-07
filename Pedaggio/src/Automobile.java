
public class Automobile extends Veicolo {
	int gas,elettrica;

	public Automobile(int resac, int quSerb, String tipoC, int gas, int elettrica) {
		super(resac, quSerb, tipoC);
		this.gas = gas;
		this.elettrica = elettrica;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getElettrica() {
		return elettrica;
	}

	public void setElettrica(int elettrica) {
		this.elettrica = elettrica;
	}
	
}
