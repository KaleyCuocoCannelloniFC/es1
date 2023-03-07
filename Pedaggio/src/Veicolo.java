
public class Veicolo {
	protected int resac;
	protected int quSerb;
	protected float livello;
	protected String tipoC;
	
	public Veicolo() {
		livello=43;
		resac=23;
		quSerb=43;
	}
	public Veicolo(int quSerb) {
		this.quSerb = quSerb;
		resac=24;
		quSerb=45;
		livello=45;
	}
	public Veicolo(int resac, int quSerb, String tipoC) {
		this.resac = resac;
		this.quSerb = quSerb;
		this.tipoC = tipoC;
		this.livello= livello;
	}
	public boolean simulaGuida(nkm)
	{
		if(livello>=nkm)
		{
			livello=livello-nkm;
		}
		else
		{
			strada=nkm*resac;
			mancante=livello-strada;
			System.out.println("Non c'è abbastanza benzina, ne manca: "+ );
		}
	}

	public int getResac() {
		return resac;
	}
	public void setResac(int resac) {
		this.resac = resac;
	}
	public int getQuSerb() {
		return quSerb;
	}
	public void setQuSerb(int quSerb) {
		this.quSerb = quSerb;
	}
	public String getTipoC() {
		return tipoC;
	}
	public void setTipoC(String tipoC) {
		this.tipoC = tipoC;
	}
	
}
