package ALG_20171014;


/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 
 * 1-3-5-7
 * 2-4-6-8
 * 时间：2017年10月14日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Offer16 {
	
	public static void main(String[] args) {
		
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.nextNode=second;
		second.nextNode=third;
		third.nextNode=forth;
		head.data=1;
		second.data=3;
		third.data=5;
		forth.data=7;
		
		ListNode head2=new ListNode();
		ListNode second2=new ListNode();
		ListNode third2=new ListNode();
		ListNode forth2=new ListNode();
		head2.nextNode=second2;
		second2.nextNode=third2;
		third2.nextNode=forth2;
		head2.data=2;
		second2.data=4;
		third2.data=6;
		forth2.data=8;
		
	   ListNode tempNode =	inputListNode(head,head2);
	   ListNode temp = tempNode;
	   while(temp != null)
	   {
		   System.out.println(temp.data);
		   temp = tempNode.nextNode;
	   }
		
	}
	
	public static ListNode test()
	{
		return null;
	}
	
	
	public static ListNode inputListNode(ListNode node1,ListNode node2)
	{
		if(node1 == null && node2 == null)
		{
			return null;
		}
		
		ListNode temp = null;
		
		if(node1 == null)
		{
			temp = new ListNode();
			temp.data = node2.data;
			return temp;
		}
		
		if(node2 == null)
		{
			temp = new ListNode();
			temp.data = node1.data;
			return temp;
		}
		
		if(node1.data < node2.data)
		{
			temp = new ListNode();
			temp.data = node1.data;
			node1 = node1.nextNode;
			temp.nextNode = inputListNode(node1,node2);
		}
		else
		{
			temp = new ListNode();
			temp.data = node2.data;
			node2 = node2.nextNode;
			temp.nextNode = inputListNode(node1,node2);
		}
		return temp;
	}

}
