package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class MyPrimeNumber {
	public static void howManyPrime() {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		int howMany = 0;
		boolean result = false;
		
		for (int i = 2; i < inputNumber; i++) {
			result = isPrimeNumber(i);	
			if(result == true) {
				if(howMany > 0) {
					System.out.print(", ");
				}
				
				if(howMany % 5 == 0 && howMany != 0) {
					System.out.println("");
				}
				
				howMany++;
				System.out.print(i + " �Ҽ�" );
				
			}
			
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.printf("2���� %d������ �Ҽ��� �� ���� : %d��", inputNumber, howMany);
	}
	public static boolean isPrimeNumber(int num) {

		int remainder = 0;
		int count = 0;
		
		for (int i = 2; i < num-1; i++) {
			remainder = (int)(num % i);
			if(remainder == 0) {
				count++;
			}
		}

		if(count == 0) {
			return true;
		}
		return false; 

	}

	public static void main(String[] args) {
		
		howManyPrime();
		
	}

}