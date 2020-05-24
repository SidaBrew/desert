package com.sidabw;

/***
 *  Created by shao.guangze on 2020/5/22
 */
public class ArrayUtil {



        public static void main(String[] args) {
            int[] arr = {2,5,1,3,8,5,7,4,3};
            bubbleSort(arr);

            for (int i = 0; i < arr.length; i++) {

                System.out.println(arr[i]);
            }

        }



    private static void bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {

                if (arr[j]>arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }
}
