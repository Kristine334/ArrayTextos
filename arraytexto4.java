
public class arraytexto4 {

	public static void main(String[] args) {
		
		String tabla[]= {"Sue","Charlotte","Anna","Mike","William","Ed"};
		
		int masMayus = 0;
		for (String s : tabla) {
		    if (s.toUpperCase().length() > s.length()) {
		        masMayus++;
		    }
		}
		System.out.println ("Tienen mas mayúsculas que minúsculas " + masMayus);

	}

}
