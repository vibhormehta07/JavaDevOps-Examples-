package Mypack;

public interface abs {
	
	   /* compiler will treat them as: 
	    * public abstract void method1();
	    * public abstract void method2();
	    */
	   public void method1();
	   public void method2();
	}
	class Demo implements abs
	{
	   /* This class must have to implement both the abstract methods
	    * else you will get compilation error
	    */
	   public void method1()
	   {
		System.out.println("implementation of method1");
	   }
	   public void method2()
	   {
		System.out.println("implementation of method2");
	   }
	   public static void main(String arg[])
	   {
		abs obj = new Demo();
		obj.method1();
	   }
	}

