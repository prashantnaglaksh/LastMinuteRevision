package com.stactandqueues;

// making pop operation costly
public class StackUsingQueue {
	public static void main(String[] args){
		StackUsingQueue s = new StackUsingQueue();
		s.customPush(5);
		s.customPush(9);
		s.customPush(10);
		System.out.println(s.customPop());
		System.out.println(s.customPop());
		System.out.println(s.customPop());
		System.out.println(s.customPop());
		System.out.println(s.customPop());
		
	}
	
	MyQueue q1  = new MyQueue();
	MyQueue q2  = new MyQueue();
	int size = 0;
	
	public void customPush(int val) {
		q2.enqueue(val);
	}
	
	public int customPop() {
		//dequeue all element from q2 except last one 
		// return last remaining element of q2 and the rename the queue
		if(q2.size == 0)
			return -1;
		
		while(q2.size != 1) {
			System.out.println("i am q2 size" + q2.size);
			int val = q2.dequeue();
			q1.enqueue(val);
		}
		int res = q2.dequeue();
		MyQueue temp = q2;
		q2 = q1;
		q1 = temp;
		return res;
	}
}
