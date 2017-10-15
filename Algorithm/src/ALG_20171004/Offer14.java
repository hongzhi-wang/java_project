package ALG_20171004;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 时间：2017年10月8日
 * 作者： 汪宏志
 * 描述：
 * 由推断可知：倒数第k个节点 就是正序第n-k+1个节点
 */
public class Offer14 {

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
	    ListNode lNode =	getNode2(head,2);
	    System.out.println(lNode.data);
		
	}
	
	/**
	 * 方法一
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode getNode(ListNode head,int k)
	{
		if(head == null || k<0)
		{
			return null;
		}
		
		int count = 1;
		ListNode cur = head.nextNode;
		while(cur  != null)
		{
			count++;
			cur = cur.nextNode;
		}
		System.out.println("count = "+ count);
		if(count - k >=0)
		{
			
			int tempk = count-k+1;
			System.out.println("tempk="+tempk);
			int index = 1;
			ListNode tcur = head;
			while(tcur  != null)
			{
				if(tempk == index)
				{
					return tcur;
				}
				index++;
				tcur = tcur.nextNode;
			}
		}

		return null;
	}
	
	/**
	 * 方法二
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode getNode2(ListNode head,int k)
	{
		if(head == null || k<0)
		{
			return null;
		}
		
		ListNode p,q;
		p=q=head;
		int count = 0;
		while(p!= null)
		{
			if(count>=k)
			{
				q=q.nextNode;
			}
			count++;
			p = p.nextNode;
		}
		
		return count<k?null:q;
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