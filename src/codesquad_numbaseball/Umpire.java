package codesquad_numbaseball;

import java.util.ArrayList;

public class Umpire {
	
	public static int Strike(int[] player, int[] computer) {
		int strikeCount = 0; 
		
		for (int i = 0; i < player.length; i++) {
			if (player[i] == computer [i]) {
				strikeCount += 1;
			}
			
		}
		
		
		return strikeCount;
	}
	
	public static int Ball(int [] player, int[] computer) {
		int ballCount = 0;
		ArrayList computerArray = new ArrayList<>();
		for (int i = 0; i < computer.length; i++) {
			computerArray.add(computer[i]);
		}
		
		for (int i = 0; i < player.length; i++) {
			
			if (computerArray.contains(player[i]) && player[i] != computer[i]) {
				ballCount += 1;
			}
		}
	
		return ballCount;
	}
	

}
