package ALG_20171002;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 *f(0) = 0;
 *f(1) =1;
 *f(2) = f(n-1) + f(n-2) n>1
 */
public class Offer7 {

	public static void main(String[] args) {

	}
	
	/**
	 * 非递归
	 * @param n
	 * @return
	 */
	public static int FibonacciSequence(int n)
	{
		if(n<=0) return 0;
		
		if(n == 1) return 1;
		
		int fn=0;
		int f0 =0;
		int f1 = 1;
		
		for (int i = 2; i <= n; i++) {
			fn = f0+f1;
			f0=f1;
			f1= fn;
		}
		return fn;
	}
	
	/**
	 * 递归
	 * @param n
	 * @return
	 */
	public static int FibonacciSequence2(int n)
	{
		if(n<=0) return 0;
		
		if(n == 1) return 1;
		
		
		return FibonacciSequence2(n-1) + FibonacciSequence2(n-2);
	}
	
	

}
