
public class arraytexto9 {

	public static void main(String[] args) {
		String tabla[]= {"Sue","Charlotte","Anna","Mike","William","Ed"};
		
		/*Usamos un ciclo for para recorrer todas las cadenas del array
		 * y guardamos la más larga en una varbiale */		
		
		String larga = "";
		for (String s : tabla) {
		    if (s.length() > larga.length()) {
		        larga = s;
		    }
		}
		System.out.println ("La cadena más larga es " + larga );

	}

}
