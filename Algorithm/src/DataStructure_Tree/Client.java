package DataStructure_Tree;

import java.util.Stack;

/**
 * 二叉树基础
 * 时间：2017年10月2日
 * 作者： 汪宏志
 * 描述：
 *
 */
public class Client {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 先序遍历 递归
	 * @param node
	 */
	public static void preOrderRecur(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.println(node.value);
		preOrderRecur(node.left);
		preOrderRecur(node.right);
	}
	
	/**
	 * 先序遍历 非递归
	 * @param node
	 */
	public static void perOrder(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		if(node != null)
		{
			Stack<Node> stack = new Stack<Node>();
			stack.add(node);
			while(!stack.isEmpty())
			{
				System.out.println(stack.pop().value);
				if(node.left != null)
				{
					stack.push(node.left);
				}
				if(node.right != null)
				{
					stack.push(node.right);
				}
			}
		}
	}
	
	/**
	 * 中序遍历 递归
	 * @param node
	 */
	public static void inOrderRecur(Node node)
	{
		if(node == null)
		{
			return;
		}
		inOrderRecur(node.left);
		System.out.println(node.value);
		inOrderRecur(node.right);
	}
	
	/**
	 * 非递归
	 * @param node
	 */
	public static void inOrderUnRecur(Node node)
	{
		if(node != null)
		{
			Stack<Node> stack = new Stack<Node>();
			while(!stack.isEmpty() || node != null)
			{
				if (node != null) {
					stack.push(node);
					node = node.left;
				}else
				{
					node =stack.pop();
					System.out.println(node.value);
					node = node.right;
				}
			}
			
		}
		
	}
	
	
	/**
	 * 后序遍历 递归
	 * @param node
	 */
	public static void afterOrderRecur(Node node)
	{
		if(node == null)
		{
			return;
		}
		afterOrderRecur(node.left);
		afterOrderRecur(node.right);
		System.out.println(node.value);
	}
	
	/**
	 * 后序遍历 非递归
	 * @param node
	 */
	public static void afterOrderUnRecur(Node node)
	{
		if(node != null)
		{
			Stack<Node> s1 = new Stack<Node>();
			Stack<Node> s2 = new Stack<Node>();
			s1.push(node);
			while(!s1.isEmpty())
			{
			   node = s1.pop();
			   s2.push(node);
			   if(node.left != null)
			   {
				   s1.push(node.left);
			   }
			   if(node.right  != null)
			   {
				   s1.push(node.right);
			   }
			}
			while(!s2.isEmpty())
			{
				System.out.println(s2.pop().value);
			}
		}
	}
	
}
