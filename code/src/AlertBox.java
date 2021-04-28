import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String message){

        Stage window2 = new Stage();

        window2.initModality(Modality.APPLICATION_MODAL);
        window2.setTitle("AlertBox");
        window2.setMinWidth(250);
        window2.setMinHeight(200);

        Label lbalt = new Label();
        lbalt.setText(message);
        lbalt.setLayoutX(20);
        lbalt.setLayoutY(20);

        Button btnaltclose = new Button();
        btnaltclose.setText("Close");
        btnaltclose.setLayoutX(150);
        btnaltclose.setLayoutY(120);
        btnaltclose.setOnAction(e -> window2.close());

        Pane layout = new Pane();
        layout.getChildren().addAll(btnaltclose,lbalt);

        Scene  scene = new Scene(layout);
        window2.setScene(scene);
        window2.showAndWait();

    }

}
