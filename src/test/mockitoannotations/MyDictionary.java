package mockitoannotations;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary {
    Map<String, String> wordMap;

    public MyDictionary() {
        wordMap = new HashMap<String, String>();
    }

    public void setWordMap(Map<String, String> wordMap) {
        this.wordMap = wordMap;
    }

    public void add(final String word, final String meaning) {
        wordMap.put(word, meaning);
    }

    public String getMeaning(final String word) {
        return wordMap.get(word);
    }
}