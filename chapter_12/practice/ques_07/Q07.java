package chapter_12.practice.ques_07;

public class Q07 {
    public static void main(String[] args) {
        int[] numbers = {7, 77, 777, 7777, 77777};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }

        double average = (double) total / numbers.length;

        System.out.println("合計：" + total);
        System.out.println("平均：" + average);
    }
}
