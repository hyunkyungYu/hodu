package Homework.film;

//극장 클래스 작성
public class MyTheater {
   String title = "CGV"; // 영화관 이름. 
   String address= "서울시 강남구"; // 영화관 주소
   public int movSize; // = 3 상영관 수..;
   MyMovie[] mov;
    //int[] mov; // = {null, null, null};

   public MyTheater() {
      movSize = 3; // 초기화
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
         System.out.printf("\t [%d관] ", (floor++ + 1));
         if( mv != null) {
            System.out.printf(" '%s', %s, %.1f 점\n", mv.title, mv.genre, mv.rate);
            } else { // null
            System.out.println(" 비어있음 ");   
            }      
      }
    }
    public void addMoiveToTheater(int floor, MyMovie mv) {
    	if( mov[floor] == null && mv.viewerClass >= MyMovie.MAX_LEVER) {
    		mov[floor] = mv;
    	} else if(mov[floor] != null ){
    		System.out.println((floor+1) + "관은 사용 중 입니다.");
    	} else {
    		System.out.println("관람 등급 미달입니다.");
    	}
    	
   }

}