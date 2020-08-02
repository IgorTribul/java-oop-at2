package homework.phonebook;

import java.util.*;

public class PhoneBook {
    private String number;

    public PhoneBook(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number " + number;
    }

//    public void get(String surname) {
//        Set entrySet = new HashMap<PhoneBook, String>().entrySet();
//        Iterator it = entrySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry me = (Map.Entry) it.next();
//            if (me.getValue() == surname)
//                System.out.println("Surname: " + me.getValue() +
//                        "Phone number: " + me.getKey());
//        }
//    }
}