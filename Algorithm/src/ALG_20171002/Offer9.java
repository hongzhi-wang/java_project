package ALG_20171002;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 *根据上一题的公式可以推导出
 *f(1) = 1;
 *f(2) =2;
 *f(n) = 2*f(n-1);
 */
public class Offer9 {

	public static void main(String[] args) {

	}
	
	/**
	 * 递归
	 * @param target
	 */
	public static int JumpFloor(int target)
	{
		if(target <=0) return 0;
		if(target == 1)
		{
			return 1;
		}else if(target == 2)
		{
			return 2;
		}else
		{
			return  2*JumpFloor(target-1);
		}
	}
	
	/**
	 * 非递归
	 * @param target
	 * @return
	 */
	public static int JumpFloor2(int target)
	{
		if(target == 1)
		{
			return 1;
		}else if(target == 2)
		{
			return 2;
		}
		
		int f2 = 2;
		int fn =0;
		for (int i = 3; i <= target; i++) {
			fn = 2*f2;
			f2 = fn;
		}
		return fn;
	}
	

}
