package ch02_linkedlists;

public class RemoveDups
{
	static Node head;

	public void noDup()
	{
		Node current = head;
		Node next_next;
		if(head ==null)
		{
			return;
		}
		while(current.next != null)
		{
			if(current.data == current.next.data)
			{
				next_next =current.next.next;
				current.next = null;
				current.next = next_next;
			}
			else
			{
				current = current.next;
			}
		}
		
	}
	
	public void noDuplicatUnsorted()
	{
		Node current_1 = head;
		Node current_2;
		if(head == null)
		{
			return;
		}
		
		while(current_1!=null && current_1.next !=null)
		{
			current_2 = current_1;
			while(current_2.next != null)
			{
				if(current_1.data == current_2.next.data)
				{
					current_2.next = current_2.next.next;
					
				}
				else
				{
					current_2 = current_2.next;
				}
			}
			current_1 = current_1.next;
		}
	}
	// Utility Functions
		public void push(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
		
		void printList() 
	     { 
	         Node temp = head; 
	         while (temp != null) 
	         { 
	            System.out.print(temp.data+" "); 
	            temp = temp.next; 
	         }   
	         System.out.println(); 
	     } 
		
		public static void main(String args[])
		{
			RemoveDups ll = new RemoveDups();
			ll.push(10);
			ll.push(60);
			ll.push(30);
			ll.push(20);
			ll.push(30);
			ll.push(50);
			ll.push(30);
			ll.push(40);
			ll.push(20);
			ll.push(50);
			//ll.noDup();
			ll.printList();
			ll.noDuplicatUnsorted();
			ll.printList();
		}
}

