public interface Queue extends Container{//FIFO
	void enqueue(Object obj);
	Object dequeue(Object obj);
	Object getFront();
}