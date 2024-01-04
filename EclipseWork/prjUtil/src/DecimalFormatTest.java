import java.text.DecimalFormat;

public class DecimalFormatTest {
	public static void main(String[] args) {
		// TODO java.text.DecimalFormat
		double d1 = 2.523, d2 = 3.123;
		double result = d1 + d2;
		System.out.println(result);
		
		// 다른 방법으로도 객체 생성 가능 - 싱글톤
		DecimalFormat df = new DecimalFormat("#.##");
		/* 실제 작업은 format 메서드 결과값이 숫자같아보이지만 문자형태다 */
		System.out.println(df.format(result));
		String strResult = df.format(result);
		
		/* 결과를 다시 숫자로 바꿔야 여러 연산처리를 할 수있다 */
		System.out.println(strResult);
		
		/* 캐스팅이 안 되는 이유 : 객체라서. char만 기본타입이고 String은 객체다 
		 * 둘다 문자라서 혼동쉬움
		 * 기본타입만 캐스팅 할 수 있음 객체를 비객체로 바꿀 수 없지만
		 * 비객체는 객체로 바꾸기 쉽다 wrapper 클래스 사용 */
		//double d = (double)strResult; (오류)
		double d = Double.parseDouble(strResult);
		System.out.println(d);
	}

}
