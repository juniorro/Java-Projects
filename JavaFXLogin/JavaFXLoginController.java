/**
* The  program implements a JavaFX application that
* simply asks a user to log in with a username and
* a password. Once logged in, a welcome window welcomes
* the user
*
* @author  Roland Junior Toussaint
* @version 1.0
* @since   12/07/2016
*/

package javafxlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Junior
 */
public class JavaFXLoginController {


    // Main variables

    @FXML
    private PasswordField btnpassword;

    @FXML
    private Label errormsg;

    //username
    private final String usernameinput = "username";

    //password
    private final String passwordinput = "password";

    public void CheckLogin(ActionEvent event) throws Exception {

        //check username and password
        if (btnpassword.getText().equals(usernameinput) && btnpassword.getText().equals(passwordinput)){

           errormsg.setText("Log in successfully");

      //if username and password are correct, show welcome scene
      try {
           Stage primaryStage = new Stage();
           Parent root = FXMLLoader.load(getClass().getResource("/javafxlogin/Home.fxml"));
           Scene scene = new Scene(root, 600, 400);
           primaryStage.setScene(scene);
           primaryStage.getIcons().add(new Image("/javafxlogin/icon0.jpg"));
           primaryStage.show();


       }
       catch(Exception e) {

           e.printStackTrace();
       }
        }
        //else display log in failed
        else {

            errormsg.setText("Log in failed. Please try again.");
        }



}
}
