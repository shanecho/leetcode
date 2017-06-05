//为什么中点没有next那么致命，直接栈溢出了
package javacode;

public class sort_lists {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	
	public static ListNode sortList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode middle = findMiddle(head);
		ListNode head2 = middle.next;
		middle.next = null;
		ListNode firstHalf = sortList(head);
		ListNode secondHalf = sortList(head2);
		
		return mergeTwoLists(firstHalf, secondHalf);
	}
	
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode dummy = new ListNode(-1);
		
		for (ListNode p = dummy; l1 != null || l2 != null;p = p.next){
			int val1 = l1 == null? Integer.MAX_VALUE:l1.val;
			int val2 = l2 == null? Integer.MAX_VALUE:l2.val;
			
			if(val1 <= val2){
				p.next = l1;
				l1 = l1.next;
			}else{
				p.next = l2;
				l2 = l2.next;
			}
			
		}	

		return dummy.next;
	}
	
	private static ListNode findMiddle(ListNode head){
		if(head == null) return head;
		ListNode slow = head;
		ListNode fast = head.next;//dont forget next
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args){
		ListNode l1=new ListNode(34);
		ListNode l2=new ListNode(8);
		ListNode l3=new ListNode(64);
		ListNode l4=new ListNode(51);
		ListNode l5=new ListNode(32);
		ListNode l6=new ListNode(21);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		
		ListNode l=sortList(l1);
		
		for(;l!=null;l=l.next){
			System.out.print(l.val);
			System.out.printf(", ");
		}
		
		System.out.println("success");
	}
}
