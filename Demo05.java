package day1;

public class Demo05 {
	public static void main(String[] args) {
		
		//1-100��ż�����
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				sum += i;
//			}
//		}
//		System.out.println("1-100ż���ĺ��ǣ�"+sum);
		
		//ˮ�ɻ������о�
//		for(int i=100;i<=999;i++) {
//			int a=i%10;//��λ
//			int b=i/10%10;//ʮλ
//			int c=i/100;//��λ
//			if(a*a*a+b*b*b+c*c*c==i) {
//				System.out.println(i);
//			}
//		}

		//1-100���
		int i=1;
		int sum=0;
		while(i<=100) {
			sum +=i;
			i++;
		}
		System.out.println("1-100�ĺ��ǣ�"+sum);
	}

}
