package Homework.film;



public class MovieTest {

      public static void main(String[] args) {
    	   MyTheater cgv = new MyTheater();
    	   
    	   MyMovie mv1 = new MyMovie(1, "�˶��", 25,  3.3f, "��Ÿ��/�ִ�");
    	   MyMovie mv2 = new MyMovie(2, "������ �߾�", 19, 2.5f, "�߸�/������");
    	   MyMovie mv3 = new MyMovie(3, "ȣ��", 4, 4.2f, "�ִϸ��̼�");
    	   MyMovie mv4 = new MyMovie(4, "���", 30, 4.6f, "�߸�/������");
    	   MyMovie mv5 = new MyMovie(5, "�ٸ� �ǿ��� ���ϼҼ�", 22, 3.9f, "����/�׼�");
    	   MyMovie mv6 = new MyMovie(6,"������ ����", 26, 4.3f, "�ڹ̵�/�׼� ");
    	   MyMovie mv7 = new MyMovie(7, "��ö��2: ����ȸ��", 18, 2.1f, "���/�׼�");
    	   MyMovie mv8 = new MyMovie(8, " �� �������� : ���ϸ��� ����", 15, 1.8f, "�ִϸ��̼�/��Ÿ�� ");
    	   MyMovie mv9 = new MyMovie(9, "�ݵ�", 36, 3.3f, "�׼�/��� ");
    	   MyMovie mv10 = new MyMovie(10, "�ִϸ� ũ��Ŀ",28, 2.5f, "�ִϸ��̼�/���� ");

    	   cgv.addMoiveToTheater(1, mv3);
    	   cgv.addMoiveToTheater(2, mv9);
    	   cgv.addMoiveToTheater(0, mv5);
    	   cgv.addMoiveToTheater(0, mv4);
    	   cgv.addMoiveToTheater(2, mv8);
    	   cgv.addMoiveToTheater(1, mv10);
    	   cgv.printTheater();
         
      }
     
   }
   

