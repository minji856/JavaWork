abstract class TwoDShape {
	private double width;
	private double height;
	private String name;	
	
	public TwoDShape(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}			// 편의상 setter 생략 생성자가 있기 때문

	public double getWidth() { return width; }
	public double getHeight() { return height; }
	public String getName() { return name; }
	
	public abstract double getArea(); 

//	double getArea() {
//		return 0.0;		면적을 미리 구해놓을 수 없음 무조건 자식이 고쳐서 써야함
//	}					 그렇다고 0.0 을 지우면 문법 에러가 난다
}

class Triangle extends TwoDShape {
	Triangle(double w, double h, String n){
		super(w, h, n);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2;	/* 오버라이딩 */
		// 면적 구하는 방법을 몰랐을때 고치는것
	}
}

class Rectangle extends TwoDShape{
	Rectangle(double w, double h, String n){
		super(w, h, n);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2;	/* 오버라이딩 */
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		// TODO 2차원 도형을 그리기 위한 프로그램
		Triangle tr1 = new Triangle(5.0, 5.0, "정삼각형");
		Triangle tr2 = new Triangle(7.0, 15.0, "직각삼각형");
		Rectangle re1 = new Rectangle(3.0, 3.0, "정사각형");
		Rectangle re2 = new Rectangle(3.0, 6.0, "정사각형");
		// TwoDShape ts1 = new TwoDShape(5.0, 5.0, "2차원 도형");
		
//		System.out.println(tr1.getName() + " : " + tr1.getArea());
//		System.out.println(re1.getName() + " : " + re1.getArea());
		
		// 자식클래스들이기 때문에 다 묶을 수 있는것이다
		TwoDShape [] t= {tr1, tr2, re1, re2,
				new Rectangle(3.0, 4.0, "그냥 사각형")};
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i].getName() + ":" + t[i].getArea());
		}
	}
}
