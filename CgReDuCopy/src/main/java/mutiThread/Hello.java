package mutiThread;

public class Hello extends Thread {
   private static ThreadLocal<String> tl = new ThreadLocal<String>();
   private static  int num=0;
   private  int sum=0;
   public Hello(Integer num)
   {
	   this.sum=num;
   }
	public void run() {
		
        tl.set("Hello");
        System.out.println(sum);
      
	}
    public static void main(String []args) 
    {  
      		(new Hello(1)).run();
    
	  
	}
}
