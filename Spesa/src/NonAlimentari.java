
public class NonAlimentari extends Prodotto{
	private String materiale;

	public NonAlimentari(String cb, String descrizione, float prezzo, String materiale) {
		super(cb, descrizione, prezzo);
		this.setMateriale(materiale);
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	public float applicaSconto()
	{	
		if(materiale.equalsIgnoreCase("carta")==true||materiale.equalsIgnoreCase("plastica")==true||materiale.equalsIgnoreCase("vetro")==true)
		{
			prezzo= (float)(prezzo*0.10);		
			}
		return prezzo;
	}

	
}
