package sem5;

import java.util.HashMap;
import java.util.Objects;

public class PhoneBook {
    HashMap<String, String> phonesMap = new HashMap<>();

    public PhoneBook() {
    }

    public PhoneBook(HashMap<String, String> phonesMap) {
        this.phonesMap = phonesMap;
    }

    public void add(String phone, String surname){
        phonesMap.put(phone, surname);
    }

    public void get(String surname){
        for (String key : phonesMap.keySet()) {
            if (Objects.equals(phonesMap.get(key), surname)){
                System.out.println(key);
            }
        }
    }

    public void viewAll(){
        for (String key : phonesMap.keySet()) {
            System.out.println(key + " : " + phonesMap.get(key));
        }
    }

    public void remove(String phone){
        phonesMap.remove(phone);
    }

    public HashMap<String, String> getPhonesMap() {
        return phonesMap;
    }
}
