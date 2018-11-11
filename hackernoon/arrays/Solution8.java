/* How do you remove duplicates from an array in place? (solution) */

class Solution8 {
    static void removeDuplicates(int[] arr) {
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        //int[] arr = { 1, 2, 3, 3, 4, 5};
        int[] arr = {1, 2, 1, 1, 1, 1, 1};

        removeDuplicates(arr);

        System.out.printf("[ ");
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%d ", arr[i]);
        System.out.printf(" ]");
    }
}

