
public class arraytexto8 {

	public static void main(String[] args) {
		
		
		String tabla[]= {"Sue","Charlotte","Anna","Mike","William","Ed"};
		
		int comienzaA = 0;
		for (String s : tabla) {
		    if (s.startsWith("a") || s.startsWith("A")) {
		        comienzaA++;
		    }
		}
		System.out.println ("Empiezan por 'A' " + comienzaA);

	}

}
