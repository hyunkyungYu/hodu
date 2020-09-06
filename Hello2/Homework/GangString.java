package Homework;

public class GangString {

   public static void main(String[] args) {
      String wiki1 = 
            "The Coterel gang"; 
      String wiki2 = 
            "The Coterel gang was an armed group in the English North Midlands that roamed across the countryside in the late 1320s and early 1330s, a period of political upheaval and lawlessness. Despite repeated attempts by the crown to suppress James Coterel and his band, they committed murder, extortion and kidnapping across the Peak District.";      
      firstShow(wiki1);
   }
   
   public static void upsideDown(String input) {
      
      int howManyC = input.length();
      char[] inputSentence = input.toCharArray();
      for (int i = 0; i < howManyC; i++) {
         System.out.printf("'%c'(%d) ", inputSentence[howManyC-1-i], (int)inputSentence[howManyC-1-i]);
      }
      
   }
   public static void firstShow(String input) {
      
      char[] inputSentence = input.toCharArray();
      int[] whereIsFirst = new int[26];
      
      for (int i = 0; i < input.length()-1 ; i++) {
         for (int j = 0; j < 26; j++) {
            if( (int)inputSentence[i] == (int)(97+j))  { 
            	System.out.println("j1 =" + j);
//               whereIsFirst[j] = i; 
               } else { whereIsFirst[j] = -1; }
      }
      }
      System.out.println(inputSentence[2]);
      System.out.println(whereIsFirst[7]);
      for (int i = 0; i < whereIsFirst.length; i++) {
         System.out.printf("%c의 첫위치 => %d번째 등장 \n", (char)(97+i), whereIsFirst[i] );
      }
   }
   
   
}