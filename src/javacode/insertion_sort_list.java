package javacode;


public class insertion_sort_list {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public static ListNode insertionSortList(ListNode head){
		ListNode dump = new ListNode(Integer.MIN_VALUE);
//		dump.next = head;
		int index = 1;
		for(ListNode cur = head; cur!=null;){
			
			System.out.printf("Iter: %d ", index++);
			ListNode pos = findPos(dump, cur.val);			
			ListNode tmp = cur.next;
			cur.next = pos.next;
			pos.next = cur;
			
			cur = tmp;
			printFunc(dump);
		}
		
		return dump.next;		
	}
	
	public static ListNode findPos(ListNode head, int val){
		ListNode pre = null;
		for(ListNode cur = head; cur != null && cur.val <= val; pre = cur, cur = cur.next){System.out.printf("x:%d ",val);System.out.printf("cur_val:%d",cur.val);System.out.print("\t");};		
		return pre;
	}
	
	public static void printFunc(ListNode l){
		for(;l!=null;l=l.next){
			System.out.print(l.val);
			System.out.printf(" ");
		}
		System.out.printf("\n");
	}
	public static void main(String[] args){
		
		ListNode l1=new ListNode(2);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		ListNode l6=new ListNode(6);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		
		ListNode l= insertionSortList(l1);
		printFunc(l);
		
		System.out.println("\nSuccess");
	}
}
