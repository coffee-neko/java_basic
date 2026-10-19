package chapter_10.section_10_1;

public class RankAi {
    public static void main(String[] args) {
        int pages = 320; // ページ数を入れます。
        String label; // ページ数に応じた分類の名前を入れる箱を用意します。

        if (pages >= 500) { // 500ページ以上かを最初に調べます。
            label = "大作";
        } else if (pages >= 300) { // 次に300ページ以上かを調べます。
            label = "読みごたえあり";
        } else if (pages >= 150) { // 次に150ページ以上かを調べます。
            label = "標準";
        } else { // 150ページ未満の場合です。
            label = "短編";
        }

        System.out.println(pages + " ページは " + label + " です"); // ページ数と分類を1行で表示します。
    }
}
