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
      
      System.out.println("==== 성적 등급 판정표 ====");
      System.out.printf("이름 : '%s'씨 \n", "호두");
      koreanGrade = inputGrade.nextInt(); 
      englishGrade = inputGrade.nextInt(); 
      mathGrade = inputGrade.nextInt(); 

      System.out.printf("국어: %d 점 \n", koreanGrade);
      System.out.printf("영어: %d 점 \n", englishGrade);
      System.out.printf("수학: %d 점 \n", mathGrade);
      System.out.println("-----------------------");
      System.out.printf("총점: %.0f 점 \n", sumGrade);
      System.out.printf("평균: %.3f 점 \n", avgGrade);
      System.out.println("-----------------------");
      System.out.println();
      System.out.printf("등급 판정: <<< %s >>> \n", wtGrade(avgGrade));
      
      String checkName1 = subName("국어", koreanGrade);
      String checkName2 = subName("수학", mathGrade);
      String checkName3 = subName("영어", englishGrade);
      System.out.println("과락 체크: " + checkName1 + checkName2 + checkName3 + pOrNoK(koreanGrade,englishGrade, mathGrade));
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
         {checkG = "과락으로 불합격";
         return checkG;}
      else 
         {checkG = "없음으로 합격";}
      
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
      {aToF = "F (낙제)";
      }
      
      return aToF;
   }
   
   public static void main(String[] args) {
      GradeInsert();
   }

}