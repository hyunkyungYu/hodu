package Homework;

import java.util.Scanner;

public class MyNotes {

	public static void main(String[] args) {
	
		printNote();
	} // main
	
	public static String whichNote(int note) {
	       String noteName = "";
	       switch (note) {
			case 1: noteName = "도"; break;
			case 2: noteName = "레"; break;	
			case 3: noteName = "미"; break;
			case 4: noteName = "파"; break;
			case 5: noteName = "솔"; break;
			case 6: noteName = "라"; break;
			case 7: noteName = "시"; break;
			case 8: noteName = "도'"; break;
		}
		return noteName;
	   }
	public static String howManyNotes() {
		String replayNote = "";
		for(int i = 0; i < 4 ; i++ ) {
			System.out.print(whichNote((int)(Math.random()*8+1)));
		}
		return replayNote;
	}
	public static void printNote() {
		
		do {
			System.out.println("=== 계이름 출력 프로그램 === ");
			System.out.print("마디 수 입력: "); 
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			if ( i >= 4) {
				for(int a = 1; a <= i; a++) {
					howManyNotes();
						if (a % 4 != 0) {System.out.print("|");}
						else System.out.println("||");
						} break;
				}
			else System.out.println("잘못된 마디 수 ");
		} while(true);
	}
		
	
} // class
