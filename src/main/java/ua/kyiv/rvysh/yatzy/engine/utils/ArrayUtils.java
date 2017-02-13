package ua.kyiv.rvysh.yatzy.engine.utils;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int e : array) {
            sum += e;
        }
        return sum;
    }
}
