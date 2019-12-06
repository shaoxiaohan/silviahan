package day1;

import java.util.Random;
import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100);
		System.out.println(num);

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的数字（1-100），只有五次机会哦:");

		boolean flag = true;
		int count = 0;

		while (flag) {
			if (count < 5) {
				int mynum = scanner.nextInt();
				if (mynum > num) {
					System.out.println("大了");
				} else if (mynum < num) {
					System.out.println("小了");
				} else {
					System.out.println("bingo");
				}
				count++;
			} else {
				System.out.println("次数用完");
				break;
			}
		}

	}

}
