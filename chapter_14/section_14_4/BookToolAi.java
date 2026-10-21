package chapter_14.section_14_4;

public class BookToolAi {
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        int totalPages = add(320, 180);
        int days = divide(totalPages, 30);

        System.out.println("2冊で " + totalPages + " ページ");
        System.out.println("1日30ページなら " + days + " 日");
    }
}
