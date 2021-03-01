
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*Link L1 = new Link("Nipuna",53.3);
	Link L2 = new Link("Aravinda",78.0);
	Link L3 = new Link("Prashani",69.5);
	
	L1.next=L2;
	L2.next=L3;

    
    L1.displayDetails();
    L1.next.next.displayDetails();*/
		
    LinkList theList = new LinkList();
    theList.insertFirst("Prashani", 69.5);
    theList.insertFirst("Aravinda", 78.0);
    theList.insertFirst("Nipuna", 53.3);
   
   theList.displayList();
   // theList.deleteFirst();
    //theList.displayList();
   theList.deleteLink("Prashani");
   theList.displayList();
	}

}
