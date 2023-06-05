import java.util.EventObject;

public class ToolbarEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    private boolean clearClicked;
    private boolean readClicked;
    public ToolbarEvent(Object source) {
        super(source);
        this.clearClicked = false;
        this.readClicked = false;
    }

    public boolean isClearClicked() {
        return clearClicked;
    }

    public void setClearClicked(boolean clearClicked) {
        this.clearClicked = clearClicked;
    }

    public boolean isReadClicked() {
        return readClicked;
    }

    public void setReadClicked(boolean readClicked) {
        this.readClicked = readClicked;
    }


}
