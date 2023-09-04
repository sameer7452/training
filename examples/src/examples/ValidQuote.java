package examples;

public class ValidQuote {

	public static void main(String[] args) {
		//QUote should contain atleaast one word from vocab
		String[] vocab= {"is","are","am","of","an","a"};
		String quote="These are apples";
		
		
		
		boolean flag=false;
		for(String word:vocab) {
			if(quote.indexOf(word)!=-1) {
				flag=true;
				break;
			}
		}
		
		System.out.println(flag?"Valid Quote":"Invalid Quote");
		
	}
}
