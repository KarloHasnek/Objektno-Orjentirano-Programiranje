package login;

import java.util.EventListener;

public interface LoginListener extends EventListener {

    void loginEventOccured(LoginPanelEvent event);

}
