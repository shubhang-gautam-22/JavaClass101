public class StringReverse {
	
	public String stringRevrs(String name ) {
		
		int leng = name.length();
		String revs = "";	
		
		for(int i = leng-1; i>=0; i--) {
			
		revs = revs + name.charAt(i);
			
		}

		return revs;
		
	}
		

}