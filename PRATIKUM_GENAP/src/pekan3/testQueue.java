package pekan3;

public class testQueue {
	public static void main(String [] args) {
		inputQueue queue= new inputQueue(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		System.out.println(" Front Item is  " + queue.front() );
		System.out.println(" Rear Item is  " + queue.rear() );
		System.out.println(queue.dequeue()+" dequeue from queue" );
		System.out.println(" Front Item is  " + queue.front() );
		System.out.println(" Rear Item is  " + queue.rear() );

	}

}
