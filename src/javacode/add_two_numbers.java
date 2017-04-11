//some extreme situations like: [1], [99]; Remember the location of carry;
package javacode;
class LinkNode {
	int value; 
	LinkNode next;
	void LinkNode(int var){
		this.value=var;
	}	
}


public class add_two_numbers {
	static LinkNode addTwoNumbers(LinkNode LinkNode1, LinkNode LinkNode2){
		int num = (LinkNode1.value+10*LinkNode1.next.value+100*LinkNode1.next.next.value)+(LinkNode2.value+10*LinkNode2.next.value+100*LinkNode2.next.next.value);
		LinkNode result = new LinkNode();
		LinkNode result1 = new LinkNode();
		LinkNode result2 = new LinkNode();
		result.next=result1;
		result1.next=result2;
		System.out.printf(" num is: %d",num);
		result2.value= num/100;
		result1.value=(num/10)-(10*result2.value);
		result.value=num%10; // %10 enough
		return result;
	}
	
	static LinkNode add_two_numbers_opt(LinkNode l1,LinkNode l2){
		int carry=0;
		LinkNode dummy = new LinkNode();
		dummy.LinkNode(-1);
		LinkNode result = dummy;
		for(;l1!=null || l2!=null;l1=l1!=null?l1.next:null,l2=l2!=null?l2.next:null,result=result.next){	
			int a=l1!=null?l1.value:0;
			int b=l2!=null?l2.value:0;
			result.next=new LinkNode();
			result.next.value=(a+b+carry)%10;//
			carry=(a+b+carry)/10;//			
		}
		System.out.printf("%d\n",carry);
		if(carry>0){//remember, >0
			
			result.next=new LinkNode();
			result.next.value=carry;
		}
		return dummy.next;
	}
	
	public static void main(String[] args){
		//String number = System.console().readLine();
		//String number2 = System.console().readLine();
		
		LinkNode Node1 = new LinkNode();
		LinkNode Node2 = new LinkNode();
		LinkNode Node3 = new LinkNode();
		//Node1.next=Node2;
		//Node2.next=Node3;
		Node1.LinkNode(1);
		//Node2.LinkNode(4);
		//Node3.LinkNode(3);
		
		LinkNode Node20 = new LinkNode();
		LinkNode Node21 = new LinkNode();
		//LinkNode Node22 = new LinkNode();
		Node20.next=Node21;
		//Node21.next=Node22;
		Node20.LinkNode(9);
		Node21.LinkNode(9);
		//Node22.LinkNode(7);
		
		//LinkNode result = addTwoNumbers(Node1, Node20);
		System.out.printf("The result is: ");
		LinkNode result = add_two_numbers_opt(Node1, Node20);
		for(;result!=null;result=result.next){
			System.out.printf("%d->",result.value);
		}
		//System.out.printf("what happened %d -> %d -> %d", result.value, result.next.value, result.next.next.value);
	}
}




