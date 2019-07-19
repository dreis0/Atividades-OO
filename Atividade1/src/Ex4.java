public class Ex4 {
	public static boolean isFilled(int[] arr) {
		for (int i : arr) 
			if(i == 0)
				return false;
		return true;
	}
	
	public static boolean canInsert(int[] arr, int position) {
		for (int i = position; i < arr.length; i++) {
			if(arr[i] == 0)
				return true;
		}
		return false;
	}
	
	public static int[] Insert(int[] arr, int position, int value) {
		if(arr[position] == 0) {
			arr[position] = value;
			return arr;
		}
		
		int pastValue = arr[position];
		int auxPastValue = pastValue;
		arr[position] = value;
		
		for (int i = position + 1; i < arr.length; i++) {
			pastValue = auxPastValue;
			
			if(arr[i] == 0) {
				arr[i] = pastValue;
				break;
			}
		
			auxPastValue = arr[i];
			arr[i] = pastValue;
		}
		
		return arr;
	}
}
