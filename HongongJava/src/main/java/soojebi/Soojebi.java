package soojebi;

public class Soojebi{
	public static void main(String[] args){
		int r1 = 1;
		int r2 = 1;
		int r3 = 0;

		while(r3 < 100){
			r3 = r1 + r2;
			r1 = r2;
			r2 = r3;
			System.out.print(r3);
		}
	}
}
