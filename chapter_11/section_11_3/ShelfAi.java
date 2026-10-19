package chapter_11.section_11_3;

public class ShelfAi {
    public static void main(String[] args) {
        int copies = 5;

        for (int number = 1; number <= copies; number++) {
            System.out.println(number + "冊目を棚に入れました");
        }

        System.out.println(copies + "冊すべて入れ終わりました");
    }
}
