package com.stactandqueues;


//by making dequeue operation costly
public class QueueUinggStack {
	public static void main(String[] args){
		QueueUinggStack q = new QueueUinggStack();
		q.customEnqueue(2);
		q.customEnqueue(5);
		q.customEnqueue(8);
		System.out.println(q.customDequeue());
		System.out.println(q.customDequeue());
		System.out.println(q.customDequeue());
		System.out.println(q.customDequeue());
		q.customEnqueue(9);
		System.out.println(q.customDequeue());
		
	}
	
	MyStack s1  = new MyStack();
	MyStack s2  = new MyStack();
	int size = 0;
    
	public void customEnqueue(int val) {
		s2.push(val);
	}
	
	public int customDequeue() {
		
		if(s1.isEmpty() && s2.isEmpty())
			return -1;
		
		// empty s2 and put  in s1 then order will be as insertion in s1
		//below while loop will run only once as after first time s2 became empty
		while(!s2.isEmpty()) {
			int val = s2.pop();
			s1.push(val);
		}
		return s1.pop();
	}
}
