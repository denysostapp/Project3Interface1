package part3;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
public class CustomControl extends HBox {
    private Label label;
    private Button button;
    private EventHandler eventHandler;

    public CustomControl(String name, EventHandler eventHandler) {
        this.eventHandler = eventHandler;
        label = new Label(name);
        button = new Button("Click me");
        button.setOnAction(event -> this.eventHandler.handleEvent(name));
        this.getChildren().addAll(label, button);
    }
}
