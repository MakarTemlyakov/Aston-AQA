import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        String [] wordArray = { "test", "test", "test", "asd", "zxc", "cat", "dog", "snake", "smoke", "break", "bank" };
        List<String> uniqueWords = new ArrayList<>();
        Map<String, Integer> wordList = new HashMap<>();

        for(String word: wordArray){
           if(!uniqueWords.contains(word)) {
               uniqueWords.add(word);
           }
           if(!wordList.containsKey(word)){
               wordList.put(word, 1);
           } else {
               wordList.put(word, wordList.get(word) + 1);
           }
        }

        System.out.println("\nУникальный список элементов:");
        for(String uniqueWord: uniqueWords) {
           System.out.println(uniqueWord);
        }

        System.out.println("\nСколько раз встречается каждое слово:");
        for(Map.Entry<String, Integer> wordCount : wordList.entrySet()) {
            System.out.println(wordCount);
        }

        book.add("+37533372494", "Сидиоров");
        book.add("+37533372323", "Иванов");
        book.add("+12321423344", "Сидиоров");

        List<String> phoneNumbers = book.get("Сидиоров");

        System.out.println("\nТелефоны:");

        for(Object phoneNumber: phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
