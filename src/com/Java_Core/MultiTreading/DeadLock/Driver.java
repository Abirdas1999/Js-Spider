package com.Java_Core.MultiTreading.DeadLock;

class Book{
	synchronized void useBook(Pen p){
		System.out.println("B holds Book");
		try{ Thread.sleep(2000); } catch(Exception e){}
		p.usePen(this);
	}
}

class Pen{
	synchronized void usePen(Book b){
		System.out.println("A holds Pen");
		try{ Thread.sleep(2000); } catch(Exception e){}
		b.useBook(this);
	}
}

class Driver implements Runnable {

	Pen p = new Pen();
	Book b = new Book();

	@Override
	public void run(){
		b.useBook(p);
	}

	//run by main thread
	void startWork(){
		Thread t = new Thread(this);
		t.start();

		p.usePen(b);
	}

	public static void main(String[] args){
		Driver d = new Driver();
		d.startWork();
	}
}