package com.practice.jsr;

public class enumDemo {
	public enum Season {SUMMER,WINTER,SPRING,FALL}
	public static void main(String[] args) {
		
		for (Season s : Season.values())  
			System.out.println(s);  
		
		System.out.println(season.valueOf("SUMMER")+"\n"+" Index Postion of Winter :"+season.valueOf("WINTER").ordinal()); // enum class is created separately
		season s=season.WINTER;
		System.out.println(s);
	}

}
