package com.ArrayQueue;

import java.io.DataInputStream;

/*
 * Queue : FIFO
 * */
public class ArrayQ {
	public static void main(String arg[]) {
		DataInputStream get = new DataInputStream(System.in);
		int ch;
		ArrayQ obj = new ArrayQ();
		obj.getdata();
		try {
			do {
				System.out.println(" 1.Enqueue  2.Dequeue  3.Display  4.Exit");
				System.out.println("Enter the choice");
				ch = Integer.parseInt(get.readLine());
				switch (ch) {
				case 1:
					obj.enqueue();
					break;
				case 2:
					obj.dequeue();
					break;
				case 3:
					obj.display();
					break;
				}
			} while (ch != 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	DataInputStream get = new DataInputStream(System.in);
	int a[];
	int i, front = 0, rear = 0, n, item, count = 0;

	void getdata() {
		try {
			System.out.println("Enter the limit");
			n = Integer.parseInt(get.readLine());
			a = new int[n];
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void enqueue() {
		try {
			if (count < n) {
				System.out.println("Enter the element to be added:");
				item = Integer.parseInt(get.readLine());
				a[rear] = item;
				rear++;
				count++;
			} else
				System.out.println("QUEUE IS FULL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void dequeue() {
		if (count != 0) {
			System.out.println("The item deleted is:" + a[front]);
			front++;
			count--;
		} else
			System.out.println("QUEUE IS EMPTY");
		if (rear == n)
			rear = 0;
	}

	void display() {
		int m = 0;
		if (count == 0)
			System.out.println("QUEUE IS EMPTY");
		else {
			for (i = front; m < count; i++, m++)
				System.out.println(" " + a[i]);
		}
	}
}
