import java.util.NoSuchElementException; 	 
/**
   A linked list is a sequence of nodes with efficient
   element insertion and removal. This class
   contains a subset of the methods of the standard  	
   java.util.LinkedList class. 	
*/
public class LinkedList  	
{
		private Node first;
		public int size = 0;
  
/**
     Constructs an empty linked list.	
*/
   public LinkedList()	
   {
      first = null;	
   }
  
   /**
     Returns the first element in the linked list. 
     @return the first element in the linked list	
   */
   public Object getFirst()	
   {  	
      if (first == null) { throw new NoSuchElementException(); }
      return first.data;	
   }
   /**
      Removes the first element in the linked list.
     @return the removed element	
   */
   public Object removeFirst()	
   {
      size--;
	   if (first == null) { throw new NoSuchElementException(); }
      Object element = first.data;
      first = first.next;
      return element;
   }
   /**
      Adds an element to the front of the linked list.
      @param element the element to add	
   */
   public void addFirst(Object element)	
   {
      Node newNode = new Node();
      newNode.data = element;
      newNode.next = first;
      first = newNode;	
      size++;
   }
   class Node  	
   {
	   public Object data;
	   public Node next;  		
   }
   public boolean contains(LinkedList staff, String name)
   {
	   int num = 0;
	   while(size > num)
	   {
		   Object compare;
		   compare = staff.removeFirst();
		   if(compare.equals(name))
		   {
			   return true;
		   }
		  num++;
	   }
	   return false;
   }
   void reverse(LinkedList first) 
   {
	 LinkedList rev = new LinkedList();
	 int count = first.size;
	 Object hold;
	 for(int i = 0; i < count;i++)
	 {
		 hold = first.removeFirst();
		 System.out.println(hold);
	 }
   } 
   void size(LinkedList staff)
   {
	   System.out.print("Size of list: " + staff.size + " elements");
   }
   }
