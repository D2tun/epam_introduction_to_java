package task_fifteen;

public class Upscaling_digits {

	public static boolean is(int[] array) {
		
		boolean upscaling = false;
		if (array.length == 1) {
			upscaling = false;
		} else {
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					upscaling = false;
					break;
				} else {
					upscaling = true;
				}
			}
		}
		
		return upscaling;
	}
}
