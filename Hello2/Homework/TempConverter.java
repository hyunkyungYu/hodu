package Homework;

import java.util.Scanner;

public class TempConverter {
	   


		public static void cToF(float c) {
			float f = 0.0f;
			f = (float)((1.8 * c) + 32);
			System.out.printf(" \t 입력 :  %.2f (섭씨)\n", c); 
			System.out.printf("\t 결과: %.2f (화씨)\n", f);

			
		}
		
		public static void fToC(float f) {
			float c = 0.0f;
			c = (float)((f-32)/1.8);
			System.out.printf(" \t 입력 :  %.2f  (화씨) \n", f); 
			System.out.printf("\t 결과:  %.2f (섭씨)", c);
		
		}
		

		public static void main(String[] args) {
			System.out.println("========= 온도변환기 =========");
			
			
//			Scanner a = new Scanner(System.in);
//			float subC = 0.0f;
//			
//			System.out.println("섭씨 온도를 입력하세요");
//			
//			subC = a.nextFloat();
//			cToF(subC);
//			
//			System.out.println("화씨 온도를 입력하세요");
//			
//			float hwaC = 0.0f;
//			hwaC = a.nextFloat();
//			fToC(hwaC);
			
			System.out.println("섭씨 온도를 입력하세요");
			float subC = 0.0f;
			
			subC = (float)((Math.random()*40)-20); 
			
			cToF(subC);
			System.out.println("화씨 온도를 입력하세요");
			float hwaC = 0.0f;
			hwaC = (float)((Math.random()*100)+4); 
					
			fToC(hwaC);
			
		

					
//			System.out.println("\t 섭씨 온도를 입력하세요"); 
//			float subC = a.nextFloat();
//			
//			
//			
//			
//			System.out.println("\t 화씨 온도를 입력하세요"); 
//			float hwaC = a.nextFloat();
//			System.out.println(" \t 입력 :" + hwaC + "(화씨)"); 
//			
//			System.out.println("\t 결과:" + fToC(hwaC) + "(섭씨)");
//	
//			
		}
		
		

	}

