import java.util.EventListener;

public interface ToolbarListener extends EventListener {

    void clearButtonEventOccured(ToolbarEvent tbe);
    void readFromFileEventOccured(ToolbarEvent tbe);
}
