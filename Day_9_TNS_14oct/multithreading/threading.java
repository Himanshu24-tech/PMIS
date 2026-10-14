// Create a class that extends Thread. Override the run() method,
// this is where you put the code that the thread should execute.
// Then create an object of your class and call the start() method.
//  This will internally call run() in a new thread.

class MyThread extends Thread{
    
    // initiated run method for Thread
    public void run(){
        
      	String str = "Thread Started Running...";
        System.out.println(str);
    }
}

public class threading{
    
  	public static void main(String args[]){
  	    
      	MyThread t1 = new MyThread();
      	t1.start();
    }
}