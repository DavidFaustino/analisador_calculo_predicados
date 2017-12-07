package checksimilarity;


/**
 * 
 * @author David Faustino
 *
 */
public class CheckSimilarity {
	public static void main(String[] args) {
		 JaroWinkler jw = new JaroWinkler();
	        System.out.println("--------JaroWinkler------");
	        
	        // substitution of s and t : 0.9740740656852722
	        System.out.println(jw.similarity("Luccas", "Lucas"));

	        // substitution of s and n : 0.8962963223457336
	        System.out.println(jw.similarity("Luccas", "Luccas"));
	        
	        System.out.println(jw.similarity("Luccas", "Luc"));
	}
	
	
}
