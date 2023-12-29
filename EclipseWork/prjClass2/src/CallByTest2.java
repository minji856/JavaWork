
//public class CallByTest2 {
//	void swap(int[] nums){	
//		int temp = nums[0];	
//		nums[0] = nums[1];
//		nums[1] = temp;
//	}
//		
//	public static void main(String[] args) {
//		// TODO 값과 참조에 의한 전달2
//	int [] nums = {10, 15};
//	
//	System.out.println("두 수의 교환");	
//	CallByTest2 m2 = new CallByTest2();
//	m2.swap(nums); 	// 값을 넘지는건 nums[0],nums[1] 결과값 필요 ||  nums만 넣는건 주소
//	
//	System.out.println("num1= " + nums[0] + ", num2 " + nums[1]);
//	}
//}

// 값을 넣었을때
public class CallByTest2 {
	int[] swap(int n1, int n2){	
		int temp = n1;	
		n1 = n2;
		n2 = temp;
		
		int[] nums = {n1, n2};
		return nums;
	}
		
	public static void main(String[] args) {
		// TODO 값과 참조에 의한 전달2
	int num1 = 10, num2 = 15;
	
	System.out.println("두 수의 교환");	
	CallByTest2 m2 = new CallByTest2();
	int[] nums = m2.swap(num1, num2);
	
	System.out.println("num1= " + nums[0]+ ", num2= " + nums[1]);
	}
}
