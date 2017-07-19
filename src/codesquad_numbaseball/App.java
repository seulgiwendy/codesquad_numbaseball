package codesquad_numbaseball;

public class App {
	
	public static void main (String args[]) {
		
		int [] result = NumShuffler.returnRandint();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
