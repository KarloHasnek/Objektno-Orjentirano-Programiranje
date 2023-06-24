package login;

import java.util.EventObject;

public class LoginPanelEvent extends EventObject{

    // Atributi LoginPanelEvent-a
    private String username;
    private String password;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public LoginPanelEvent(Object source, String username, String password) {
        super(source);
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
