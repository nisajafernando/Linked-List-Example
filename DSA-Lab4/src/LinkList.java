
public class LinkList {

	private Link first;
	
	public LinkList() //constructor 
	{
		first=null;
	}
	public boolean  isEmpty() //true if the list is empty
	{
		return (first == null);
	}
	
	
	public void insertFirst(String name,double avg) 
	{
		//create the link-step 1
		Link newLink= new Link(name,avg);
		
		//step 2-link the newLink with the existing link list
	    newLink.next = first;
	    
	    //step 3- make the newLink as the first link in the link list
	    first = newLink;
	}
	public Link deleteFirst() {
		//save the reference of the current first to the temp
		Link temp = first;
		
		//change the first reference to the next available link
		 first = first.next;
		
		//return the old(previous) first reference
		return temp;
		
	}
	
	public void displayList() {
		System.out.println("List from first link to the last link");
		Link current = first;//start from first link of the link list
		
		while(current != null) {
			current.displayDetails();//display the details
			current = current.next;//move the current to the next link
			
		}
		
		
	}
	public Link deleteLink(String name) {
		Link current = first;
		Link previous= first;
		//checking the name until we find it by gpoing throgh all links one by one
		while(current.Name!= name)//checking the name until we find it
		{
			if(current.next == null)
				return null;//name is not in the list
			else {
				previous = current;
				current = current.next;
			}
			
		}//go out of this while loop when the name is found
		if(current == first)//checking if it is the first link
	first= first.next;
		else
			previous.next= current.next;
		    return current;
	}
	
}
