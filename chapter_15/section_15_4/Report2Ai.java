package chapter_15.section_15_4;

import chapter_15.section_15_2.BookMathAi;

public class Report2Ai {
    public static void main(String[] args) {
        int totalPages = BookMathAi.add(320, 180);
        int days = BookMathAi.divide(totalPages, 30);

        System.out.println("2冊で " + totalPages + " ページ");
        System.out.println("1日30ページなら " + days + " 日");
    }
}
