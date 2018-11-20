package ch02_linkedlists;

public class RemoveDups
{
	Node head;
	public static void main(String args[])
	{
		
	}
	public static Node noDup(Node head)
	{
		Node n =head;
		while(n != null)
		{
			
		}
		return head;
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
}

