package SinglyLinkedList;

public class SinglyLinkedList {
//Represent a node of the singly linked list
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	//Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	//delete mid
	public int size;
//addNode() will add a new node to the list
	public void addNode(int data) {
		//Create a new node
		Node newNode = new Node(data);
		
		//Checks if the lists is emmpty
		if(head == null) {
			//If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		}
		else {
			//newNode will be added after tail such that tail's next will point to newNod
			tail.next = newNode;
			//newNode will become new tail of the list 
			tail = newNode;
		}
	//	size++; // for delete middle
	}
/* to count the number of the nodes present in the linked list
 */
	//countNodes() will count the nodes present in the list
	public int countNodes() {
		int count = 0;
		//Node current will point to head
		Node current = head;
		while(current != null) {
			//Increment the count by 1 for each node
			count++;
			current= current.next;
		}
		return count;
	}
	
	//reverse() will help the reverse the order of the list
	public void reverse(Node current) {
		//Checks if list is empty
		if(head== null) {
			System.out.println("List is empty");
			return;
		}
		else {
			//Checks if the next node is null, if yes then prints it.
			if(current.next==null) {
				System.out.print(current.data + " ");
				return;
			}
			//Recursively calls the reverse function
			reverse(current.next);
			System.out.print(current.data + " ");
		}
	}
/*	public void deleteFromStart() {
		//Checks if the list is empty
		if(head== null) {
			System.out.println("List is empty");
			return;
		}
		else {
			//Checks whether the list contains only one node
			//If not, the head will point to next node in the list and tail will point to the new head.
			if(head != tail) {
				head = head.next;
			}
			//if the list contains only one node
			//then, it will remove it and both head and tail will pooint to null
			else {
				head = tail = null;
			}
		}
	}*/
	
/*	public void deleteFromMid() {
		Node temp, current;
		//Checks if the list is empty
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		else {
			//Store the mid position of the iist
			int count = (size% 2 == 0)? (size/2) : ((size+1)/2);
			//Checks whether the head is equal to the tail or not. if yes then the list has only one node
			if(head != tail) {
				//Initially, temp will point to head
				temp = head;
				current = null;
				//Current will point to node previous to temp
				//If temp is pointing to node 2 then current will point to node 1.
				for(int i= 0; i<count-1; i++) {
					current = temp;
					temp = temp.next;
				}
				if(current != null) {
					//temp is the middle that needs to be removed
					//So, current node will point to node next to temp by skipping temp.
					current.next = temp.next;
					//Delete temp
					temp = null;
				}
				else {
					head = tail = temp.next;
					//Delete temp
					temp = null;
				}
			}
			//If the list contains only one element
			//then it will remove it and both head and tail will point to NULL
			else {
				head = tail = null;
			}
		}
		size--; 
		} */
	
/*	//deleteFromEnd() will delete a node from end of the list
	public void deleteFromEnd() {
		//Checks if the list is empty
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		else {
			//Checks whether the list contains only one element
			if(head!= tail) {
				Node current = head;
				//Loop through the list till the second last element such that current.next is pointing to tail
				while(current.next!=tail) {
					current = current.next;
				}
				//Second last element will become new tail of the list
				tail = current;
				tail.next = null;
			}
			//If the list contains only one element
			//Then it will remove it and both head and tail will point to null
			else {
				head = tail = null;
			}
		}
	} */
	
	public void removeDuplicate() {
		//Node current will point to head
		Node current = head, index = null, temp = null;
		if(head == null) {
			return;
		} else {
			while(current !=null) {
				//Node temp will point to previous node to index.
				temp = current;
				//Index will point to node next to current
				index = current.next;
				
				while(index!= null) {
					//If current node's data is equal to index node's data
					if(current.data == index.data) {
						//Here, index node is pointing to the node which is duplicate of current node
						//Skips the duplicate node by pointing to next node
						temp.next = index.next;
					} else {
						//Temp will point to previous node of index.
						temp = index;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}
	
	//searchNode() will search for a given node in the list
	public void searchNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		//checks whether list is empty
		if(head == null) {
			System.out.println("List is empty");
		} else {
			while(current != null) {
				//Compares node to be found with each node present in the list
				if(current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if(flag)
			System.out.println("Element is present in the list at the position: " + i);
		else
			System.out.println("Element is not present in the list");
	}
	
	//display() will display all the nodes present in the list
	public void display() {
		//Node current will point to head
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while(current!=null) {
			//Prints each node by incrementing pointer
			System.out.print(current.data+ " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[]args) {
		SinglyLinkedList sList = new SinglyLinkedList();
		//Add nodes to the list
		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(4);
		sList.addNode(1);
		sList.addNode(10);
		sList.addNode(9);

		
		//Displays the nodes present in the list
		sList.display();
		//Counts the nodes present in the given list
		System.out.println("Count of nodes present in the list: "+sList.countNodes());
		
		System.out.println("Reversed List: ");
		//Print reversed list
		sList.reverse(sList.head);
		
	//delete from the start
		/* 	while(sList.head != null) {
			sList.deleteFromStart();
			//Printing updated list
			System.out.println("Updated list: ");
			sList.display();
		}*/
		
	/*//delete from the middle
		while(sList.head != null) {
			sList.deleteFromMid();
			//Printing updated list
			System.out.println();
			System.out.println("Updated List: ");
			sList.display();
		}*/
		/*while(sList.head != null) {
			sList.deleteFromEnd();
			//Printing updated list
			System.out.println("Updated List: ");
			sList.display(); }*/
			
	        //Removes duplicate nodes  
	        sList.removeDuplicate();  
	  
	        System.out.println("List after removing duplicates: ");  
	        sList.display();  
	        System.out.println();
	        sList.searchNode(10);
	        sList.searchNode(9);
		}
	}


	
