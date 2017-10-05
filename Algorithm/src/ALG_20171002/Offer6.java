package ALG_20171002;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 *
 */

public class Offer6 {

	public static void main(String[] args) {

	}

	//方法一：遍历所有数字
	
	
	/**
	 * 方法二：遍历 优化
	 * @param arr
	 * @return
	 */
	public static int getMinNum2(int[] arr)
	{
		if(arr == null || arr.length ==0)
		{
			return 0;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[i+1])
			{
				return arr[i+1];
			}
		}
		return 0;
	}
	
	/**
	 * 方法三： 二分法 提交快100多毫秒
	 * @param arr
	 * @return
	 */
	public static int getMinNum3(int[] arr)
	{
		if(arr== null || arr.length == 0)
		{
			return 0;
		}
		int left = 0;
		int right = arr.length -1;
		int middle = -1;
		while(arr[left] >= arr[right])
		{
			if(right - left == 1)
			{
				middle = right;
				break;
			}
			middle = left+(right - left)/2;
			if(arr[middle] >= arr[left])
			{
				left=middle;
			}else
			{
				right = middle;
			}
		}
		return arr[middle];
	}
	
	
	
}
