package gmo;

import java.io.IOException;

import gmo.ui.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * A GUI for Gmo using FXML.
 */
public class Main extends Application {

    private final Gmo gmo = new Gmo();

    /**
     * Starts the application.
     *
     * @param stage The stage to start the application on.
     */
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            fxmlLoader.<MainWindow>getController().setGmo(gmo);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
