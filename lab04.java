import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lab04 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Lab 04 Solution");

        //Creating layout gridpane
        GridPane myGrid = new GridPane();
        myGrid.setAlignment(Pos.CENTER);
        myGrid.setHgap(10);
        myGrid.setVgap(10);
        myGrid.setPadding(new Insets(25, 25, 25, 25));

        //Title
        Text sceneTitle = new Text("Welcome");

        //Labels
        Label lbUserName = new Label("Username:");
        Label lbPassword = new Label("Password:");
        Label lbFullName = new Label("Full Name:");
        Label lbEMail = new Label("E-Mail:");
        Label lbPhoneNumber = new Label("Phone #:");
        Label lbDateOfBirth = new Label("Date of Birth:");

        //Inputs
        TextField txUserName = new TextField();
        PasswordField psPassword = new PasswordField();
        TextField txFullName = new TextField();
        TextField txEMail = new TextField();
        TextField txPhoneNumber = new TextField();
		txPhoneNumber.setPromptText("Phone #");
        DatePicker dpDateOfBirth = new DatePicker();
		Button btnRegister = new Button();
		btnRegister.setText("Register");


        //Add the components onto the myGrid pane
        myGrid.add(sceneTitle, 0,0,2,1);
        myGrid.add(lbUserName, 0, 1);
        myGrid.add(txUserName, 1, 1);

        myGrid.add(lbPassword, 0, 2);
        myGrid.add(psPassword, 1, 2);

        myGrid.add(lbFullName, 0, 3);
        myGrid.add(txFullName, 1, 3);

        myGrid.add(lbEMail, 0, 4);
        myGrid.add(txEMail, 1, 4);

        myGrid.add(lbPhoneNumber, 0, 5);
        myGrid.add(txPhoneNumber, 1, 5);

        myGrid.add(lbDateOfBirth, 0, 6);
        myGrid.add(dpDateOfBirth, 1, 6);
		
		btnRegister.setOnAction(new EventHandler<ActionEvent>() {
			@Override public void handle(ActionEvent e) {
				System.out.println(txUserName.getText());
				System.out.println(psPassword.getText());
				System.out.println(txFullName.getText());
				System.out.println(txEMail.getText());
			}
		});
		
		myGrid.add(btnRegister, 0, 7);

        //Creating myScene with custom layout
        Scene myScene = new Scene(myGrid, 640, 480);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}