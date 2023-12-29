package bytestream;

import java.io.Serializable;
// 직렬화를 하라는 지시. 인터페이스를 만들어준다 시리얼라이저블
// byte로 쪼개서 데이터를 보낼수있도록 해라
public class Employee implements Serializable{
	private int no;
	private String name;
	private String job;
	private int deptno;
	private double sal;
	
	// 내용을 변경하려면 getter, setter 썼어야함. 지금은 그냥 오브젝트만 Source 통해서 만들어줌
	public Employee(int no, String name, String job, int deptno, double sal) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.deptno = deptno;
		this.sal = sal;
	}
	
	/* Object 메서드인 toString 사용가능. 모든 클래스의 부모니까
	 * 오버라이드. Object 안에 있는건 public이다 물려줘야하니까 */
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + job+ "\t" + deptno + "\t" + sal;
	}
}
