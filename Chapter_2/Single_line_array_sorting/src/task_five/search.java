package task_five;

public class search {

	public static int binary(int[] array, int number ,int right_border) {

		int left_border = 0;
		while (left_border <= right_border) {
			int middle = left_border + ((right_border - left_border) / 2);
			if (array[middle] > number) {
				right_border = middle - 1;
			}
			else { 
				if (array[middle] < number){
				left_border = middle + 1;
			} else {
				return middle;
			}
		}
		}
		return left_border ;
	}
}
