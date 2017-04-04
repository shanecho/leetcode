package javacode;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val=x;}
}

public class mergeTwoSortedLists {
	static ListNode MergeList(ListNode l1, ListNode l2){
		if (l1==null) return l2;
		if (l2==null) return l1;
		
		ListNode dump=new ListNode(-1);
		ListNode p=dump;
		for(;l1!=null && l2!=null;p=p.next){
			if (l1.val<l2.val){
				p.next=l1; l1=l1.next;
				//System.out.printf("pnext1: %d",p.next.val);	
			}
			else{
				p.next=l2; l2=l2.next;
				//System.out.printf("pnext2: %d",p.next.val);	
			}
		}
		p.next=(l1!=null?l1:l2);
		
		return dump.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode Node1 = new ListNode(2);
		ListNode Node2 = new ListNode(3);
		ListNode Node3 = new ListNode(4);
		Node1.next=Node2;
		Node2.next=Node3;

		ListNode Node20 = new ListNode(4);
		ListNode Node21 = new ListNode(5);
		ListNode Node22 = new ListNode(6);
		Node20.next=Node21;
		Node21.next=Node22;

		ListNode result = MergeList(Node1,Node20);
		for(;result!=null; result=result.next){
			System.out.printf("%d",result.val);	
		}		


	}

}
