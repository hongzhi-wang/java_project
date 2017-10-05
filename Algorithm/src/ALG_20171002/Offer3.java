package ALG_20171002;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer3 {

	public static void main(String[] args) {
		//67,0,24,58
		ListNode node1=new ListNode(67);
		ListNode node2=new ListNode(0);
		ListNode node3=new ListNode(24);
		ListNode node4=new ListNode(58);
		node1.next=node2;
		node2.next=node3;
		node3.next = node4;
		print(node1);
		/*ArrayList<Integer> arrList=	print2(node1);
		pintList(arrList);*/
	}
	
	public static void pintList(ArrayList<Integer> list)
	{
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	private static	Stack<Integer> stack = new Stack<Integer>();
	
	/**
	 * 方法一
	 * @param head
	 */
	public static void print(ListNode head)
	{
		if(head == null)
		{
			return;
		}
		
		ListNode nd = head;
		while(nd != null)
		{
			stack.add(nd.val);
			nd = nd.next;
		}
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
			

		
	}
	
	private static ArrayList<Integer> arrList = new ArrayList<Integer>();
	/**
	 * 方法二
	 * @param head
	 * @return
	 */
	public static ArrayList<Integer> print2(ListNode head)
	{
		if(head != null)
		{
			print2(head.next);
			arrList.add(head.val);
		}
		return arrList;
	}
	
	
	

}


class ListNode
{
	public int val;
	
	public ListNode next;
	
	public ListNode(int data)
	{
		this.val = data;
	}

}
