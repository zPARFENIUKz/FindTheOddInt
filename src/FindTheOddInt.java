import java.util.Arrays;

public class FindTheOddInt {
    public static int findIt(final int[] arr) throws NullPointerException{
        if (arr == null) throw new NullPointerException("arr cannot be null");
        Arrays.sort(arr);
        int currentValue = arr[0];
        int counter = 0;
        for (int num : arr) {
            if (num == currentValue) {
                ++counter;
            } else {
                if (counter % 2 == 1) return currentValue;
                currentValue = num;
                counter = 1;
            }
        }
        return currentValue;
    }
}
