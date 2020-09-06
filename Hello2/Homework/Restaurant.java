package Homework;


class Guest {
	// �̸�/����/��ȣ��
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
	public static String DEF_tableName = "�⺻���̺�";
	public static final int FLAVOR_BASIC = 0;
	public static final int FLAVOR_SWEET = 1;
	public static final int FLAVOR_SALTY = 2;
	public static final int FLAVOR_HOT = 3;
	public static String FLAVOR[] = {"�⺻��", "�ܸ�", "§��", "�ſ��"};

	//�̸�/���й�ȣ/���̺������/�丮��
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
		FoodTable ResA = new FoodTable("����̺�", 0, 4);
		FoodTable ResB = new FoodTable("����̺�", 1, 10);
		FoodTable ResC = new FoodTable("����̺�", 2, 6);
		FoodTable ResD = new FoodTable("����̺�", 3, 6);
		
		Guest g1 = new Guest("ȣ��", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g2 = new Guest("�κ�", 	(int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g3 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g4 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g5 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g6 = new Guest("ź��", (int)(Math.random()*10+1), (int)(Math.random()*4));;
		Guest g7 = new Guest("��ġ", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g8 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g9 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g10 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g11 = new Guest("�̹�", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g12 = new Guest("�Ƕ�", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g13 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g14 = new Guest("�ζ�", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g15 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g16 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g17 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g18 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g19 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g20 = new Guest("�ϴ�", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g21 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g22 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g23 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g24 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g25 = new Guest("����", (int)(Math.random()*10+1), (int)(Math.random()*4));
		Guest g26 = new Guest("Ĳ��", (int)(Math.random()*10+1), (int)(Math.random()*4));
		
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
		System.out.printf("%d�� '%s' - %s! \n", 
				RES.tableNumber, RES.tableName, FoodTable.FLAVOR[RES.flavor]);
		for (int i = 0; i < gs.length; i++) {
			if(seatNumber < RES.chairs.length) {
				if(RES.flavor == gs[i].flavor) {
					RES.chairs[seatNumber] = gs[i];
					System.out.printf("[%d] %s, %d��, %s\n", 
							seatNumber,gs[i].guestName, gs[i].guestAge, FoodTable.FLAVOR[gs[i].flavor]);
					seatNumber++;
				} else{
					System.out.printf("\t >> %s, %d��, %s ���ܵ� \n", 
							gs[i].guestName, gs[i].guestAge, FoodTable.FLAVOR[gs[i].flavor]);
					} 
			}
		}
		if(seatNumber < RES.chairs.length) {
			int EmptySeat = RES.chairs.length - seatNumber;
				for (int i = 0; i < EmptySeat; i++) {
					System.out.println("[" + seatNumber  + "] �ڸ������" );
					seatNumber++;
				}
			}else System.out.println(" ---- �ڸ� �� �� ---- "); 
		
		}
	
	
	
	

}
		
	



		
	




