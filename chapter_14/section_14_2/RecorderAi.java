package chapter_14.section_14_2;

public class RecorderAi {
    public static void showHeading() {
        System.out.println("読書の記録");
        System.out.println("==========");
    }

    public static void showBookInfo(String title, int pages) {
        System.out.println(title + " は " + pages + " ページ");
    }

    public static void main(String[] args) {
        showHeading();
        showBookInfo("旅の記録", 320);
        showBookInfo("星の地図", 180);
    }
}
