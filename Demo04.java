package day1;
import java.util.Scanner;
public class Demo04 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ����1-7��֮��������");
		int num= scanner.nextInt();
		switch(num) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
			
		default:
			System.out.println("��������ȷ�����֣�1-7��");
			break;
				
		}
	}
}
