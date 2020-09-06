package Homework.film;
import java.util.Scanner;
public class MyMovie {
   public static final String NO_TITLE = "���� ����";
   public static final String NO_PD = "�ǵ� ����";
   public static final int DEF_DIST = 0; 
   public static final String DEF_VIEWER = "����"; 
   public static final String DUMMY_IMG = "default/dummy.png";
   public static final int DUMMY_TIME= 0;
   public static final byte NO_BOOKING = 0; 
   public static final float DEF_RATE = 0.0f; 
   public static final String NO_COMMENT = "��� ����";
   public static final int MAX_VIEWER = 40;
   public static final int MIN_VIEWER = 4;
   public static final int MAX_LEVER = 19;
   
   
   public static final String[] DIST_NAMES = {
         "CJ ENT", "�Ե�", "��ڽ�", "�����", "���ʺ�����"   
      };
//   public static final String[] VIEWER_CLASS = {
//         "��ü������", "12��", "15��", "û�ҳ�����Ұ� "
//      };
   
   public int no;// ��ȣ
   public String title;// ����
   public String pd;// ����
   public int distributor; // ��޻�(��ȣ)
   public int viewerClass; // �������
   public String coverImg; // Ŀ���̹��� (������ ��ġ?=���)
   public int time; // ����Ÿ��
   public byte booking; // ������
   public float rate; // ����
   public String genre; // ����
   public String comment;
   
   public MyMovie() { // �⺻(����)
      
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
      System.out.println("��ȭ ��ȣ�� �Է��ϼ���");
      int no = sc.nextInt();
      System.out.println("��ȭ ������ �Է��ϼ���");
      String title = sc.next();
      System.out.println("��ȭ�� pd�� �Է��ϼ���");
      String pd = sc.next();
      System.out.println("��ȭ�� ��޻縦 �Է��ϼ��� (0. CJ ENT, 1. �Ե�, 2. ��ڽ�, 3.�����, 4. ���ʺ�����");
      int distributor = sc.nextInt();
      System.out.println("��ȭ�� ��������� �Է��ϼ���");
      int viewerClass = sc.nextInt();
      System.out.println("��ȭ�� �̹����� �Է��ϼ���");
      String coverImg = sc.next();
      System.out.println("��ȭ�� ����Ÿ���� �Է��ϼ���");
      int time = sc.nextInt();
      System.out.println("��ȭ�� �������� �Է��ϼ���");
      byte booking = sc.nextByte();
      System.out.println("��ȭ�� ������ �Է��ϼ���");
      float rate = sc.nextFloat();
      System.out.println("��ȭ�� �ڸ�Ʈ�� �Է��ϼ���");
      String comment = sc.next();
      System.out.println("��ȭ�� �帣�� �Է��ϼ���");
      String genre = sc.next();
      
      
      MyMovie m4 = new MyMovie(no, title, pd, distributor, viewerClass, coverImg, time, booking, rate, comment, genre);
      m4.printMyMovie();
   }
      
   
   
   
   public void printMyMovie() {
      System.out.printf("��ȭ:: film-no-%06d \n", no);
      System.out.println("\t ����: " + title);
      System.out.println("\t pd: " + pd);
      System.out.println("\t ��޻�:  " +
               (distributor >= 0 && distributor < DIST_NAMES.length  ? DIST_NAMES[distributor]: "�̻�"));
      System.out.println("\t �������:  " +
            (viewerClass >= 4 && viewerClass < MAX_VIEWER  ? viewerClass : DEF_VIEWER));
      System.out.println("\t �̹���: " + coverImg);
      System.out.println("\t time: " + time);
      System.out.println("\t ����: " + rate + "��");
      System.out.println("\t �ڸ�Ʈ: " + comment);
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