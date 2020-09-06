package Homework;

public class practice {
	public final int Red = 1;
	public final int Orange = 2;	
	public final int Yellow = 3;	
	
	public static void main(String[] args) {
	
		 Rainbow();
	}
	
	public static String intToColor(int colorNumber) {
		String colorName = "";
		
		switch (colorNumber) {
			case 1: colorName = "RED"; break;
			case 2: colorName = "ORANGE"; break;	
			case 3: colorName = "YELLOW"; break;
		}
		return colorName;
		
	}
	public static void Rainbow() {

		int i = 0;
		while(i<8) {
		i++;
		System.out.println(intToColor(i));
		
		}
	
	}
	
}
