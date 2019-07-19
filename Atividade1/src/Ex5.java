
public class Ex5 {
	public static int[] sort(int[] arr) {
		int aux = arr[0];
		int auxIdx = 0;

		for (int i = 0; i < arr.length; i++) {
			aux = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] <= aux) {
					auxIdx = j;
					aux = arr[j];
				}
			}
			arr[auxIdx] = arr[i];
			arr[i] = aux;
		}

		return arr;
	}
}
