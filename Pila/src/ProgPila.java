import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgPila {

	public static void main(String argv[]) throws IOException {
		//crea pila vuota
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		int resto;
		Pila pila=new Pila();
		Integer rest;
		int num;kk
		
		
		System.out.println("Inserisci il numero da convertire");
		num=Integer.parseInt(console.readLine());
		do {
			
			resto=num%2;
			rest=new Integer(resto);
			num=num/2;
			pila.push(resto);
		}while(num!=0);
		while(!pila.vuota())
		{
			rest=(Integer) pila.pop();
			System.out.println(rest + " ");
		}
		
				System.out.println();
		}
		
		
		
		
	}

	