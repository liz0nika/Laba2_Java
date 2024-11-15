package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("Це перше відоме речення. Це друге речення. Це третє речення."); // текст

        // слова з першого речення
        Set<String> firstWords = WordsFirstSentence(text);

        // всі слова з наступних речень
        Set<String> subsequentWords = WordsSubsequent(text);

        // унікальні слова
        StringBuffer uniqueWords = UniqueWords(firstWords, subsequentWords);

        System.out.println("Унікальні слова:\n" + uniqueWords.toString().trim());
    }

    // отримання першого речення
    public static StringBuffer FirstSentence(StringBuffer text) {
        String[] sentences = text.toString().split("\\. "); // розбиття тексту на речення
        return new StringBuffer(sentences[0]); // перше речення
    }

    // отримання слів з першого речення
    public static Set<String> WordsFirstSentence(StringBuffer text) {
        StringBuffer firstSentence = FirstSentence(text);
        Set<String> firstWords = new HashSet<>(); // слова з першого речення
        StringBuffer wordBuffer = new StringBuffer();
        for (int i = 0; i < firstSentence.length(); i++) {
            char c = firstSentence.charAt(i);
            if (c == ' ') {
                firstWords.add(wordBuffer.toString());
                wordBuffer.setLength(0); // очистити для наступного слова
            } else {
                wordBuffer.append(c);
            }
        }
        // останнє слово
        if (wordBuffer.length() > 0) {
            firstWords.add(wordBuffer.toString());
        }
        return firstWords;
    }

    // отримання всіх слів з наступних речень
    public static Set<String> WordsSubsequent(StringBuffer text) {
        String[] sentences = text.toString().split("\\. "); // розбиття тексту на речення
        Set<String> subsequentWords = new HashSet<>();
        StringBuffer wordBuffer = new StringBuffer();
        for (int i = 1; i < sentences.length; i++) {
            StringBuffer currentSentence = new StringBuffer(sentences[i]);
            wordBuffer.setLength(0); // очистити, щоб використати знову
            for (int j = 0; j < currentSentence.length(); j++) {
                char c = currentSentence.charAt(j);
                if (c == ' ') {
                    subsequentWords.add(wordBuffer.toString());
                    wordBuffer.setLength(0);
                } else {
                    wordBuffer.append(c);
                }
            }
            // останнє слово
            if (wordBuffer.length() > 0) {
                subsequentWords.add(wordBuffer.toString());
            }
        }
        return subsequentWords;
    }

    // отримання унікальних слів
    public static StringBuffer UniqueWords(Set<String> firstWords, Set<String> subsequentWords) {
        StringBuffer uniqueWords = new StringBuffer();
        for (String word : firstWords) {
            if (!subsequentWords.contains(word)) {
                uniqueWords.append("\"").append(word).append("\" ").append("\n");
            }
        }
        return uniqueWords;
    }
}
