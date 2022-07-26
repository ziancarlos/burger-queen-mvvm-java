package view.management.permission.permissiondetail;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class PermissionDetailController {

    @FXML
    private TableColumn<?, ?> descriptionCol;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private ListView<?> lv;

    @FXML
    private Text permissionNameText;

    @FXML
    private TableView<?> tablePermission;

    @FXML
    private TableColumn<?, ?> titleCol;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}
