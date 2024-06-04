public class no5 {
    public static void main(String[] args) {
        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int sumPositive = 0;
        int sumNegative = 0;
        int index5 = 0;
        while (index5 < numbers.length) {
            if (numbers[index5] > 0) {
                sumPositive = sumPositive + numbers[index5];
            } else {
                sumNegative = sumNegative + numbers[index5];
            }
            index5++;
        }
        System.out.println("양수의 합=" + sumPositive);
        System.out.println("음수의 합=" + sumNegative);
    }
}
