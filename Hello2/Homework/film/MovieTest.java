package Homework.film;



public class MovieTest {

      public static void main(String[] args) {
    	   MyTheater cgv = new MyTheater();
    	   
    	   MyMovie mv1 = new MyMovie(1, "알라딘", 25,  3.3f, "판타지/애니");
    	   MyMovie mv2 = new MyMovie(2, "살인의 추억", 19, 2.5f, "추리/스릴러");
    	   MyMovie mv3 = new MyMovie(3, "호두", 4, 4.2f, "애니메이션");
    	   MyMovie mv4 = new MyMovie(4, "향수", 30, 4.6f, "추리/스릴러");
    	   MyMovie mv5 = new MyMovie(5, "다만 악에서 구하소서", 22, 3.9f, "범죄/액션");
    	   MyMovie mv6 = new MyMovie(6,"오케이 마담", 26, 4.3f, "코미디/액션 ");
    	   MyMovie mv7 = new MyMovie(7, "강철비2: 정상회담", 18, 2.1f, "드라마/액션");
    	   MyMovie mv8 = new MyMovie(8, " 더 프린세스 : 도둑맞은 공주", 15, 1.8f, "애니메이션/판타지 ");
    	   MyMovie mv9 = new MyMovie(9, "반도", 36, 3.3f, "액션/드라마 ");
    	   MyMovie mv10 = new MyMovie(10, "애니멀 크래커",28, 2.5f, "애니메이션/모험 ");

    	   cgv.addMoiveToTheater(1, mv3);
    	   cgv.addMoiveToTheater(2, mv9);
    	   cgv.addMoiveToTheater(0, mv5);
    	   cgv.addMoiveToTheater(0, mv4);
    	   cgv.addMoiveToTheater(2, mv8);
    	   cgv.addMoiveToTheater(1, mv10);
    	   cgv.printTheater();
         
      }
     
   }
   

