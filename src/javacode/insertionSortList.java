package javacode;

public class insertionSortList {
	
	 public static class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
		 }
	 public static ListNode insertion(ListNode head){
		 ListNode dummy=new ListNode(Integer.MIN_VALUE);
		 dummy.next=head;
		 for(ListNode cur=head; cur!=null;){
			 ListNode pos=getPosition(cur,cur.val);
			 //System.out.print(pos.val);
			 ListNode temp=cur.next;
			 cur.next=pos.next;
			 pos.next=cur;
			 cur=cur.next;
			 cur=temp;			 
		 }
		 
		 
		 return dummy.next;
	 }
	 
	 public static ListNode getPosition(ListNode head, int x){
		 ListNode pre=null;
		 for(ListNode cur=head;cur!=null && cur.val<=x;pre=cur,cur=cur.next){
			 //System.out.print(pre.val);
			 
		 }
		 System.out.print(pre.val);
		 System.out.println(">>>>>>>");
		 return pre;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		ListNode l=insertion(l1);
		System.out.println("success\n");
		for(;l!=null;l=l.next){
			System.out.print(l.val);
		}
		
		
		
		

	}

}
