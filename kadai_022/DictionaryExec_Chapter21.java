package kadai.kadai_022;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] translationArray = {"apple", "banana", "grape", "orange"};
		
		for( int i = 0; i < translationArray.length; i++) {
		dictionary.translate(translationArray[i]);
		}
	}

}
