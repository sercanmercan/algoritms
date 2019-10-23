package hw2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.*;

public class main {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		// create arrays
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
		String fileName=" file.txt";
		
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
			int n=rand.nextInt(1000000)+500;// random numbers between 500 and 1000000
			Arr[i]=n;
		
			System.out.println(Arr[i]);
			
			quickSort(Arr,0,Arr.length-1); // function of quick sort
			//calculating completion of time
			if(i==Arr.length-1) {
				System.out.println("start:"+ startTime);
				long endTime=System.currentTimeMillis(); //end time
				System.out.println("end:"+ endTime);
				System.out.println("Array completion time :" + (endTime-startTime) + " ms");
				outputStream.print("Array completion time :" + (endTime-startTime) + " ms"); // write the file
				
			
			}
		}
		
		for(int i=0;i<Arr.length;i++) {
			System.out.println("sorted : " +Arr[i] );
		}
		

		System.out.println("***********************************************************");
		
		System.out.println("Array elements :");
		long startTime2=System.currentTimeMillis();
		
		for(int i=0;i<Arr2.length;i++) {
			int n=rand.nextInt(1000000)+500;
			Arr2[i]=n;
		
			System.out.println(Arr2[i]);
			
			if(i==Arr2.length-1) {
				System.out.println("start:"+ startTime2);
				long endTime2=System.currentTimeMillis();
				System.out.println("end:"+ endTime2);
				System.out.println("Array2 completion time :" + (endTime2-startTime2) + " ms");
				outputStream.print("\nArray2 completion time :" + (endTime2-startTime2) + " ms");
				
			
			}
		}
		
	
		quickSort(Arr2,0,Arr2.length-1);

		
		
		for(int i=0;i<Arr2.length;i++) {
			System.out.println("Sorted : "+Arr2[i] );
		}
		
		System.out.println("***********************************************************");
		
		System.out.println("Array elements :");
		long startTime3=System.currentTimeMillis();
		
		for(int i=0;i<Arr3.length;i++) {
			
			int n=rand.nextInt(1000000)+500;
			Arr3[i]=n;	
			System.out.println(Arr3[i]);
			quickSort(Arr3,0,Arr3.length-1);
			if(i==Arr3.length-1) {
				System.out.println("start:"+ startTime3);
				long endTime3=System.currentTimeMillis();
				System.out.println("end:"+ endTime3);
				System.out.println("Array3 completion time :" + (endTime3-startTime3) + " ms");
				outputStream.print("\nArray3 completion time :" + (endTime3-startTime3) + " ms");		
			}
		}
		
		for(int i=0;i<Arr3.length;i++) {
			System.out.println("Sorted : "+Arr3[i] );
		}
		
		System.out.println("***********************************************************");
		
		System.out.println("Array elements :");
		long startTime4=System.currentTimeMillis();
		
		for(int i=0;i<Arr4.length;i++) {
			
			int n=rand.nextInt(1000000)+500;
			Arr4[i]=n;		
			System.out.println(Arr4[i]);
			quickSort(Arr4,0,Arr4.length-1);
			
			if(i==Arr4.length-1) {
				System.out.println("start:"+ startTime2);
				long endTime4=System.currentTimeMillis();
				System.out.println("end:"+ endTime4);
				System.out.println("Array4 completion time :" + (endTime4-startTime4) + " ms");
				outputStream.print("\nArray4 completion time :" + (endTime4-startTime4) + " ms");			
			}
		}
		
		for(int i=0;i<Arr4.length;i++) {
			System.out.println("Sorted : "+Arr4[i] );
		}
		
		System.out.println("***********************************************************");
		
		System.out.println("Array elements :");
		long startTime5=System.currentTimeMillis();
		
		for(int i=0;i<Arr5.length;i++) {
			
			int n=rand.nextInt(1000000)+500;
			Arr5[i]=n;		
			System.out.println(Arr5[i]);
			quickSort(Arr5,0,Arr5.length-1);
			
			if(i==Arr5.length-1) {
				System.out.println("start:"+ startTime5);
				long endTime5=System.currentTimeMillis();
				System.out.println("end:"+ endTime5);
				System.out.println("Array5 completion time :" + (endTime5-startTime5) + " ms");
				outputStream.print("\nArray5 completion time :" + (endTime5-startTime5) + " ms");			
			}
		}
		
		for(int i=0;i<Arr5.length;i++) {
			System.out.println("Sorted : "+Arr5[i] );
		}
		
		System.out.println("***********************************************************");
		
		System.out.println("Array elements :");
		long startTime6=System.currentTimeMillis();
		
		for(int i=0;i<Arr6.length;i++) {
			
			int n=rand.nextInt(1000000)+500;
			Arr6[i]=n;		
			System.out.println(Arr6[i]);
			quickSort(Arr6,0,Arr6.length-1);
			
			if(i==Arr6.length-1) {
				System.out.println("start:"+ startTime6);
				long endTime6=System.currentTimeMillis();
				System.out.println("end:"+ endTime6);
				System.out.println("Array6 completion time :" + (endTime6-startTime6) + " ms");
				outputStream.print("\nArray6 completion time :" + (endTime6-startTime6) + " ms");
			}
		}
		
		for(int i=0;i<Arr6.length;i++) {
			System.out.println("Sorted : "+Arr6[i] );
		}
		
		System.out.println("***********************************************************");
		
		System.out.println("Array elements :");
		long startTime7=System.currentTimeMillis();
		
		for(int i=0;i<Arr7.length;i++) {
			
			int n=rand.nextInt(1000000)+500;
			Arr7[i]=n;		
			System.out.println(Arr7[i]);
			quickSort(Arr7,0,Arr7.length-1);
			
			if(i==Arr7.length-1) {
				System.out.println("start:"+ startTime7);
				long endTime7=System.currentTimeMillis();
				System.out.println("end:"+ endTime7);
				System.out.println("Array7 completion time :" + (endTime7-startTime2) + " ms");
				outputStream.println("\nArray7 completion time :" + (endTime7-startTime2) + " ms");
			}
		}
		
		outputStream.close();			

		for(int i=0;i<Arr7.length;i++) {
			System.out.println("Sorted : "+Arr7[i] );
		}
	}	
	
	//partition function for finding pivot
	static int dividing(int array[], int left, int right)

	{
		  int temp;
	     
	      int x = left, y = right;
	       int pivot = array[(left + right)/2];
	      while (x <= y) {
	            while (array[x] > pivot)
	                  x++;

	            while (array[y] < pivot) {
	                  y--;
	            	try {
	    				Thread.sleep(5);
	    				
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	            }
	            if (x <= y) {
	            	
	            	
	                  temp = array[x];
	                  array[x] = array[y];
	                  array[y] = temp;
	                  x++;
	                  y--;
	            }
	      };
	     
	      return x;

	}

	static void quickSort(int arr[], int left, int right) {
		
	      int index = dividing(arr, left, right);
	      if (left < index - 1)
	    	  try {
					Thread.sleep(5);
					quickSort(arr, left, index - 1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
}
