public class CQ 
{
    //Decalaration 
   // Arr.lenght of Circular Queue
	int front=-1, rear=-1;
	int Arr[] = new int[5];

	// Check if the queue is full
	boolean isFull() {
		if (front == 0 && rear == Arr.length - 1) {
			return true;
		}
		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	// Check if the queue is empty
	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	// Adding an element
	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1)
				front = 0;
			rear = (rear + 1) % Arr.length;
			Arr[rear] = element;
			System.out.println("Inserted " + element);
		}
	}

	// Removing an element
	public int deQueue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = Arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} /* Q has only one element, so we reset the queue after deleting it. */
			else {
				front = (front + 1) % Arr.length;
			}
			return (element);
		}
	}

	void Display() {
		/* Method to display status of Circular Queue */
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
		} else {
			System.out.println("Front -> " + front);
			System.out.println("Arr -> ");
			for (i = front; i != rear; i = (i + 1) % Arr.length)
				System.out.print(Arr[i] + " ");
			System.out.println(Arr[i]);
			System.out.println("Rear -> " + rear);
		}
	}
}
