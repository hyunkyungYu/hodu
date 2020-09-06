package Homework;

import java.util.Scanner;

public class ToyDoll {

public static void getRandomHere() {
   Scanner sc = new Scanner(System.in);
   System.out.println(" * 뽑기 프로그램");
   System.out.println("   금액을 입력하세요 :");
   int money = sc.nextInt();
   
   System.out.printf(" >> 입력된 금액 : 총 %d원 \n\r", money);
   

   String randomToy[][] = {
         {"뽀로로", "크롱", "포비", "페티",
               "에디", "해리", "통통이", "루피"},
         { "아이언맨", "스파이더맨", 
                  "캡틴Am.", "토르", "헐크"},
         {"엘사", "안나", "울라프"},
         {"라바", "옐로", "레드", "핑크"}
   };
   
   String randomClass[] = {
         "LEGEND", "SUPER", "RARE", "NORMAL"
   };
   int howManyLEGEND = 0;
   int howManySUPER  = 0;
   int howManyRARE = 0;
   int howManyNORMAL = 0;
   int count = 0;
   int price = 500;
   int charge = 0;
   int bonus = 0;
   int total = 0;
   count = (int) (money / price);
   bonus = (int)(count/10);
   total = count+bonus;
   charge = money;
   int remainder = 0;
   
   for (int i = 0; i < count; i++) {
	   
	  int pickClass = 0;
      int whichClass = 0;
      int pickCharacter = 0;
      int tenTimes = (int) (total/10);
      remainder = (int) (total%10);

      
      if(tenTimes > 0) {
    	  for (int p = 0; p < tenTimes; p++) {

        	
        	  System.out.println(" >> 10회 일괄뽑기 진행....");
        	  for (int j = 0; j < 10; j++) {
        		  pickClass = (int)((Math.random()*100)+1);
    		      if(pickClass > 50) {whichClass = 3; howManyNORMAL++;}
    		      else if(pickClass > 20) {whichClass = 2; howManyRARE++;}
    		      else if(pickClass > 5) {whichClass = 1; howManySUPER++;}
    		      else {whichClass = 0; howManyLEGEND++;}
    		      pickCharacter = (int)((Math.random()*(randomToy[whichClass].length)));   
        		  System.out.print("\n" + (int)(i+1) +"회차 "+randomClass[whichClass]+ " " + randomToy[whichClass][pickCharacter]);
        		  
        		  if(j == 9)
        			  {charge = charge - 5000;
        			  System.out.printf(" (남은 금액 : %d 원) \n", charge);
        			  }
        		  i++;
	
    		}
        	  System.out.println(" <FREE 보너스> " + (int)(i+1) +"회차 "+randomClass[whichClass]+ " " + randomToy[whichClass][pickCharacter]);
        	  System.out.println();
        	  i++;

    	  }
    	  
      }
      if(remainder > 0) {
    	
    	  for (int j = 0; j < remainder-bonus; j++) {
			 pickClass = (int)((Math.random()*100)+1);
			 
	      if(pickClass > 50) {whichClass = 3; howManyNORMAL++;}
	      else if(pickClass > 20) {whichClass = 2; howManyRARE++;}
	      else if(pickClass > 5) {whichClass = 1; howManySUPER++;}
	      else {whichClass = 0; howManyLEGEND++;}
	      pickCharacter = (int)((Math.random()*(randomToy[whichClass].length))); 
	     
	      charge = charge - price;
      System.out.print(i+1 +"회차 "+randomClass[whichClass]+ " " + randomToy[whichClass][pickCharacter]);
      System.out.printf(" (남은 금액 : %d 원) \n", charge);

      i++;
     
		}
 
      }
      
   } 
   
   if(charge < price) {
         System.out.println(" < 뽑기 금액이 부족해요ㅠ >"); }
   System.out.println("---------------------");
   System.out.println(total + "회 총합 결과: ");
   System.out.printf("LEGEND: %d회 (%.2f%%) \n", howManyLEGEND, (double)howManyLEGEND/total*100);
   System.out.printf("SUPER:  %d회 (%.2f%%) \n", howManySUPER,  (double)howManySUPER/total*100);
   System.out.printf("RARE:  %d회 (%.2f%%) \n", howManyRARE, (double)howManyRARE/total*100);
   System.out.printf("NORMAL : %d회 (%.2f%%) \n", howManyNORMAL,  (double)howManyNORMAL/total*100);
   System.out.printf("+보너스 : %d회", bonus);
   
}
   public static void main(String[] args) {
   
      getRandomHere();
      
   }

}