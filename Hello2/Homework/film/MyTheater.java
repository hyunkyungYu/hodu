package Homework.film;

//���� Ŭ���� �ۼ�
public class MyTheater {
   String title = "CGV"; // ��ȭ�� �̸�. 
   String address= "����� ������"; // ��ȭ�� �ּ�
   public int movSize; // = 3 �󿵰� ��..;
   MyMovie[] mov;
    //int[] mov; // = {null, null, null};

   public MyTheater() {
      movSize = 3; // �ʱ�ȭ
      mov = new MyMovie[movSize];   
      
   }
   
  
   
   public MyTheater(String title, String address, int movSize, MyMovie[] mov) {
      super();
      this.title = title;
      this.address = address;
      this.movSize = movSize;
      this.mov = mov;
   }
    public void printTheater() {
       System.out.printf("* %s (%s) \n", title, address);
      int floor = 0;
      for (MyMovie mv : mov)  {
         System.out.printf("\t [%d��] ", (floor++ + 1));
         if( mv != null) {
            System.out.printf(" '%s', %s, %.1f ��\n", mv.title, mv.genre, mv.rate);
            } else { // null
            System.out.println(" ������� ");   
            }      
      }
    }
    public void addMoiveToTheater(int floor, MyMovie mv) {
    	if( mov[floor] == null && mv.viewerClass >= MyMovie.MAX_LEVER) {
    		mov[floor] = mv;
    	} else if(mov[floor] != null ){
    		System.out.println((floor+1) + "���� ��� �� �Դϴ�.");
    	} else {
    		System.out.println("���� ��� �̴��Դϴ�.");
    	}
    	
   }

}