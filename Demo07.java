package day1;

public class Demo07 {
	public static void main(String[] args) {
//设置数组长度
		int[] arr = new int[3];
//静态初始化
		int[] arr1 = { 1, 2, 3, 4, 5 };
		//System.out.println(arr1[0]);
		
		int[] arr2=null;
		//System.out.println(arr2[0]);
		
		int[] arr3=new int[2];
		arr3[0]=200;
		arr3[1]=300;
		int[] arr4=arr3;
		arr4[0]=100;
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr4[0]);
//		System.out.println(arr4[1]);
		
		int[] arr5= {1,2,3,4,5};
//		for(int i=0;i<arr5.length;i++) {
//			System.out.println(arr5[i]);
//		}
		
		int[][] arr6= {{1,2},{3,4},{5,6}};
//		System.out.println(arr6[0].length);//获得二位数组中第零个以为数组的长度
//		System.out.println(arr6[0]);
//		System.out.println(arr6.length);//获得二位数组列的长度
		
		for(int i=0;i<arr6.length;i++) {
			for (int j = 0; j < arr6[0].length; j++) {
				System.out.println(arr6[i][j]);
			}
		}
	}
}