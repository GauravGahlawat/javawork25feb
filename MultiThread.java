package ThreadDemo;
class MultithreadingDemo extends Thread
{
	public void run()
	{
		try
		{
			// display the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + "is running");
		}
		catch(Exception e)
		{
			// Throwing An Exception
			System.out.println("exception is caught");
		}
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8; // no. of threads
		for(int i=0;i<n;i++)
		{
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
		System.out.println("This is the main thread");

	}

}
