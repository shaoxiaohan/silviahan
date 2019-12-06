package day1;

public class Demo05 {
	public static void main(String[] args) {
		
		//1-100的偶数求和
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				sum += i;
//			}
//		}
//		System.out.println("1-100偶数的和是："+sum);
		
		//水仙花数的列举
//		for(int i=100;i<=999;i++) {
//			int a=i%10;//个位
//			int b=i/10%10;//十位
//			int c=i/100;//百位
//			if(a*a*a+b*b*b+c*c*c==i) {
//				System.out.println(i);
//			}
//		}

		//1-100求和
		int i=1;
		int sum=0;
		while(i<=100) {
			sum +=i;
			i++;
		}
		System.out.println("1-100的和是："+sum);
	}

}
