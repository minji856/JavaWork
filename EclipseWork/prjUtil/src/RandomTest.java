import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		// TODO 난수 처리
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		//가위 바위 보
		while(true) {
			String[] com = {"가위", "바위", "보"};
			
			System.out.println("가위, 바위, 보 중 한 가지를 입력하세요");
			// 유저 선택
			String user = sc.next();
			
			if (!user.equals("가위") && !user.equals("바위") && !user.equals("보")) {
				System.out.println("유효한 입력이 아닙니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println("나의 선택 : " + user);
			
			// 컴퓨터 선택
			int randomIndex = rnd.nextInt(com.length);
			String randomComputerChoice = com[randomIndex];
			System.out.println("컴퓨터의 선택 : " + randomComputerChoice);
			
			if(user.equals(randomComputerChoice)) {
				System.out.println("무승부");
			} else if(user.equals("가위") && randomComputerChoice.equals("보") ||
					user.equals("주먹") && randomComputerChoice.equals("가위") ||
					user.equals("보") && randomComputerChoice.equals("주먹")
					) {
				System.out.println("나의 승리");
			} else 
				System.out.println("컴퓨터의 승리");
			break;
		} // while 문 종료