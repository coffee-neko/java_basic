package chapter_09.section_9_4;

public class TitleCheckAi {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in, java.nio.charset.Charset.forName("windows-31j"));

        System.out.print("書名を入力してください: "); // 入力してほしい内容を画面に表示します。
        String title = scanner.nextLine(); // 入力された1行をtitleに入れます。

        if (title.equals("旅の記録")) { // 入力された文字と「旅の記録」が同じかを調べます。
            System.out.println("その本は貸出中です"); // 同じだった場合のメッセージを表示します。
        } else { // 同じではなかった場合はこちらを実行します。
            System.out.println("その本は棚にあります"); // 同じではなかった場合のメッセージを表示します。
        }
    }
}
