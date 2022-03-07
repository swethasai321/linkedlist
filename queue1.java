package linkedlist;

class Node
{
 int data;       // integer data
 Node next;      // pointer to the next node

 public Node(int data)
 {
     // set data in the allocated node and return it
     this.data = data;
     this.next = null;
 }
}

class Queue
{
 private static Node rear = null, front = null;
 private static int count = 0;


 // Utility function to add an item to the queue
 public static void enqueue(int item)     // insertion at the end
 {
     // allocate a new node in a heap
     Node node = new Node(item);
     System.out.printf("Inserting %d\n", item);

     // special case: queue was empty
     if (front == null)
     {
         // initialize both front and rear
         front = node;
         rear = node;
     }
     else {
         // update rear
         rear.next = node;
         rear = node;
     }

     // increase the node's count by 1
     count += 1;
 }

 // Utility function to check if the queue is empty or not
 public static boolean isEmpty() {
     return rear == null && front == null;
 }

 // Function to return the size of the queue
 private static int size() {
     return count;
 }
}

public class queue1{
 public static void main(String[] args)
 {
     Queue q = new Queue();
     q.enqueue(56);
     q.enqueue(30);
     q.enqueue(70);
        
 }
}
