package view.management.paymentrequest.paymentrequestlist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class PaymentRequestListController {

    @FXML
    private TableColumn<?, ?> dateTimeCol;

    @FXML
    private TableColumn<?, ?> orderIdCol;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tableCol;

    @FXML
    private TableColumn<?, ?> totalCol;

    @FXML
    private TableColumn<?, ?> totalCol11;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void cancelOnAction(ActionEvent event) {

    }

    @FXML
    void manageOnAction(ActionEvent event) {

    }

}
