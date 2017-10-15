package ALG_20171014;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 时间：2017年10月14日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer15 {

	public static void main(String[] args) {
		
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.nextNode=second;
		second.nextNode=third;
		third.nextNode=forth;
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
	    ListNode tempNode =	outKNode2(head,1);
	    if(tempNode != null)
	    {
	    	System.out.println(tempNode.data);
	    }
	    
	}
	
	/**
	 * 方法一
	 * @param node
	 * @param k
	 * @return
	 */
	public static ListNode outKNode(ListNode  node,int k)
	{
		if(node == null)
		{
			return null;
		}
        if(k<=0) return null;
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode tNode = node;
		while(tNode != null)
		{
			stack.add(tNode);
			tNode = tNode.nextNode;
		}
		
		int tempCount = stack.size();
        if(k>tempCount) return null;
		ListNode lNode = stack.pop();
		for (int i = 1; i <= tempCount; i++) {
			if(i==k)
			{
				return lNode;
			}
			else
			{
				lNode = stack.pop();
			}
		}
		return null;
	}

	
	public static ListNode outKNode2(ListNode  node,int k)
	{
		
		//计算倒数k位，正序是多少，比如倒数2，长度为4的链表，正序为3，长度5的链表正序为4  正序n-k+1,
		//技巧根据倒数位于倒数第一位的的差
		//定义index1和index2
		//int len = k-1;
		if(node == null) return null;
		if(k<=0) return null;
		List<ListNode> tList = new ArrayList<ListNode>();
		int index1 = 0;
	    int index2 = 0;
	    
	    ListNode lNde =node; 
	    while(lNde != null)
	    {
	    	tList.add(lNde);
	    	index1++;
	    	if(index1>=k)
	    	{
	    		index2++;
	    		lNde = lNde.nextNode;
	    	}else
	    	{
	    		lNde = lNde.nextNode;	
	    	}
	    }
	    if(k>tList.size())return null;
	    if(index1 != tList.size()) return null;
	    if(index2 > tList.size()) return null; 
		return tList.get(index2-1);
	}
	
}



class  ListNode
{
	public int data;
	
	public ListNode nextNode;
	
	public ListNode() {
		super();
	}

	public ListNode(int data)
	{
		super();
		this.data = data;
	}
}
