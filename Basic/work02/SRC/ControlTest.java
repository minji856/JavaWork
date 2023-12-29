/*class ControlTest{
	public static void main(String[] args) throws java.io.IOException{
		System.out.println("입력해주세요 :");
		int input = java.lang.System.in.read();
		if(input == (char)System.in.read()) {
			System.out.println("문자");
		} else {
			System.out.println("기타");
		}
	}
}*/
		/*
		1. 입력받은 값이 문자이면 "문자"라고 출력하고 그렇지 않으면 "기타"라고 출력
		*/
		
		
		/*
		2. 입력받은 값이 소문자이면 소문자라고 출력하고 대문자이면 대문자라고 출력하고
		숫자이면 숫자라고 출력하고 그 외에는 기타라고 출력
		*/
		
		
		/*
		3. 간단한 전자계산기 (연산자에 q나 Q를 입력하면 종료)
			연산자 : +
			숫자1 : 2
			숫자2 : 4
			결과 : 2 + 4 = 6
		*/
		
		/*
		간단한 도움말 시스템을 만들자
		1.if
		2.switch
		3.while
		4.for
		번호선택 : 1
		if (조건시) 문장;
		
		
		1. if
		2. switch
		3. while
		4. for
		번호선택 : 3
		while (조건식) 문장;

		...

		번호선택 : 0을 누르면 종료
		*/

		/* 
		"." 입력이 될때까지 키보드 입력을 읽어서 입력된 공백의 갯수를 세고 그 합을 출력하시오.
		*/
		
// javac -d ../bin ControlTest.java
// java -cp ../bin ControlTest		
class ControlTest {
	public static void main (String[] args) throws java.io.IOException{
		/*char choice; 
		do{
			System.out.println("Help on: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
			System.out.println("Choose one: ");
			choice = (char)System.in.read();
		} while(choice <'1' |choice> '5');
		
		System.out.print("\n");
		
		switch(choice) {
			case '1':
				System.out.print("if 문법...");
				break;
			case '2':
				System.out.print("switch 문법...");
				break;	
			case '3':
				System.out.print("while 문법...");
				break;	
			case '4':
				System.out.print("for 문법...");
				break;	
			case '5':
				System.out.print("do-while 문법...");
				break;	
		}*/
		char ch;
		int spaces = 0;
		System.out.println("Enter a period to stop.");
		do{
			ch = (char)System.in.read();
			if(ch == ' ')
				spaces++; //갯수를 세주기 위해
		}while(ch != '.');
		
		System.out.println("공백의 갯수: " + spaces);
	}
}

//변수 choice를 선언하여 키보드 입력받은 값 가져오기