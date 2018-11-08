/* How do you find the largest and smallest number in an unsorted integer array? */

class Solution3 {
    public static void main(String[] args) {
        Integer number[] = { 43, 6, 41,	52,	42, 31,	63, 16, 11, 93, 85, 48, 75, 55, 11 };
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            max = Math.max(number[i], max);
            min = Math.min(number[i], min);
        }
        System.out.printf("Max: %d, Min: %d", max, min);
    }
}
