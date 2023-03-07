import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;

public class EsListaSpesa {
	public static void main(String[] args) throws IOException
	{
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		int s,g,m,a,flag = 0;
		float prezzo,tot = 0;
		String cb,descrizione,sc,materiale;
		Data ds;
		Prodotto Pro;
		ListaSpesa lis = null;
		do
		{	
			System.out.println("Cosa vuoi fare: ");
			System.out.println("0 - Paga");
			System.out.println("1 - Acquista prodotto");
			System.out.println("2 - Vedi i prodotti");
			System.out.println("3 - fine");
			s=Integer.parseInt(console.readLine());
			switch(s)
			{
				case 0:
					if(flag==1)
					{
						
						System.out.println("hai la carta fedeltà?");
						cb=console.readLine();
						if(cb.equalsIgnoreCase("si")==true)
						{
							lis.totale();
							System.out.println("il totale è:"+tot);
						}
						else 
						{
							System.out.println("fra fai il serio");
						}
					}
					
					
					break;
				case 1:
					System.out.println("inserisci il codice a barre");
					cb=console.readLine();
					System.out.println("inserisci la breve descrizione");
					descrizione=console.readLine();					
					System.out.println("inserisci il prezzo");
					prezzo=Float.parseFloat(console.readLine());
					System.out.println("il Prodotto è un alimentare o non alimentare");
					sc=console.readLine();	
					if(sc.equalsIgnoreCase("alimentare")==true)
					{
						System.out.println("Inserisci la data di scadenza:");
						
						System.out.println("giorno");
						g=Integer.parseInt(console.readLine());
						System.out.println("mese");
						m=Integer.parseInt(console.readLine());
						System.out.println("anno");
						a=Integer.parseInt(console.readLine());
						ds=new Data(g,m,a);
						Pro= new Alimentari(cb,descrizione,prezzo,ds);
						
						
					}
					else
						
					{
						System.out.println("Di che materiale è fatto il prodotto?");
						materiale=console.readLine();
						Pro=new NonAlimentari(cb,descrizione,prezzo,materiale);
					}
					lis=new ListaSpesa();
					lis.inserisci(Pro);
					flag=1;
					break;
				case 2:
						lis.toString();
					break;
					
			}
		}while(s!=3);
	}
}