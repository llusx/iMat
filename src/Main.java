import Controllers.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by latiif on 2/1/17.
 */
public class Main extends Application{
	public static void main(String[] args) throws ItemAddedException {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("iMat");

		Parent root = new ShopView();

		Scene mainScene= new Scene(root);

		primaryStage.setMinHeight(710);
		//primaryStage.setMinWidth(1200);

		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

	private static void showError(Thread thread, Throwable throwable){

		if (throwable instanceof ItemAddedException) {
			System.out.println(throwable.toString());
		}
	}
}
