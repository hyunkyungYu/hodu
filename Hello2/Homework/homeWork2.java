package Homework;

import java.util.Scanner;

public class homeWork2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		
		System.out.println("������ �Է��ϼ���");
		
		A = a.nextInt();
		B = a.nextInt();
		C = a.nextInt();
		D = a.nextInt();
		
		
		System.out.println("* [���α׷��� ���] ����:" + A + "�� " );
		System.out.println("* [���ڰ��� ����] ����:" + B + "�� " );
		System.out.println("* [�����ͺ��̽�] ����:" + C + "�� " );
		System.out.println("* [�˰���]  ����:" + D + "�� " );
		System.out.println("---------------------------");
		System.out.println("���� ����:" + sumG(A,B,C,D));
		System.out.println("---------------------------");
		double aveGResult = aveG(A,B,C,D);
		System.out.println("��� ����:" + aveGResult);
		
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
			
			return "�հ�";
		}
		else {
			
			return "���հ�";
		}
		
			
	}
}
