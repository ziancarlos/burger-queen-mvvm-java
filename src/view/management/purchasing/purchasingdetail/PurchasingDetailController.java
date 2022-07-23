package view.management.purchasing.purchasingdetail;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.input.MouseEvent;

public class PurchasingDetailController {

    @FXML
    private TreeTableColumn<?, ?> idCol;

    @FXML
    private ListView<?> lv;

    @FXML
    private TreeTableColumn<?, ?> nameCol;

    @FXML
    private TreeTableColumn<?, ?> quantityCol;

    @FXML
    private TreeTableView<?> table;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}
