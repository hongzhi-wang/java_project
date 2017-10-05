package ALG_20171003;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，
 * 偶数和偶数之间的相对位置不变。
 * 时间：2017年10月4日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer13 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		swap(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 方法一
	 * @param arr
	 */
	public static void swap(int[]  arr)
	{
		if(arr== null || arr.length ==0)
		{
			return;
		}
		
		int leftIndex = 0;
		
		int[] tempArr = new int[arr.length]; 
		int k = 0;

		//左边 找偶数
		while(leftIndex<arr.length)
		{
			if((arr[leftIndex] &1) !=0)
			{
				tempArr[k] = arr[leftIndex];
				k++;
			}
			leftIndex++;
		}
			
		
		leftIndex=0;
		while(leftIndex<arr.length)
		{

			if((arr[leftIndex] &1) !=1)
			{
				tempArr[k] = arr[leftIndex];
				k++;
			}
			leftIndex++;
		}
			

		for (int i = 0; i < tempArr.length; i++) {
			arr[i] = tempArr[i];
		}
		
	}
	
}
