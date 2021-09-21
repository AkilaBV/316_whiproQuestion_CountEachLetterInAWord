package whiproQuestion_CountEachLetterInAWord._whiproQuestion_CountEachLetterInAWord;

import java.util.HashMap;
import java.util.Map;

public class CountEachLetterInAWord {

	public static void main(String[] args) {
		String in="selenium";
		int count=0;
		Map<Character,Integer> appearence=new HashMap<Character,Integer>();
		for(int i =0;i<in.length();i++) {
			if(!appearence.containsKey(in.charAt(i))) {
				count=count+1;
				appearence.put(in.charAt(i), count);
			}else {
				count=appearence.get(in.charAt(i));
				count=count+1;
				appearence.put(in.charAt(i), count);
			}
			count=0;
		}System.out.println(appearence.entrySet());
			
		
	}

}
