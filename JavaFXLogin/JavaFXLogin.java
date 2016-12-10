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

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Junior
 */
public class JavaFXLogin extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       try {
           //set stage and scene
           Parent root = FXMLLoader.load(getClass().getResource("/javafxlogin/Login.fxml"));
           Scene scene = new Scene(root, 600, 400);
           primaryStage.getIcons().add(new Image("/javafxlogin/icon0.jpg"));
           primaryStage.setScene(scene);
           primaryStage.show();
           
           
       }
       catch(Exception e) {
           
           e.printStackTrace();
       }
    }

   
    //launch application
    public static void main(String[] args) {
        launch(args);
    }
    
}
