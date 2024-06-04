public class no3 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int index = 0;
        int sumC = 0;
        double avgC = 0;
        while (index < numbers.length) {
            sumC += numbers[index];
            avgC = sumC / numbers.length;
            index++;
        }
        System.out.println("합계="+sumC);
        System.out.println("평균="+avgC);
    }
}
