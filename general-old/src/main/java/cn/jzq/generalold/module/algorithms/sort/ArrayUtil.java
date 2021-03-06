package cn.jzq.generalold.module.algorithms.sort;

import cn.hutool.core.util.RandomUtil;

public class ArrayUtil {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] getRandIntArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = RandomUtil.randomInt(1, 100_000);
        }
        return arr;
    }
}
