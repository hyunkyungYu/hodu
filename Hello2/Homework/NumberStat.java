package Homework;

import java.util.Scanner;

public class NumberStat {

   public static void main(String[] args) {
   
      System.out.print("�ݺ�ȸ���� �Է�: ");
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      int a = 0;
      System.out.println("--------------");
      int sumNumber = 0;
      double avgNumber = 0.0;
      int MaxNumber = 0;
      int MinNumber = 0;
      double firstOverAvg = 0.0;
      int theFirst = 0;
    		  
      while(true){
         if( a < i ) {
         System.out.print( a+1 + "ȸ �Է�: ");
         int userInsultNum = sc.nextInt();
         sumNumber = sumNumber + userInsultNum;
         avgNumber = (double)sumNumber / (a+1);
         System.out.printf(">>stat: %d ȸ�� �Է� %d => ������: %d, ���: %.2f \r\n", a+1, userInsultNum, sumNumber, avgNumber);
            a++;
            
            if( MaxNumber < userInsultNum ) { MaxNumber = userInsultNum; }
            if( a <= 1 ) { MinNumber = userInsultNum ;}
            	else if( MinNumber > userInsultNum ){ MinNumber = userInsultNum; }
//            if( avgNumber >= 100 &&  ){ firstOverAvg = avgNumber; theFirst = a; }
            do { 
            	if(avgNumber >= 100 && theFirst+1 > a)
            	firstOverAvg = avgNumber; theFirst = a;
            	break;
            	} while(true);
         }
         else
         {
            System.out.println("--------------");
            System.out.printf("%dȸ ������ �Է� �� �� �ִ� : %d \r\n", i, MaxNumber);
            System.out.printf("%dȸ ������ �Է� �� �� �ּ� : %d \r\n", i, MinNumber);
            System.out.println();
            System.out.print("��� 100�� �Ѵ� ������ ȸ��: ");
            
            if( firstOverAvg < 100 ) {
            	 System.out.println("����");
            	System.out.println("----- �� -----"); }
            else { 
      			System.out.printf("%d ȸ�� => ���: %.2f \r\n", theFirst, firstOverAvg); }
            
            break;
             
            }
         
   } // main

      
}
}
