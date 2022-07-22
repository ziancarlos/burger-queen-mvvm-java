package view.management.servedrequest.servedrequestlist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class ServedRequestListController {

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
    void detailOnAction(ActionEvent event) {

    }

}
