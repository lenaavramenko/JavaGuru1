package com.JavaGuru1.lv.lesson7.lookupArray;

public class LookupArrayService {


    public int findMax(int[] array) {
        if (array != null) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[max] < array[i]) {
                    max = i;
                }
            }
            return array[max];
        }
        return 0;
    }

   public int findMin(int[] array) {
        if (array != null) {
            int min = array[0];
            for (int i = 0; i < array.length; i++){
                if (array[min] > array[i]){
                    min = i;
                }
            }
            return array[min];
        }
        return 0;
    }

    public int indexOfMax(int[] array) {
        return 0;
    }

    public int indexOfMin(int[] array) {
        return 0;
    }

    public int indexOf(int[] array, int value) {
        return 0;
    }

}
