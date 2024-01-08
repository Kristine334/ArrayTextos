
public class arraytexto6 {

	public static void main(String[] args) {
		
		String tabla[]= {"Sue","Charlotte","Anna","Mike","William","Ed"};
	}

		boolean esCapicua(String s) {
			if (s.length() == 0) {
				return true;
			}
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
					return false;
				}
			}
			return true;
		}
		
}
	


