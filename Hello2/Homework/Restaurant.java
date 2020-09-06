package Homework;


class Guest {
	// 이름/나이/선호맛
	public String guestName;
	public int guestAge;
	public int flavor;
	
	public Guest(String guestName, int guestAge, int flavor) {
		this.guestName = guestName;
		this.guestAge = guestAge;
		this.flavor = flavor;
	} 
	
}

class FoodTable {
	public static String DEF_tableName = "기본테이블";
	public static final int FLAVOR_BASIC = 0;
	public static final int FLAVOR_SWEET = 1;
	public static final int FLAVOR_SALTY = 2;
	public static final int FLAVOR_HOT = 3;
	public static String FLAVOR[] = {"기본맛", "단맛", "짠맛", "매운맛"};

	//이름/구분번호/테이블사이즈/요리맛
	public String tableName;
	public int tableNumber;
	public int flavor; 
	public int size;
	public Guest[] chairs;
	
	public FoodTable(String tableName, int flavor, int size) {
		super();
		this.tableName = tableName;
		this.flavor = flavor;
		this.size = size;
		this.chairs = new Guest[this.size];
	}
	
	public FoodTable(String tableName, int tableNumber, int flavor, int size, Guest[] chairs) {
		super();
		this.tableName = tableName;
		this.tableNumber = tableNumber;
		this.flavor = flavor;
		this.size = size;
		this.chairs = chairs;
		this.chairs = new Guest[this.size];
	}
	
	
	
	
}


public class Restaurant {

	public static void main(String[] args) {
		FoodTable ResA = new FoodTable("찌개테이블", 0, 4);
		FoodTable ResB = new FoodTable("찌개테이블", 1, 10);
		FoodTable ResC = new FoodTable("찌개테이블", 2, 6);
		FoodTable ResD = new FoodTable("찌개테이블", 3, 6);
		
		Guest g1 = new Guest("호두", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g2 = new Guest("두부", 	(int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g3 = new Guest("똘이", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g4 = new Guest("초코", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g5 = new Guest("쫑이", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g6 = new Guest("탄이", (int)(Math.random()*10+1), (int)(Math.random()*4));;
		Guest g7 = new Guest("또치", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g8 = new Guest("별이", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g9 = new Guest("감자", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g10 = new Guest("구마", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g11 = new Guest("미미", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g12 = new Guest("또또", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g13 = new Guest("망고", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g14 = new Guest("로랑", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g15 = new Guest("코코", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g16 = new Guest("지지", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g17 = new Guest("딱지", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g18 = new Guest("레오", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g19 = new Guest("구름", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g20 = new Guest("하늘", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g21 = new Guest("달이", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g22 = new Guest("동동", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g23 = new Guest("봉이", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g24 = new Guest("로이", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g25 = new Guest("랭구", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g26 = new Guest("캉구", (int)(Math.random()*10+1), (int)(Math.random()*4));
		
		Guest[] gs = {g1, g2, g3, g4, g5,
				g6, g7, g8, g9, g10,
				g11, g12, g13, g14, g15, g16, g17, g18, g19, g20,
				g21, g22, g23, g24, g25, g26
				};
		ResA.tableNumber = 1;
		
	
		addToTable(ResA, gs);	
		addToTable(ResB, gs);	
		addToTable(ResC, gs);	
		addToTable(ResD, gs);	
	}
		
	
	public static void addToTable(FoodTable RES, Guest[] gs) {
		int seatNumber = 0;
		System.out.printf("%d번 '%s' - %s! \n", 
				RES.tableNumber, RES.tableName, FoodTable.FLAVOR[RES.flavor]);
		for (int i = 0; i < gs.length; i++) {
			if(seatNumber < RES.chairs.length) {
				if(RES.flavor == gs[i].flavor) {
					RES.chairs[seatNumber] = gs[i];
					System.out.printf("[%d] %s, %d세, %s\n", 
							seatNumber,gs[i].guestName, gs[i].guestAge, FoodTable.FLAVOR[gs[i].flavor]);
					seatNumber++;
				} else{
					System.out.printf("\t >> %s, %d세, %s 제외됨 \n", 
							gs[i].guestName, gs[i].guestAge, FoodTable.FLAVOR[gs[i].flavor]);
					} 
			}
		}
		if(seatNumber < RES.chairs.length) {
			int EmptySeat = RES.chairs.length - seatNumber;
				for (int i = 0; i < EmptySeat; i++) {
					System.out.println("[" + seatNumber  + "] 자리비었음" );
					seatNumber++;
				}
			}else System.out.println(" ---- 자리 꽉 참 ---- "); 
		
		}
	
	
	
	

}
		
	



		
	




