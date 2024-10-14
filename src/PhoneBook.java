import java.util.*;

public class PhoneBook {
    private final Map<String, String> book;
    private final List<String> numberPhones;

    public PhoneBook( ){
        this.book = new HashMap<>();
        this.numberPhones = new ArrayList<>();
    }

    public void add(String phone, String surname){
        book.put(phone, surname);
    }

    public List<String> get(String surname) {
        for (Map.Entry<String, String> record: book.entrySet()){
            if(record.getValue().equals(surname)){
                numberPhones.add(record.getKey());
            }
        }
       return numberPhones.size() == 1 ? Collections.singletonList(numberPhones.get(0)) : numberPhones;
    }
}
