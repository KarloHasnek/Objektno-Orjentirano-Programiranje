package zadatak6.controller;

import zadatak6.model.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class AUXCLS {

    public static TreeSet<User> mailbox = new TreeSet<>();
    public static LinkedHashMap<String, String> inbox = new LinkedHashMap<>();


    public static boolean addUser(User user) {
        inbox.put(user.getMail(), "");
        boolean flag = mailbox.add(user);

        return flag;
    }

    public static void printUsers() {
        for (User user : mailbox) {
            System.out.println(user);
        }
    }

    public static void addMailToInbox(String user, String mail) {
        String mails = inbox.get(user);
        mails += mail + "\n";
        inbox.replace(user, mails);
    }

    public static void printAllMail(){
        for (String mail : inbox.keySet()) {
            System.out.println(mail + ":");
            System.out.println(inbox.get(mail));
        }
    }
}
