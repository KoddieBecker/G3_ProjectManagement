package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class Controller implements Initializable {

    Task task = new Task();
    Worker manny = new Worker(6);

//    ArrayList<Worker>

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        System.out.println(task);


    }

}
