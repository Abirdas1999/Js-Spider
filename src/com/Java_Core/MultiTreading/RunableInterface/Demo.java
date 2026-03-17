package com.Java_Core.MultiTreading.RunableInterface;
class Book{
	synchronized void getBook(Pen p){
		System.out.println ("A hold book");
		try {
			Thread.sleep (3000);
		}catch (Exception e){
			e.printStackTrace();
		}
		p.getPen (this);

	}
}
class Pen{
	synchronized void getPen(Book b){
		System.out.println ("B hold pen");
		try {
			Thread.sleep (4000);
		}catch (Exception e){
			e.printStackTrace ();
		}
		b.getBook (this);
	}
}
class Demo implements Runnable{
	Book b = new Book();
	Pen p = new Pen();

	@Override
	public void run(){
		b.getBook (p);
	}
	void startWork(){
		Thread t = new Thread (this);
		t.start ();
		p.getPen (b);
	}
	public static void main(String[] args) {
	    Demo d = new Demo();
		d.startWork ();
	}

}
