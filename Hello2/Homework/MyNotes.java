package Homework;

import java.util.Scanner;

public class MyNotes {

	public static void main(String[] args) {
	
		printNote();
	} // main
	
	public static String whichNote(int note) {
	       String noteName = "";
	       switch (note) {
			case 1: noteName = "��"; break;
			case 2: noteName = "��"; break;	
			case 3: noteName = "��"; break;
			case 4: noteName = "��"; break;
			case 5: noteName = "��"; break;
			case 6: noteName = "��"; break;
			case 7: noteName = "��"; break;
			case 8: noteName = "��'"; break;
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
			System.out.println("=== ���̸� ��� ���α׷� === ");
			System.out.print("���� �� �Է�: "); 
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			
			if ( i >= 4) {
				for(int a = 1; a <= i; a++) {
					howManyNotes();
						if (a % 4 != 0) {System.out.print("|");}
						else System.out.println("||");
						} break;
				}
			else System.out.println("�߸��� ���� �� ");
		} while(true);
	}
		
	
} // class
