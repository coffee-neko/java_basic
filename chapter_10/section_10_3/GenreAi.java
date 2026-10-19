package chapter_10.section_10_3;

public class GenreAi {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in); // 入力を受け取る道具を1つ作ります。

        System.out.print("ジャンル番号を入力してください（1から4）: "); // 入力の案内を表示します。
        int genreNumber = scanner.nextInt(); // 入力された整数をgenreNumberに入れます。

        String shelfName = switch (genreNumber) { // 番号に応じて棚の名前を決めます。
            case 1 -> "小説";
            case 2 -> "技術書";
            case 3, 4 -> "図鑑と写真集";
            default -> "その他";
        };

        System.out.println("棚の名前は " + shelfName + " です"); // 決まった棚の名前を表示します。
    }
}
