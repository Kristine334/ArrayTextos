
public class arraytexto2 {

	public static void main(String[] args) {
		
		
		String tabla[]= {"Sue","Charlotte","Anna","Mike","William","Ed"};
		
		
		int pos=0;
		String minimo = tabla [0];
		for (int i=0;i<tabla.length;i++) {
            if (tabla[i].compareTo(minimo)<0) {
            		minimo = tabla[i];
            		pos=i;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
            }    
        
		}
		System.out.println ("El primero alfabéticamente es " + minimo + " y su posición es la número " + pos);
		
		
		
        }
		
}
	


