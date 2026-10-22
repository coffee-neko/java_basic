package chapter_18.section_18_3;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi book = new LogBookAi("はじめてのJava");
        book.addRead(75);
        book.show();
    }
}
