package Homework;

import java.util.Scanner;

public class ToyDoll {

public static void getRandomHere() {
   Scanner sc = new Scanner(System.in);
   System.out.println(" * �̱� ���α׷�");
   System.out.println("   �ݾ��� �Է��ϼ��� :");
   int money = sc.nextInt();
   
   System.out.printf(" >> �Էµ� �ݾ� : �� %d�� \n\r", money);
   

   String randomToy[][] = {
         {"�Ƿη�", "ũ��", "����", "��Ƽ",
               "����", "�ظ�", "������", "����"},
         { "���̾��", "�����̴���", 
                  "ĸƾAm.", "�丣", "��ũ"},
         {"����", "�ȳ�", "�����"},
         {"���", "����", "����", "��ũ"}
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

        	
        	  System.out.println(" >> 10ȸ �ϰ��̱� ����....");
        	  for (int j = 0; j < 10; j++) {
        		  pickClass = (int)((Math.random()*100)+1);
    		      if(pickClass > 50) {whichClass = 3; howManyNORMAL++;}
    		      else if(pickClass > 20) {whichClass = 2; howManyRARE++;}
    		      else if(pickClass > 5) {whichClass = 1; howManySUPER++;}
    		      else {whichClass = 0; howManyLEGEND++;}
    		      pickCharacter = (int)((Math.random()*(randomToy[whichClass].length)));   
        		  System.out.print("\n" + (int)(i+1) +"ȸ�� "+randomClass[whichClass]+ " " + randomToy[whichClass][pickCharacter]);
        		  
        		  if(j == 9)
        			  {charge = charge - 5000;
        			  System.out.printf(" (���� �ݾ� : %d ��) \n", charge);
        			  }
        		  i++;
	
    		}
        	  System.out.println(" <FREE ���ʽ�> " + (int)(i+1) +"ȸ�� "+randomClass[whichClass]+ " " + randomToy[whichClass][pickCharacter]);
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
      System.out.print(i+1 +"ȸ�� "+randomClass[whichClass]+ " " + randomToy[whichClass][pickCharacter]);
      System.out.printf(" (���� �ݾ� : %d ��) \n", charge);

      i++;
     
		}
 
      }
      
   } 
   
   if(charge < price) {
         System.out.println(" < �̱� �ݾ��� �����ؿ�� >"); }
   System.out.println("---------------------");
   System.out.println(total + "ȸ ���� ���: ");
   System.out.printf("LEGEND: %dȸ (%.2f%%) \n", howManyLEGEND, (double)howManyLEGEND/total*100);
   System.out.printf("SUPER:  %dȸ (%.2f%%) \n", howManySUPER,  (double)howManySUPER/total*100);
   System.out.printf("RARE:  %dȸ (%.2f%%) \n", howManyRARE, (double)howManyRARE/total*100);
   System.out.printf("NORMAL : %dȸ (%.2f%%) \n", howManyNORMAL,  (double)howManyNORMAL/total*100);
   System.out.printf("+���ʽ� : %dȸ", bonus);
   
}
   public static void main(String[] args) {
   
      getRandomHere();
      
   }

}