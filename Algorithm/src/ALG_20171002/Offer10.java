package ALG_20171002;
/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 *2*1 1种
 *2*2 4种
 */
public class Offer10 {
	public static void main(String[] args) {
		
	}
	
	public static int sun(int n)
	{
		if(n<=0) return 0;
		if(n ==  1) return 1;
		if(n ==  2) return 2;
		int sum =0;
		int sum2  = 2;
		int sum1  = 1;
		for (int i = 3; i <= n; i++) {
			sum = sum1+sum2;
			sum1  =sum2;
			sum2 = sum;
		}
		return sum;
	}
	

}
