import java.util.Arrays;

public class Ex2 {
	public static int terms;
	
	public static double Average(int[] arr) {
		double acc = 0;
		for(int i = 0; i < terms; i++) {
			acc += arr[i];
		}
				
		return acc/(double)terms;
	}
	
	public static int Moda(int[] arr) {
		Arrays.sort(arr);
		
		int acc1 = 0;
		int acc2 = 0;
		int moda = 0;
		for(int idx = 0; idx < terms; idx++) {
			acc2 = acc1;
			acc1 = 0; 
			for (int i : arr) 
				if(i == arr[idx]) 
					acc1++;
			
			if(acc1 > acc2)
				moda = arr[idx];
		}
		
		return moda;
	}
	
	public static int[] getArr() {
		int[] arr = new int[terms];
		
		for(int i = 0; i < terms; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		
		return arr;
	}
}

