package chapter_17.section_17_2;

public class RunnerAi {
    public static void main(String[] args) {
        BookNoteAi book = new BookNoteAi();
        book.title = "はじめてのJava";
        book.pages = 320;

        System.out.println(book.title);
        System.out.println(book.pages);
    }
}
