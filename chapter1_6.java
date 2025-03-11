import java.util.Scanner;

public class chapter1_6 {

	public static void main(String[] args) {
		System.out.println(" (x1, y1), (x2, y2)의 좌표 입력 >> ");
		Scanner square = new Scanner(System.in);
		
		int x1 = square.nextInt();
		int y1 = square.nextInt();
		int x2 = square.nextInt();
		int y2 = square.nextInt();
		
		if((x1 <= 200 && x1 >= 10)&&(x2 <= 200 && x2 >= 10)&&(y1 <= 300 && y1 >= 10)&&(y2 <= 300 && y2 >= 10)) {
			System.out.println("(" + x1 + ","+y1 + "), (" + x2 + ","+y2 + ") 사각형은 (10, 10) (200, 300) 사각형에 포함된다.");
		}
		else {
			System.out.println("(" + x1 + ","+y1 + "), (" + x2 + ","+y2 + ") 사각형은 (10, 10) (200, 300) 사각형에 포함되지 않는다.");
		}
		
		square.close();
	}

}
