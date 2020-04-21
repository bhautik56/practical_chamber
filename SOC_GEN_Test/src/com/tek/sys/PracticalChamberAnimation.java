package com.tek.sys;

public class PracticalChamberAnimation {
	
	public static void main(String[] args) {
		Animation animation = new Animation();
	
		animation.animate(2,  "LRLR.LRLR");
		animation.animate(3,  "RR..LRL");
		animation.animate(2,  "R");		
		animation.animate(10, "RLRLRLRLRL");
		animation.animate(1,  "LRRL.LR.LRR.R.LRRL.");
		animation.animate(2,  "LRLX       .LRLR");
		animation.animate(2,  null);
		animation.animate(2,  "LRXXR.LRLR");
		animation.animate(2,  "LRXXR.LRLZ");
		animation.animate(0,  "LRR.LRL");
		animation.animate(11, "LRR.LRL");
		animation.animate(-1, "LRR.LRL");
		animation.animate(2,  "");
		animation.animate(2,  "LRLRLRLR.....LLLLLLRR.......RRRRLRLRLRLRLRLRLRL....RRRRRR....R");
	}
}