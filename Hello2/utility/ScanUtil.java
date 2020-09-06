package utility;

import java.util.Scanner;

// ��ĵ���� ��� Ŭ����
public class ScanUtil {
	// ��ĳ�ʸ� ���� ������ �Է¹޾� �����ִ� �Լ�
	public static int userInputToInt(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	// ��ĳ�ʸ� ���� ������ �Է¹޾� Ư������ ���� �����ִ� �Լ�
	public static int userInputToIntInRange(
			String msg, int min, int max) {
		if( min > max ) {
			System.out.println("min > max ����!!");
			return -9999999;
		}	
		int input = 0;
		do {
			input = userInputToInt(msg);			
		} while( !(input >= min && input <= max) );
		return input; // min ~ max
	}	
	
//	public static int userInputToIntInRange(
//			String msg, int min, int max) {
//		if( min > max ) {
//			System.out.println("min > max ����!!");
//			return -9999999;
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		do {
//			System.out.print(msg);
//			input = sc.nextInt();			
//		} while( !(input >= min && input <= max) );
//		// true == !false, !true = false
//		//} while( (input >= min && input <= max) == false );			
//		//} while(input < min || input > max);		
//		//} while(input >= min && input <= max);
//		return input; // min ~ max
//	}
	
//	public static int userInputToIntInRange(
//			String msg, int min, int max) {
//		if( min > max ) {
//			System.out.println("min > max ����!!");
//			return -9999999;
//		}
//		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		while(true) {
//			System.out.print(msg);
//			input = sc.nextInt();
//			if( input >= min && input <= max ) break;
//		} 
//		return input; // min ~ max
//	}
}
