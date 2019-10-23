import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class counting_sort {
	private static final int MAX_RANGE = 1000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []Arr=new int[5];
		int []Arr2=new int[10];
		int []Arr3=new int[30];
		int []Arr4=new int[50];
		int []Arr5=new int[100];
		int []Arr6=new int[200];
		int []Arr7=new int[500];
		
		//create random numbers
		Random rand= new Random();
		//create file.txt
		String fileName=" file2.txt";
		
		PrintWriter outputStream = null;
		try {
			outputStream = new PrintWriter (fileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Array elements :");
		
		//first arrays completion time
		long startTime=System.currentTimeMillis();
		for(int i=0;i<Arr.length;i++) {
			int n=rand.nextInt(5)+1;
			Arr[i]=n;
		
			System.out.println(Arr[i]);
			
			counting_sort(Arr);
			if(i==Arr.length-1) {
				System.out.println("start:"+ startTime);
				long endTime=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime);
				System.out.println("Array completion time :" + (endTime-startTime) + " ms");
				outputStream.print("Array completion time :" + (endTime-startTime) + " ms"); // write the file
				
			
			}
		}
		
		
		
		for(int i=0;i<Arr.length;i++) {
			System.out.println("sorted : "+ Arr[i]);
		}
	
		System.out.println("***********************************************************");
		
		long startTime2=System.currentTimeMillis();
		for(int i=0;i<Arr2.length;i++) {
			int n=rand.nextInt(10)+1;
			Arr2[i]=n;
		
			System.out.println(Arr2[i]);
			counting_sort(Arr2);
			if(i==Arr2.length-1) {
				System.out.println("start:"+ startTime2);
				long endTime2=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime2);
				System.out.println("Array completion time :" + (endTime2-startTime2) + " ms");
				outputStream.print("\nArray completion time :" + (endTime2-startTime2) + " ms"); // write the file			
			}
		}
		
		
		
		for(int i=0;i<Arr2.length;i++) {
			System.out.println("sorted : "+ Arr2[i]);
		}
		
		System.out.println("***********************************************************");
		
		long startTime3=System.currentTimeMillis();
		for(int i=0;i<Arr3.length;i++) {
			int n=rand.nextInt(30)+1;
			Arr3[i]=n;
		
			System.out.println(Arr3[i]);
			
			counting_sort(Arr3);
			if(i==Arr3.length-1) {
				System.out.println("start:"+ startTime3);
				long endTime3=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime3);
				System.out.println("Array completion time :" + (endTime3-startTime3) + " ms");
				outputStream.print("\nArray completion time :" + (endTime3-startTime3) + " ms"); // write the file			
			}
		}
		
		
		
		for(int i=0;i<Arr3.length;i++) {
			System.out.println("sorted : "+ Arr3[i]);
		}		
		
		System.out.println("***********************************************************");
		
		long startTime4=System.currentTimeMillis();
		for(int i=0;i<Arr4.length;i++) {
			int n=rand.nextInt(50)+1;
			Arr4[i]=n;
		
			System.out.println(Arr4[i]);
			
			counting_sort(Arr4);
			if(i==Arr4.length-1) {
				System.out.println("start:"+ startTime4);
				long endTime4=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime4);
				System.out.println("Array completion time :" + (endTime4-startTime4) + " ms");
				outputStream.print("\nArray completion time :" + (endTime4-startTime4) + " ms"); // write the file			
			}
		}
		
		
		
		for(int i=0;i<Arr4.length;i++) {
			System.out.println("sorted : "+ Arr4[i]);
		}
		
		System.out.println("***********************************************************");
		
		long startTime5=System.currentTimeMillis();
		for(int i=0;i<Arr5.length;i++) {
			int n=rand.nextInt(100)+1;
			Arr5[i]=n;
		
			System.out.println(Arr5[i]);
			
			counting_sort(Arr5);
			if(i==Arr5.length-1) {
				System.out.println("start:"+ startTime5);
				long endTime5=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime5);
				System.out.println("Array completion time :" + (endTime5-startTime5) + " ms");
				outputStream.print("\nArray completion time :" + (endTime5-startTime5) + " ms"); // write the file			
			}
		}
		
		
		
		for(int i=0;i<Arr5.length;i++) {
			System.out.println("sorted : "+ Arr5[i]);
		}
		
		System.out.println("***********************************************************");
		
		long startTime6=System.currentTimeMillis();
		for(int i=0;i<Arr6.length;i++) {
			int n=rand.nextInt(200)+1;
			Arr6[i]=n;
		
			System.out.println(Arr6[i]);
			
			counting_sort(Arr6);
			if(i==Arr6.length-1) {
				System.out.println("start:"+ startTime6);
				long endTime6=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime6);
				System.out.println("Array completion time :" + (endTime6-startTime6) + " ms");
				outputStream.print("\nArray completion time :" + (endTime6-startTime6) + " ms"); // write the file			
			}
		}
		
		
		
		for(int i=0;i<Arr2.length;i++) {
			System.out.println("sorted : "+ Arr2[i]);
		}
		
		System.out.println("***********************************************************");
		
		long startTime7=System.currentTimeMillis();
		for(int i=0;i<Arr7.length;i++) {
			int n=rand.nextInt(500)+1;
			Arr7[i]=n;
		
			System.out.println(Arr7[i]);
			
			counting_sort(Arr7);
			if(i==Arr7.length-1) {
				System.out.println("start:"+ startTime7);
				long endTime7=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime7);
				System.out.println("Array completion time :" + (endTime7-startTime7) + " ms");
				outputStream.print("\nArray completion time :" + (endTime7-startTime7) + " ms"); // write the file			
			}
		}
		
		
		
		for(int i=0;i<Arr7.length;i++) {
			System.out.println("sorted : "+ Arr7[i]);
		}
		
		outputStream.close();
	}
	
    // Counting Sort function 
    public static void counting_sort( int[] arr )
    {
        int x = arr.length;
        if (x == 0)
            return;
        /** find max and min values **/
        int max = arr[0], min = arr[0];
        for (int i = 1; i < x; i++)
        {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;
 
        /** check if range is small enough for count array **/
        /** else it might give out of memory exception while allocating memory for array **/
        if (range > MAX_RANGE)
        {
            System.out.println("\nError : Range too large for sort");
            return;
        }
 
        int[] counting = new int[range];
        // finding count of each element
        for (int i = 0; i < x; i++) {
        	
            counting[arr[i] - min]++;
        }
        //changing the final arrays
        for (int i = 1; i < range; i++)
            counting[i] += counting[i - 1];
        // change the array
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (j < counting[i]) {
            	try {
				Thread.sleep(5); // delaying the time
				
            	} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
            	}
            	arr[j++] = i + min;
            }
        }
    }    
}
