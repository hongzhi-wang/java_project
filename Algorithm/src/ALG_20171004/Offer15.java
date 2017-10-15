package ALG_20171004;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * 时间：2017年10月8日
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
	    ListNode  temp =	revLinkNode(head);
	    ListNode t = temp;
	    while(t != null)
	    {
	    	System.out.println(t.data);
	    	t = t.nextNode;
	    }
	}
	
	/**
	 * 反转链表基础写法
	 * 基本思路是：将当前节点cur的下一个节点 cur.getNext()缓存到temp后，
	 * 然后更改当前节点指针指向上一结点pre。也就是说在反转当前结点指针指向前，
	 * 先把当前结点的指针域用tmp临时保存，以便下一次使用，其过程可表示如下
	 * @param head
	 * @return
	 */
	/** 
     * 遍历，将当前节点的下一个节点缓存后更改当前节点指针 
     */  
    public static ListNode reverse2(ListNode head) {
    	ListNode  revNode = null;
    	ListNode preNode = null;
    	ListNode curNode = head;
    	
    	while(curNode != null)
    	{
    		ListNode tempNode = curNode.nextNode;
    		if(tempNode != null)
    		{
    			revNode = curNode;
    		}
    		
    		curNode.nextNode = preNode;
    		preNode = curNode;
    		
    		curNode = tempNode;
    	}
       return revNode;
    }  
    
    
    public static ListNode revLinkNode(ListNode head)
    {
    	 if(head==null||head.nextNode ==null)
             return head;
         ListNode prev = revLinkNode(head.nextNode);
         head.nextNode.nextNode = head;
         head.nextNode = null;
         return prev;
    	
    }
    
	
	
	

}
