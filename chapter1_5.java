import java.util.Scanner;

public class chapter1_5 {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요>>");
		Scanner age = new Scanner(System.in);
		
		int year = age.nextInt();
		
		int red, blue, yellow, sum;
		
		red = year/10;
		blue = (year%10)/5;
		yellow =((year%10)%5);
		sum = red + blue + yellow;
		
		if (year>0) {
			System.out.println("빨간 초 " + red + "개, 파란 초 " + blue + "개. 총 " + sum + "개가 필요합니다.");	
		}
		else {
			System.out.println("나이는 양수로만 입력하세요.");
		}
		
		age.close();

	}

}
