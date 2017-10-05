package ALG_20171003;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 时间：2017年10月3日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer11 {
	
	public static void main(String[] args) {
		int temp =NumberOf1(10);
		System.out.println("==========="+temp);
	}
	
	public static int NumberOf1(int n) {
 		int count = 0;
		while (n != 0) {
		 ++count;
		n = (n - 1) & n;
		System.out.println(n+"=");
		}
		return count;

    }

}
