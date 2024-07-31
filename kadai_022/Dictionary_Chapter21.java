package kadai.kadai_022;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void translate(String word) {
		HashMap<String,String> translation = new HashMap<String,String>();
		
        translation.put("apple", "りんご");
        translation.put("peach", "桃");
        translation.put("banana", "バナナ");
        translation.put("lemon", "レモン");
        translation.put("pear", "梨");
        translation.put("kiwi", "キウイ");
        translation.put("strawberry", "いちご");
        translation.put("grape", "ぶどう");
        translation.put("muscat", "マスカット");
        translation.put("cherry", "さくらんぼ");
    
        if (translation.containsKey(word)) {
            System.out.println(word + "の意味は" + translation.get(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
    }
}