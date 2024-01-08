
public class arraytexto1 {

	public static void main(String[] args) {
		String nombres[]={"Sue","Charlotte","Anna","Mike","William","Ed"};
		
		int cantidad[]= new int[nombres.length];
		int contador = 0;
		
		for(int i = 0; i< nombres.length; i++)
			cantidad[i]= nombres[i].length();
		
		
		for(int i = 0; i< nombres.length; i++)
			System.out.println ("El nombre " +  nombres[i] + " tiene " + cantidad[i] + " letras");
		
		

	}

}
