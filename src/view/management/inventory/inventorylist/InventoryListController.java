package view.management.inventory.inventorylist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class InventoryListController {

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

    @FXML
    void detailOnAction(ActionEvent event) {

    }

}
