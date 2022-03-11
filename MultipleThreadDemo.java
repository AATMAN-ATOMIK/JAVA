class ThreadName implements Runnable
{
		String thname;
		Thread t;
		
	ThreadName(String thradname)
	{
		thname=thradname;
		t = new Thread(this,thname);
		System.out.println("Threadname:"+thname);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(thname+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(thname +"Interrupted");
		}
		System.out.println("Exit from:"+thname);
	}
}
class MultipleThreadDemo
{
	public static void main(String args[])
	{
		new ThreadName("One");
		new ThreadName("two");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exit from main thrad.");
	}
}
