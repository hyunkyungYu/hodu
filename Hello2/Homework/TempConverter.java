package Homework;

import java.util.Scanner;

public class TempConverter {
	   


		public static void cToF(float c) {
			float f = 0.0f;
			f = (float)((1.8 * c) + 32);
			System.out.printf(" \t �Է� :  %.2f (����)\n", c); 
			System.out.printf("\t ���: %.2f (ȭ��)\n", f);

			
		}
		
		public static void fToC(float f) {
			float c = 0.0f;
			c = (float)((f-32)/1.8);
			System.out.printf(" \t �Է� :  %.2f  (ȭ��) \n", f); 
			System.out.printf("\t ���:  %.2f (����)", c);
		
		}
		

		public static void main(String[] args) {
			System.out.println("========= �µ���ȯ�� =========");
			
			
//			Scanner a = new Scanner(System.in);
//			float subC = 0.0f;
//			
//			System.out.println("���� �µ��� �Է��ϼ���");
//			
//			subC = a.nextFloat();
//			cToF(subC);
//			
//			System.out.println("ȭ�� �µ��� �Է��ϼ���");
//			
//			float hwaC = 0.0f;
//			hwaC = a.nextFloat();
//			fToC(hwaC);
			
			System.out.println("���� �µ��� �Է��ϼ���");
			float subC = 0.0f;
			
			subC = (float)((Math.random()*40)-20); 
			
			cToF(subC);
			System.out.println("ȭ�� �µ��� �Է��ϼ���");
			float hwaC = 0.0f;
			hwaC = (float)((Math.random()*100)+4); 
					
			fToC(hwaC);
			
		

					
//			System.out.println("\t ���� �µ��� �Է��ϼ���"); 
//			float subC = a.nextFloat();
//			
//			
//			
//			
//			System.out.println("\t ȭ�� �µ��� �Է��ϼ���"); 
//			float hwaC = a.nextFloat();
//			System.out.println(" \t �Է� :" + hwaC + "(ȭ��)"); 
//			
//			System.out.println("\t ���:" + fToC(hwaC) + "(����)");
//	
//			
		}
		
		

	}

