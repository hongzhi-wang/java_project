package ALG_20171003;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 时间：2017年10月4日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer12 {
	
	public static void main(String[] args) {
		
		double temp = Power(2,10);
		System.out.println("=="+temp);
	}
	
	/**
	 * 方法一：递归
	 * @param base
	 * @param n
	 * @return
	 */
	public static double Power(double base,int expontent)
	{
		int n = Math.abs(expontent);
		double result = 0.0;
		if(n==0)
		{
			return 1.0;
		}
		if(n==1)
		{
			return base;
		}
		result = Power(base,n>>1);
		result *=result;
		//判断奇数，偶数
		if((n&1) ==1)
		{
			result*=base;
		}
		if(expontent < 0)
		{
			result = 1/result;
		}
		return result;
	}
	
	/**
	 * 方法二：非递归
	 * @param base
	 * @param n
	 * @return
	 */
	public static double Power2(double base,int n)
	{
		double result = 1.0;
		
		for (int i = 0; i < Math.abs(n); i++) {
			result*=base;
		}
		if(n>=0)
		{
			return result;
		}else
		{
			return 1/result;
		}
	}

}
