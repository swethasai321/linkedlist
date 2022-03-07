package linkedlist;

public class linkedlist5 {
	
	public INode head;
	public INode tail;

	public linkedlist5() {
		this.head=null;
		this.tail=null;
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	public INode popLast() {
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode.setNext(null);
		return tempNode;
	}
	public boolean search(INode node) {
		INode tempNode = head;
		boolean found = false;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey() == node.getKey()) {
				found = true;
			}
			tempNode = tempNode.getNext();
		}
		return found;
	}
	 public void deleteFromStart() {  
		  
	        //Checks if the list is empty  
	        if(this.head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        else {  
	            //Checks whether the list contains only one node  
	            //If not, the head will point to next node in the list and tail will point to the new head.  
	            if(this.head != this.tail) { 
	        		INode tempNode = head;
	            
	            	this.head = tempNode.getNext();  
	            }  
	            //If the list contains only one node  
	            //then, it will remove it and both head and tail will point to null  
	            else {  
	            	this.head = this.tail = null;  
	            }  
	        }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
