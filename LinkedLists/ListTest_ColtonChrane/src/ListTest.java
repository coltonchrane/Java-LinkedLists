/**
     A program that demonstrates the LinkedList class
  */
  public class ListTest
  {  
     public static void main(String[] args)
     {  
        LinkedList staff = new LinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Diana");
        staff.addFirst("BoofDaddy");
        staff.addFirst("swag");
        staff.addFirst("cook");    
    
        System.out.println(staff.contains(staff,"BoofDaddy"));
     }
   }