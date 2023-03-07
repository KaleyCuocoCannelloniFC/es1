
public class Alimentari extends Prodotto{
	private Data data;

	public Alimentari(String cb, String descrizione, float prezzo, Data data) {
		super(cb, descrizione, prezzo);
		this.data = data;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	public float applicaSconto()
	{	
		Data dataAttuale=new Data();
		if(data.getDifference(dataAttuale)>10)
		{
			prezzo= (float)(prezzo*0.20);
		}
		return prezzo;
	}
}
