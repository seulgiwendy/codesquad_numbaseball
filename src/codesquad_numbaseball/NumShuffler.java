package codesquad_numbaseball;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumShuffler {
	
	private final static String [] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	static int [] returnRandint() {
		
		int [] returnNum = new int [3];
		
		List numlist = Arrays.asList(numbers);
		Collections.shuffle(numlist);
		for (int i = 0; i < 3; i++) {
			
			String temp = numlist.get(i).toString();
			returnNum[i] = Integer.parseInt(temp);
		}
		
		return returnNum;
	}

}
