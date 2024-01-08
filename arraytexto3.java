
public class arraytexto3 {

	public static void main(String[] args) {
		String tabla[]= {"Sue","Charlotte","Anna","Mike","William","Ed"};

		int contador = 0;

		for (int i = 0; i < tabla.length; i++) {
		    for (int j = 0; j < tabla[i].length(); j++) {
		        if (Character.isUpperCase(tabla[i].charAt(j))) {
		            contador++;
		        }
		    }
		}
		System.out.println ("El número de mayúsculas es " + contador);
	}
}