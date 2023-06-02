package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sudoku.buildlogic.SudokuBuildLogic;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.userinterface.UserInterfaceImpl;

import java.io.IOException;

public class SudokuAppilcation extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage stage) throws Exception {
      uiImpl = new UserInterfaceImpl(stage);
      try {
          SudokuBuildLogic.build(uiImpl);
      } catch (IOException e) {
          e.printStackTrace();
          throw e;

        }
    }

    public static void main(String[] args) {
        launch();
    }
}