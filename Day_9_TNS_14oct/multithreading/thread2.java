// Using Runnable Interface
// Create a class that implements Runnable. Override the run() method, this contains the code for the thread.
// Then create a Thread object, pass your Runnable object to it and call start().

class MyThread implements Runnable{
    
  	// Method to start Thread
    public void run(){
        
      	String str = "Thread is Running Successfully";
        System.out.println(str);
    }

}

public class thread2{
    
    public static void main(String[] args){
        
        MyThread g1 = new MyThread();
      
        // initializing Thread Object
        Thread t1 = new Thread(g1);
        
      	// Running Thread
      	t1.start();
    }
}