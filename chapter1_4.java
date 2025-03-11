import java.util.Scanner;

public class chapter1_4 {

	public static void main(String[] args) {
		System.out.println("여행지 >> ");
		System.out.println("인원수 >> ");
		System.out.println("숙박일 >> ");
		System.out.println("1인당 항공료 >> ");
		System.out.println("1방 숙박비 >> ");
		Scanner trip = new Scanner(System.in);
		
		String city = trip.next() + " " + trip.next();
		int number = trip.nextInt();
		int day = trip.nextInt();
		int airplane = trip.nextInt();
		int hotel = trip.nextInt();
		
		int room;
		
		if(number%2==1) {
			room = (number+1)/2;
		}
		else {
			room = number/2;
		}
		
		int money;
		money = airplane * number + hotel * room * day;

		
		System.out.println(number + "명의 " + city + " " + day + "박 " + "5일 여행에는 " + room + "개 필요하며 경비는 " + money + " 원입니다.");
		
		trip.close();
	}

}
