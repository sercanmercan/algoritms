import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName=" file3.txt";
		
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter (fileName);
		} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
		long startTime=System.currentTimeMillis();
		
		for(int i=1;i<=20;i++) {
			System.out.println(i + ". element "+fibonacci(i));
			
			System.out.println("start:"+ startTime);
			long endTime=System.currentTimeMillis(); //end time
			System.out.println("end:"+ endTime);
			System.out.println(" completion time :" + (endTime-startTime) + " ms");
			outputStream.print(i+". completion time :" + (endTime-startTime) + " ms\n"); // write the file			
			
			
		}
		outputStream.close();
		
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			try {
				Thread.sleep(5); // delaying the time
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return n;
			
		}
        else
        	
        	return fibonacci(n-1) + fibonacci(n-2);
	}
	
}
