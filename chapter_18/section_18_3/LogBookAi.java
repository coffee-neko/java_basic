package chapter_18.section_18_3;

public class LogBookAi {
    String title;
    int readPages;

    LogBookAi(String title) {
        this.title = title;
        this.readPages = 0;
    }

    void addRead(int pages) {
        this.readPages += pages;
    }

    void show() {
        System.out.println(this.title + "：" + this.readPages + "ページまで読んだ");
    }
}
