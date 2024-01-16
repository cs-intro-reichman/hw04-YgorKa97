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
        boolean contain = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    contain = true;
                    break;
                } else {
                    contain = false;

                }
            }

        }

        return contain;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        boolean sotred = false;
        for (int i = 0; i < array.length; i++) {
            int min = array[0];
            if (array[i + 1] < min) {
                return sotred;
            } else {
                sotred = true;
                break;
            }
        }

        return sotred;
    }

}

