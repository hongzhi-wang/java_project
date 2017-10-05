package ALG_20170930;

/**
 * 
 * 时间：2017年9月28日
 * 作者： 汪宏志
 * 描述：
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 * 
 */
public class Offer2 {

	public static void main(String[] args) {
		//5,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
		//7,[[1,2,8,9],[4,7,10,13]]
		int[][] temp = new int[4][4];
		temp[0][0]=1;
		temp[0][1]=2;
		temp[0][2]=8;
		temp[0][3]=9;
		
		temp[1][0]=4;
		temp[1][1]=7;
		temp[1][2]=10;
		temp[1][3]=13;
		
		/*temp[2][0]=4;
		temp[2][1]=7;
		temp[2][2]=10;
		temp[2][3]=13;
		
		temp[3][0]=6;
		temp[3][1]=8;
		temp[3][2]=11;
		temp[3][3]=15;*/
		
		System.out.println(find(temp,10));
	}
	
	/**
	 * 方法二 从右上角开始查询 利用增加特性
	 * @param arr
	 * @param num
	 * @return
	 */
	public static boolean find(int[][] arr,int num)
	{
		if(arr == null || arr.length == 0)
		{
			return false;
		}
		//从第一行右上角开始查
		int row = 0;//行
		int column = arr[0].length-1;//列
		
	   	while(row <=arr.length-1 && column>= 0)
	   	{
	   		if(arr[row][column] == num)
	   		{
	   			return true;
	   		}else if(arr[row][column] > num)
	   		{
	   			column--;
	   		}else if(arr[row][column] < num)
	   		{
	   			row++;
	   		}
	   	}
		return false;
		
	}
	

	
	/**
	 * 方法二 使用二分法 每行查找
	 * 1 2  3 4
	 * 5 6  7  8
	 * 9 10 11 12
	 * @param arr
	 * @param num
	 * @return
	 */
	public static boolean find2(int[][] arr,int num)
	{
		if(arr == null || arr.length == 0)
		{
			return false;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int left  = 0;
			int right = arr[i].length-1;
					
			while(left<=right)
			{
				int m = (right + left)/2;
				if (arr[i][m] > num) {
					right = m -1;
				}else if(arr[i][m] < num)
				{
					left = m +1;
				}else
				{
					return true;
				}
			}
		}
		return false;
	}
	
	
	

}
