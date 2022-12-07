public class MinHeap {


	int[] arrayFinish = new int[6];
//	int[] arr1 = {array[0]};
//	int[] arr2 = {array[1], array[2]};
//	int[] arr3 = {array[3], array[4], array[5]};


	public int findMin(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] array = new int[]{5, 8, 1, 4, 2, 0, 6, 2, 1};
		MinHeap a = new MinHeap();
		System.out.println(a.findMin(array));
	}
}


