package ch.anoop.outdefine;

public class RainWater {

    public static int maximumWater(int[] arr, int n) {

        int result = 0;
        int left;
        int right;
        int j;

        // Check inputs
        if (n <1 || arr == null) {
            System.out.print("Invalid input");
            return 0;
        }

        for (int i = 1; i < n - 1; i++) {

            // Left max
            left = arr[i];
            for (j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Right max
            right = arr[i];
            for (j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            // fix max rainwater among the right and left side
            result += Math.min(left, right) - arr[i];
        }

        return result;
    }


    // Do not change the below code.

    public static void main(String[] args) {
        for (String exp : args) {
            int arr_size = 0;
            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9')
                    arr_size++;
            }

            int[] arr = new int[arr_size];
            for (int i = 0, j = 0; i < exp.length(); i++) {
                if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
                    arr[j] = Character.getNumericValue(exp.charAt(i));
                    j++;
                }
            }

            System.out.print(maximumWater(arr, arr_size));
        }
    }
} 