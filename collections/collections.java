package collections;

import java.util.*;
public class collections {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		
		System.out.println("ArrayList");
		System.out.println("----------");
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		arrayList.removeLast();
		arrayList.set(0, 10);
		for(Object i:arrayList) {
			System.out.println(i);
		}
		
        ArrayList<Object> mixedList = new ArrayList<>();

        mixedList.add(1);
        mixedList.add("Jothika");
        
        for(Object values:mixedList) {
        	System.out.println(values);
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("LinkedList");
        System.out.println("-----------");
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("LinkedList");
        linkedList.add("Not continously memory allocated");
        linkedList.remove(1);
        
        for(String value:linkedList) {
        	System.out.println(value);
        }
	
    System.out.println("-----------------------------------------------------");
    System.out.println("Queue");
    System.out.println("------");
    
    Queue<Integer> queueCollection = new PriorityQueue<>();
    
    queueCollection.add(10);
    queueCollection.add(20);
    queueCollection.add(30);
    queueCollection.add(40);
    queueCollection.add(50);
    
    System.out.println("Removed Element:"+ queueCollection.remove());
    
    System.out.println("First Element:" + queueCollection.poll());
	
	
    System.out.println("PriorityQueue");
    System.out.println("--------------");
    
   PriorityQueue<Integer> priorityqueueCollection = new PriorityQueue<>();
    
   priorityqueueCollection.add(50);
   priorityqueueCollection.add(200);
   priorityqueueCollection.add(20);
   priorityqueueCollection.add(40);
   priorityqueueCollection.add(50);
    
    System.out.println("Removed Element:"+ priorityqueueCollection.remove());
    
    System.out.println("First Element:" + priorityqueueCollection.poll());
	}
}
