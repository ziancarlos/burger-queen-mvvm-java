package view.management.inventory.inventorydetail;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class InventoryDetailController {

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private ListView<?> lv;

    @FXML
    private TableColumn<?, ?> nameCol1;

    @FXML
    private TableColumn<?, ?> purchaseDateCol;

    @FXML
    private TableColumn<?, ?> quantityCol;

    @FXML
    private TableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}
