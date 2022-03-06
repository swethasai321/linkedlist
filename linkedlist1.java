package linkedlist;
import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;



public class linkedlist1 {
   public static void main(String[] args) {

       Employee janeJones = new Employee("Jane", "Jones", 123);
       Employee johnDoe = new Employee("John", "Doe", 4567);
       Employee marySmith = new Employee("Mary", "Smith", 22);
       Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
       Employee billEnd = new Employee("Bill", "End", 78);

       LinkedStack stack = new LinkedStack();
       stack.push(janeJones);
       stack.push(johnDoe);
       stack.push(marySmith);
       stack.push(mikeWilson);
       stack.push(billEnd);

       //stack.printStack();

       //System.out.println(stack.peek());
       //stack.printStack();

       System.out.println("Popped: " + stack.pop());
       stack.printStack();
   }

}


class LinkedStack {

   private LinkedList<Employee> stack;

   public LinkedStack() {
       stack = new LinkedList<Employee>();
   }

   public void push(Employee employee) {
       stack.push(employee);
   }

   public Employee pop() {
       return stack.pop();
   }

   public Employee peek() {
       return stack.peek();
   }

   public boolean isEmpty() {
       return stack.isEmpty();
   }

   public void printStack() {
       ListIterator<Employee> iterator = stack.listIterator();
       while (iterator.hasNext()) {
           System.out.println(iterator);
       }
   }
}



class Employee {

   private String firstName;
   private String lastName;
   private int id;

   public Employee(String firstName, String lastName, int id) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.id = id;
   }

   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public int getId() {
       return id;
   }

   public void setId(int id) {
       this.id = id;
   }

   
}



