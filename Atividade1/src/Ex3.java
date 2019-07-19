
public class Ex3 {
	
	public static int[][] FillMatrix(int[][] m, int h, int w){
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				m[i][j] = (int)(Math.random() *10); 
			}	
			
		}	
		
		return m;
	}
	
	public static int[][] MultiplyMatrix(int[][] A, int[][] B){
		int[][] m = new int[A.length][B[0].length];
		
		for (int i = 0; i < A.length; i++)
	        for (int j = 0; j < B[0].length; j++) 
	            for (int k = 0; k < A[0].length; k++) 
	                m[i][j] += (A[i][k] * B[k][j]);
				
		return m;
	}

}
