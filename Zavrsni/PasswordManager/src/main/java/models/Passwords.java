package models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Passwords implements Serializable {

    private Map<String, Map<String,String>> passwords;

    public Passwords() {
        this.passwords = new HashMap<>();
    }

    public Map<String, Map<String,String>> getPasswords() {
        return passwords;
    }

    public void setPasswords(Map<String, Map<String,String>> passwords) {
        this.passwords = passwords;
    }


    public void addPasswordToMap(String website, Map<String, String> credentialsForWebsite) {
        passwords.put(website, credentialsForWebsite);
    }

    @Override
    public String toString() {
        return "Passwords{" + "passwords=" + passwords + '}';
    }
}
