public class no4 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
        int max = numbers[0];
        int index = 1;
        while (index<numbers.length){
            if(numbers[index]>max){
                max = numbers[index];
            }
            index++;
        }
        System.out.println(max);
    }
}
