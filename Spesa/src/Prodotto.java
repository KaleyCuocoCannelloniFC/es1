
public class Prodotto {
	protected String cb,descrizione;
	protected float prezzo;
	public Prodotto(String cb, String descrizione, float prezzo) {
		this.cb = cb;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	public String getCb() {
		return cb;
	}
	public void setCb(String cb) {
		this.cb = cb;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public float applicaSconto()
	{	
		return (float)(prezzo*0.05);
		
	}
	public String toString() {
		return "Prodotto: \n codice a barre=" + cb + " \n descrizione=" + descrizione + "\n prezzo=" + prezzo;
	}
	
	
}
