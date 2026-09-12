class Solution{
	public void convertSinglyToCircular(Node head){
		if(head==null){
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = head;
	}
}


