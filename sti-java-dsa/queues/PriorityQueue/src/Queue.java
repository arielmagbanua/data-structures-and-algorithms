package PriorityQueue;

class Queue {

	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s){

		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public int remove(){

		int temp = queArray[front++];

		if(front==maxSize){
			front = 0;
		}

		nItems--;
		return temp;
	}

	public int peekFront(){
		return queArray[front];
	}


	public boolean isEmpty(){
		return nItems==0;
	}

	public boolean isFull(){
		return nItems==maxSize;
	}

	public int size(){
		return nItems;
	}

	public void insertPriority(int item) {

		int j;

		if(nItems==0) {

			queArray[nItems++] = item;

		} else {

			for(j=nItems-1; j>=0; j--) {

				if(item>queArray[j]){

					queArray[j+1] = queArray[j];

				} else{

					break;
				}
 			}

			queArray[j+1] = item;
			nItems++;
		}
	}
}
