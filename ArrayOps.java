public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        // Write your code here:
        int sumMiss = 0;
        int sumFull = 0;
        int missNum = 0;
        int[] fullArr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            sumMiss += array[i];
        }
        for (int j = 0; j < fullArr.length; j++) {
            fullArr[j] = j;
            sumFull += fullArr[j];
        }
        missNum = sumFull - sumMiss;
        return missNum;
    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int max = array[0];
        int secondMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = 0;
                i = array.length;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
       // Write your code here:
        boolean isEqual = true;
        if (array1.length != array2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                boolean foundElement = false;
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        foundElement = true;
                        break;
                    }
                }
                if (!foundElement) {
                    isEqual = false;
                    break;
                }

            }
        }

        return isEqual;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        boolean sorted = true; // Initialize to true
        int order = 0; 
        for (int i = 0; i < array.length - 1; i++) { // Loop until the second last element
            if (i == 0) { // If it is the first iteration
                // Store the order of the first two elements
                if (array[i] < array[i + 1]) {
                    order = -1;
                } else if (array[i] > array[i + 1]) {
                    order = 1;
                } else {
                    order = 0;
                }
            } else { // If it is not the first iteration
                // Compare the current element with the next one and check if it matches the
                // order
                if ((array[i] < array[i + 1] && order != -1) || (array[i] > array[i + 1] && order != 1)
                        || (array[i] == array[i + 1] && order != 0)) {
                    sorted = false; 
                    break; 
                }
            }
        }

        return sorted; 
    }

}

