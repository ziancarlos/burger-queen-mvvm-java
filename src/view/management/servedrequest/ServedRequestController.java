package view.management.servedrequest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class ServedRequestController {

    @FXML
    private TableColumn<?, ?> orderIdCol;

    @FXML
    private TableColumn<?, ?> orderedItemsCol;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tableCol;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void completedOnAction(ActionEvent event) {

    }

    @FXML
    void viewOnAction(ActionEvent event) {

    }

}
