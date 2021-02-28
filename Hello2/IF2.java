import java.util.Scanner;

public class IF2 {

	public static int rNumber() {

		return (int) (Math.random() * 91 + 1);
	}

	public static void main(String[] args) {

		System.out.println("***숫자 게임***");
		int goodA = rNumber();
		System.out.println(goodA);

		System.out.println("시작");
		System.out.println("ljy yhk yd");

		boolean loopNumber = true;
		int count = 0;
		while (loopNumber) {
			Scanner a = new Scanner(System.in);
			System.out.println("예측 수를 입력하세요");

			int tempA = a.nextInt();

			count = count + 1;
			System.out.println(count + "번째 기회 :" + tempA);

			
			
				
			if (goodA < tempA)
				{System.out.println("다운");}

			else if (goodA > tempA) {
				
				System.out.println("업");}
				

			else {
				
				System.out.println("정답!");
				break;}
			
			if (count >= 7)
			{System.out.println("탈락");
			break;}
			
			}

		}
	}


