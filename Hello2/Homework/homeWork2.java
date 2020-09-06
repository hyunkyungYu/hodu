package Homework;

import java.util.Scanner;

public class homeWork2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		System.out.println("점수를 입력하세요");
		
		A = a.nextInt();
		B = a.nextInt();
		C = a.nextInt();
		D = a.nextInt();
		
		
		System.out.println("* [프로그래밍 언어] 점수:" + A + "점 " );
		System.out.println("* [전자계산기 구조] 점수:" + B + "점 " );
		System.out.println("* [데이터베이스] 점수:" + C + "점 " );
		System.out.println("* [알고리즘]  점수:" + D + "점 " );
		System.out.println("---------------------------");
		System.out.println("종합 점수:" + sumG(A,B,C,D));
		System.out.println("---------------------------");
		double aveGResult = aveG(A,B,C,D);
		System.out.println("평균 점수:" + aveGResult);
		
		System.out.println("===========================");
		System.out.println(passOrNo(aveGResult));
	}
	
	public static int sumG(int A, int B,int C,int D) {
		return (A+B+C+D);
	
		
	}
	public static double aveG(int A, int B,int C,int D) {
		
		return (double)((A+B+C+D)/4); 
	}
	
	public static String passOrNo(double aveGResult) {
		
		if (aveGResult > 60) {
			
			return "합격";
		}
		else {
			
			return "불합격";
		}
		
			
	}
}
