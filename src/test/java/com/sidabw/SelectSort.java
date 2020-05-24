package com.sidabw;

/***
 *  Created by shao.guangze on 2020/5/24
 */
public class SelectSort {

    public static void main(String[] args) {
        int i;
        int[] a = {20,40,30,10,60,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        selectSort(a, a.length);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }

    /**
     * 选择排序
     *
     * 参数说明：
     *     a -- 待排序的数组
     *     n -- 数组的长度
     * @param a
     * @param length
     */
    private static void selectSort(int[] a, int length) {

        int min;

        for (int i = 0; i < length; i++) {

            min = i;
            // 找出"a[i+1] ... a[n]"之间的最小元素，并赋值给min。
            for (int j = i+1; j <length; j++) {

                //
                if (a[j]<a[min]) {

                    min = j;
                }
            }

            // 若min!=i，则交换 a[i] 和 a[min]。
            // 交换之后，保证了a[0] ... a[i] 之间的元素是有序的。
            if (min !=i) {
                int temp ;
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;

            }

        }


    }
}
