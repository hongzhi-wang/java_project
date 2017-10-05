package ALG_20171002;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 * f(1) = 1;
 * f(2) = 2;
 * f(3) = f(2) + f(1)
 */
public class Offer8 {

	public static void main(String[] args) {
		int temp =  JumpFloor2(4);
		System.out.println(temp);
	}
	
	/**
	 * 递归 当深度比较大 递归不合适 如果把递归的树结构画出  会发现很多重复节点
	 * @param target
	 * @return
	 */
	public static int JumpFloor(int  target)
	{
		if(target <=0) return -1;
		if(target == 1)
		{
			return  1;
		}
		else if(target == 2)
		{
			return  2;
		}
		else
		{
			return JumpFloor(target-1) +JumpFloor(target-2);
		}
	}
	
	/**
	 * 方法二 非递归
	 * @param target
	 */
	public static int JumpFloor2(int target)
	{
		if(target == 1 || target == 2)
		{
			return target;
		}
		
		int  sun =  0;
		int target1 = 1;
		int target2 = 2;
		
		for (int i = 3; i <= target; i++) {
			sun = target1 +target2;
			target1 = target2;
			target2 = sun;
		}
		return sun;
	}
	

}
