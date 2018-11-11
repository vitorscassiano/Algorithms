class Solution9 {
    public static void reverseInPlace(int[] arr) {
        int len = arr.length;
        int temp;

        for(int i = 0; i < len/2; i++) {
            temp = arr[i];
            arr[i] = arr[len-1];
            arr[len-1] = temp;
            len--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseInPlace(arr);

        System.out.printf("[ ");
        for (int i = 0; i < arr.length; i++)
            System.out.printf(" %d ", arr[i]);
        System.out.printf(" ]");
    }
}
