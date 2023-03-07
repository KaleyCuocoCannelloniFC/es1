import java.util.*;
public class ListaSpesa {
	private Vector <Prodotto> v;

	public ListaSpesa() 
	{	
		v=new Vector<Prodotto>(1,1);
	}
	void inserisci(Prodotto p)
	{
		v.addElement(p);
	}
	float totale()
	{
		int i=0;
		float tot = 0;
		for(i=0;i<v.size();i++)
		{
			tot=tot+v.elementAt(i).getPrezzo();
		}
		return tot;
	}
	public String toString() {
		return "ListaSpesa: "+v +" ";
	}
	
}
