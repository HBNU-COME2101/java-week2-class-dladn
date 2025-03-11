import java.util.Scanner;

public class chapter1_3 {
	public static void main(String args[]) {
		System.out.println("생일 입력 하세요 >> ");
		Scanner birthday = new Scanner(System.in);
		
		int birthDay = birthday.nextInt();
		System.out.println(birthDay/10000 + "년 " + (birthDay%10000)/100 + "월 " + (birthDay%10000)%100 + "일");
		
		birthday.close();
	}
}


