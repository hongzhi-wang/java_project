package ALG_20171004;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * 时间：2017年10月10日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer16 {
	
	public static void main(String[] args) {
		
	}
	
	public static ListNode MergerListNode(ListNode node1,ListNode node2)
	{
		if(node1 == null)
		{
			return null;
		}
		else if(node2 == null)
		{
			return null;
		}
		
		ListNode MargerNode = null;
		if(node1.data < node2.data)
		{
			MargerNode = node1;
		}
		else
		{
			
		}
		return null;
				
	}

}
