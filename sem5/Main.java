package sem5;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("111", "Ivanov");
        phoneBook.add("112", "Petrov");
        phoneBook.add("123", "Ivanov");
        phoneBook.viewAll();
        System.out.println("---");
        phoneBook.get("Ivanov");
        phoneBook.remove("123");
        System.out.println("---");
        phoneBook.viewAll();
    }
}
