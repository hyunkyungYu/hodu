import java.util.Scanner;

public class IF2 {

	public static int rNumber() {

		return (int) (Math.random() * 91 + 1);
	}

	public static void main(String[] args) {

		System.out.println("***���� ����***");
		int goodA = rNumber();
		System.out.println(goodA);

		System.out.println("����");
		System.out.println("ljy yhk yd");

		boolean loopNumber = true;
		int count = 0;
		while (loopNumber) {
			Scanner a = new Scanner(System.in);
			System.out.println("���� ���� �Է��ϼ���");

			int tempA = a.nextInt();

			count = count + 1;
			System.out.println(count + "��° ��ȸ :" + tempA);

			
			
				
			if (goodA < tempA)
				{System.out.println("�ٿ�");}

			else if (goodA > tempA) {
				
				System.out.println("��");}
				

			else {
				
				System.out.println("����!");
				break;}
			
			if (count >= 7)
			{System.out.println("Ż��");
			break;}
			
			}

		}
	}


