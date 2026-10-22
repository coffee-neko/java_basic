package chapter_17.section_17_3;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi book = new LogBookAi();
        book.title = "はじめてのJava";

        book.addRead(30);
        book.addRead(45);
        book.show();
    }
}
