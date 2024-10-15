import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private final Map<String, String> book;

    public PhoneBook( ){
        this.book = new HashMap<>();
    }

    public void add(String phone, String surname){
        book.put(phone, surname);
    }

    public List<String> get(String surname) {
        return book.entrySet().stream()
                .filter((r) -> r.getValue().equals(surname))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
