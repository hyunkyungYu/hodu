package Homework.film;
import java.util.Scanner;
public class MyMovie {
   public static final String NO_TITLE = "제목 없음";
   public static final String NO_PD = "피디 없음";
   public static final int DEF_DIST = 0; 
   public static final String DEF_VIEWER = "미정"; 
   public static final String DUMMY_IMG = "default/dummy.png";
   public static final int DUMMY_TIME= 0;
   public static final byte NO_BOOKING = 0; 
   public static final float DEF_RATE = 0.0f; 
   public static final String NO_COMMENT = "댓글 없음";
   public static final int MAX_VIEWER = 40;
   public static final int MIN_VIEWER = 4;
   public static final int MAX_LEVER = 19;
   
   
   public static final String[] DIST_NAMES = {
         "CJ ENT", "롯데", "쇼박스", "디즈니", "워너브라더스"   
      };
//   public static final String[] VIEWER_CLASS = {
//         "전체관람가", "12세", "15세", "청소년관람불가 "
//      };
   
   public int no;// 번호
   public String title;// 제목
   public String pd;// 감독
   public int distributor; // 배급사(번호)
   public int viewerClass; // 관람등급
   public String coverImg; // 커버이미지 (파일의 위치?=경로)
   public int time; // 러닝타임
   public byte booking; // 예매율
   public float rate; // 평점
   public String genre; // 평점
   public String comment;
   
   public MyMovie() { // 기본(더미)
      
      no = 0;
      title = NO_TITLE;
      pd = NO_PD;
      distributor = DEF_DIST; 
      viewerClass = MIN_VIEWER;
      coverImg = DUMMY_IMG;
      time = DUMMY_TIME;
      booking = NO_BOOKING;
      rate = 0.0f;
      comment = NO_COMMENT;
      
   }
   
   public static void insertMovie() {
      Scanner sc = new Scanner(System.in);
      System.out.println("영화 번호를 입력하세요");
      int no = sc.nextInt();
      System.out.println("영화 제목을 입력하세요");
      String title = sc.next();
      System.out.println("영화의 pd를 입력하세요");
      String pd = sc.next();
      System.out.println("영화의 배급사를 입력하세요 (0. CJ ENT, 1. 롯데, 2. 쇼박스, 3.디즈니, 4. 워너브라더스");
      int distributor = sc.nextInt();
      System.out.println("영화의 관람등급을 입력하세요");
      int viewerClass = sc.nextInt();
      System.out.println("영화의 이미지를 입력하세요");
      String coverImg = sc.next();
      System.out.println("영화의 러닝타임을 입력하세요");
      int time = sc.nextInt();
      System.out.println("영화의 예매율을 입력하세요");
      byte booking = sc.nextByte();
      System.out.println("영화의 평점을 입력하세요");
      float rate = sc.nextFloat();
      System.out.println("영화의 코멘트를 입력하세요");
      String comment = sc.next();
      System.out.println("영화의 장르를 입력하세요");
      String genre = sc.next();
      
      
      MyMovie m4 = new MyMovie(no, title, pd, distributor, viewerClass, coverImg, time, booking, rate, comment, genre);
      m4.printMyMovie();
   }
      
   
   
   
   public void printMyMovie() {
      System.out.printf("영화:: film-no-%06d \n", no);
      System.out.println("\t 제목: " + title);
      System.out.println("\t pd: " + pd);
      System.out.println("\t 배급사:  " +
               (distributor >= 0 && distributor < DIST_NAMES.length  ? DIST_NAMES[distributor]: "미상"));
      System.out.println("\t 관람등급:  " +
            (viewerClass >= 4 && viewerClass < MAX_VIEWER  ? viewerClass : DEF_VIEWER));
      System.out.println("\t 이미지: " + coverImg);
      System.out.println("\t time: " + time);
      System.out.println("\t 평점: " + rate + "점");
      System.out.println("\t 코멘트: " + comment);
      System.out.println("-----------------------");
   }
   //full


   public MyMovie(int no, String title, String pd, int distributor, int viewerClass, String coverImg, int time,
         byte booking, float rate, String comment, String genre) {
      this.no = no;
      this.title = title;
      this.pd = pd;
      this.distributor = distributor;
      this.viewerClass = viewerClass;
      this.coverImg = coverImg;
      this.time = time;
      this.booking = booking;
      this.rate = rate;
      this.comment = comment;
      this.genre = genre;
   }


   public MyMovie(int no, String title, String pd, int distributor, int viewerClass, String coverImg, int time, String genre) {
      this.no = no;
      this.title = title;
      this.pd = pd;
      this.distributor = distributor;
      this.viewerClass = viewerClass;
      this.coverImg = coverImg;
      this.time = time;
      this.genre = genre;
   }


   public MyMovie(int no, String title, String pd, int distributor, byte booking, float rate, String comment, String genre) {
      this.no = no;
      this.title = title;
      this.pd = pd;
      this.distributor = distributor;
      this.booking = booking;
      this.rate = rate;
      this.comment = comment;
      this.genre = genre;
   }


   public MyMovie(int no, String title, int viewerClass, String coverImg, int time, byte booking, float rate,
         String comment, String genre) {
      this.no = no;
      this.title = title;
      this.viewerClass = viewerClass;
      this.coverImg = coverImg;
      this.time = time;
      this.booking = booking;
      this.rate = rate;
      this.comment = comment;
      this.genre = genre;
   }

   public MyMovie(String title, float rate, String genre) {
 
      this.title = title;
      this.rate = rate;
      this.genre = genre;
   }

   public MyMovie(int no, String title, int viewerClass, float rate, String genre) {

	   this.no = no;
	   this.title = title;
	   this.viewerClass = viewerClass;
	   this.rate = rate;
	   this.genre = genre;
}
   				
   
   
   
}