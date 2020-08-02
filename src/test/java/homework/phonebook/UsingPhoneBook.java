package homework.phonebook;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingPhoneBook {

    PhoneBook one = new PhoneBook("111");
    PhoneBook two = new PhoneBook("222");
    PhoneBook three = new PhoneBook("333");

    Map<PhoneBook, String> subscriber = new HashMap<>();

    @Test
    public void add() {

        subscriber.put(one, "Абрамов");
        subscriber.put(two, "Абрамов");
        subscriber.put(three, "Иванов");
        subscriber.put(new PhoneBook("444"), "Иванов");

        System.out.println(subscriber);
    }

//    @Test
//    public void gett() {
//        System.out.println(PhoneBook.);
//
//        Set entrySet = subscriber.entrySet();
//        Iterator it = entrySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry me = (Map.Entry) it.next();
//            if (me.getValue() == surname)
////                System.out.println(subscriber);
//                System.out.println("Surname: " + me.getValue() +
//                        "Phone number: " + me.getKey());
//        }

//    @Test
//    public void getttt(){
//        System.out.println(subscriber.("Абрамов"));
//    }
//


}

