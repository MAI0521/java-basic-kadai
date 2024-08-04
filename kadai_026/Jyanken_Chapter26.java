package kadai.kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
        	input= scanner.next();
            if (input.equals("r") || input.equals("p") || input.equals("s")) {
                scanner.close();
                break;
            } else {
                System.out.println("正しいじゃんけんの手ではありません。再度入力しましょう");
            }
        }
        return input;
    }

    public String getRandom() {
        String[] jyanken = {"r", "p", "s"};
        int jyankenIndex = (int) (Math.random() * 3);
        return jyanken[jyankenIndex];
    }

    public void playGame() {
        HashMap<String, String> jyankenMap = new HashMap<>();
        jyankenMap.put("r", "グー");
        jyankenMap.put("s", "チョキ");
        jyankenMap.put("p", "パー");

        String jyankenYou = jyankenMap.get(getMyChoice());
        String jyankenOpponent = jyankenMap.get(getRandom());

        System.out.println("自分の手は " + jyankenYou + ", 対戦相手の手は " + jyankenOpponent);

        String combined = jyankenYou + jyankenOpponent;

        switch (combined) {
            case "グーグー", "チョキチョキ", "パーパー" -> System.out.println("あいこです");
            case "グーチョキ", "チョキパー", "パーグー" -> System.out.println("自分の勝ちです");
            case "グーパー", "チョキグー", "パーチョキ" -> System.out.println("自分の負けです");
            default -> System.out.println("無効です");
        }
    }
   
}

