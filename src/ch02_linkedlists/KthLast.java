package ch02_linkedlists;

public class KthLast {
	static Node head;
	
	public int count()
	{
		int count =0;
		Node current = head;
		while(current.next != null)
		{
			count++;
		}
		return count;
	}
	
	public int Kth(int k, int count)
	{
		Node current = head;
		int element = count -k;
		int checker =0;
		while(current.next != null && checker <=element )
		{	
			if(checker == element)
			{
			return current.data;
			}
			current = current.next;
			checker++;	
		}
		return 0;
	}
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
	public static void main(String[] args) {
		
		KthLast ll = new KthLast();
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
		
		int x = ll.Kth(3, ll.count());
		System.out.println(x);
	}

}
