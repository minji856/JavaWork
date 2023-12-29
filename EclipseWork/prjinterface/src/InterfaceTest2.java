//interface Interf1{
//	int a = 1;
//}
//
//interface Interf2{
//	int b = 2;
//}
//
//interface Interf3{
//	int c = 3;
//}
//
//public class InterfaceTest2 implements Interf1, Interf2, Interf3{
//	public static void main(String[] args) {
//		// TODO 인터페이스 다중 상속
//		System.out.println(a + ", " + b +
//				", " + c);	// 상속받으면 마치 내것처럼 써도 된다
//	}
//}

//interface Interf1{
//	int a = 1;
//}
//
//interface Interf2 extends Interf1{
//	int b = 2;
//}
//
//interface Interf3 extends Interf2{
//	int c = 3;	// a, b, c
//}
//
//public class InterfaceTest2 implements Interf3{
//	public static void main(String[] args) {
//		// TODO 인터페이스 다중 상속
//		System.out.println(a + ", " + b +
//				", " + c);	// 상속받으면 마치 내것처럼 써도 된다
//	}
//}

interface Interf1{
	int a = 1;
}

interface Interf2{
	int b = 2;
}

interface Interf3 extends Interf1, Interf2{
	int c = 3;	// a, b, c
}

public class InterfaceTest2 implements Interf3{
	public static void main(String[] args) {
		// TODO 인터페이스 다중 상속
		System.out.println(a + ", " + b +
				", " + c);	// 상속받으면 마치 내것처럼 써도 된다
	}
}
