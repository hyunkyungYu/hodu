package Homework;

import java.util.Scanner;

public class NumberStat {

   public static void main(String[] args) {
   
      System.out.print("반복회수를 입력: ");
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
         System.out.print( a+1 + "회 입력: ");
         int userInsultNum = sc.nextInt();
         sumNumber = sumNumber + userInsultNum;
         avgNumber = (double)sumNumber / (a+1);
         System.out.printf(">>stat: %d 회차 입력 %d => 누적합: %d, 평균: %.2f \r\n", a+1, userInsultNum, sumNumber, avgNumber);
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
            System.out.printf("%d회 까지의 입력 수 중 최대 : %d \r\n", i, MaxNumber);
            System.out.printf("%d회 까지의 입력 수 중 최소 : %d \r\n", i, MinNumber);
            System.out.println();
            System.out.print("평균 100이 넘는 최초의 회차: ");
            
            if( firstOverAvg < 100 ) {
            	 System.out.println("없음");
            	System.out.println("----- 끝 -----"); }
            else { 
      			System.out.printf("%d 회차 => 평균: %.2f \r\n", theFirst, firstOverAvg); }
            
            break;
             
            }
         
   } // main

      
}
}
