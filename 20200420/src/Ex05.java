import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("스위치 공부해야됨");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		//ctrl +  shift + f <-자동정렬
		switch (input) {
		case 1:
			System.out.println("1을 입력 하셧습니다");
			break;
		case 2:
			System.out.println("2를 입력 하셧습니다");
			
			break;
		case 3:
			System.out.println("3을 입력 하셧습니다");
			
			break;

		default:
			System.out.println("잘 못 입력 하셧습니다");

			break;
		}
	}
}
