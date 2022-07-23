package view.management.purchasing.purchasinglist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class PurchasingListController {

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> purchasingDateCol;

    @FXML
    private TableColumn<?, ?> supplierNameCol;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> totalAmountCol;

    @FXML
    void addOnAction(ActionEvent event) {

    }

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void detailOnAction(ActionEvent event) {

    }

}
