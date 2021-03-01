
public class Link {
	
public String Name;
public double average;
public Link next;

public Link(String name, double avg) {
	Name=name;
	average=avg;
	next=null;
}
    
public void displayDetails() {
	System.out.println(Name+"   "+average);
	
}


}
