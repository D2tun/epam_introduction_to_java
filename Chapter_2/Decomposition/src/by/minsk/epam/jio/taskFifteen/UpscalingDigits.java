package by.minsk.epam.jio.taskFifteen;

public class UpscalingDigits {

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
