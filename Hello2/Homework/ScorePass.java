package Homework;

import java.util.Scanner;

public class ScorePass {
     
   
   public static void GradeInsert() {
	   int koreanGrade =  (int)(Math.random()*100);
	   int englishGrade = (int)(Math.random()*100);
	   int mathGrade = (int)(Math.random()*100);
	   int howManyS = 3;
	     
      double sumGrade = (int)(koreanGrade+englishGrade+mathGrade);
      double avgGrade = (double)(sumGrade/howManyS);
      
	@SuppressWarnings("resource")
	Scanner inputGrade = new Scanner(System.in);
      
      System.out.println("==== ���� ��� ����ǥ ====");
      System.out.printf("�̸� : '%s'�� \n", "ȣ��");
      koreanGrade = inputGrade.nextInt(); 
      englishGrade = inputGrade.nextInt(); 
      mathGrade = inputGrade.nextInt(); 

      System.out.printf("����: %d �� \n", koreanGrade);
      System.out.printf("����: %d �� \n", englishGrade);
      System.out.printf("����: %d �� \n", mathGrade);
      System.out.println("-----------------------");
      System.out.printf("����: %.0f �� \n", sumGrade);
      System.out.printf("���: %.3f �� \n", avgGrade);
      System.out.println("-----------------------");
      System.out.println();
      System.out.printf("��� ����: <<< %s >>> \n", wtGrade(avgGrade));
      
      String checkName1 = subName("����", koreanGrade);
      String checkName2 = subName("����", mathGrade);
      String checkName3 = subName("����", englishGrade);
      System.out.println("���� üũ: " + checkName1 + checkName2 + checkName3 + pOrNoK(koreanGrade,englishGrade, mathGrade));
      System.out.println("========================");
      }
   private static String subName(String name,int subGrade) {
                  
       if (subGrade <= 40)
    	   return name + " ";
       else
          return "";
   }
   private static String pOrNoK(int koreanGrade, int englishGrade, int mathGrade) {
      String checkG;
       
      if (koreanGrade <= 40 || englishGrade <= 40 || mathGrade<= 40)
         {checkG = "�������� ���հ�";
         return checkG;}
      else 
         {checkG = "�������� �հ�";}
      
      return checkG;
   }
   private static String wtGrade(double avgGrade) {
      
      String aToF;
      if (avgGrade > 90 && avgGrade <= 100)
         {aToF = "A";
         }
      else if (avgGrade > 70 && avgGrade <=90)
      {aToF = "B";
      }
      else if (avgGrade > 60 && avgGrade <=70)
      {aToF = "C";
      }
      else if (avgGrade > 40 && avgGrade <=60)
      {aToF = "D";
      }
      else 
      {aToF = "F (����)";
      }
      
      return aToF;
   }
   
   public static void main(String[] args) {
      GradeInsert();
   }

}