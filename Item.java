public class Item { // Itemという名前のプログラムのまとまり（クラス）を作ります。
    public static void main(String[] args) { // プログラムを最初に動かす場所（mainメソッド）です。
        String title = "牛乳を買う"; // 文字を入れる箱（String型）のtitleに「牛乳を買う」を入れます。
        String html = "<li>" + title + "</li>"; // +で文字をつなぎ、HTMLの1行をhtmlに作ります。
        System.out.println(html); // htmlの内容をターミナルに1行表示します。
    } // mainメソッドをここで終えます。
} // Itemクラスをここで終えます。
