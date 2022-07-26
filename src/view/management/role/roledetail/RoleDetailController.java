package view.management.role.roledetail;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class RoleDetailController {

    @FXML
    private ListView<?> lv;

    @FXML
    private TableColumn<?, ?> permissionIdCol;

    @FXML
    private TableColumn<?, ?> permissionNameCol;

    @FXML
    private TableColumn<?, ?> permissionPageCol;

    @FXML
    private Text roleNameText;

    @FXML
    private TableView<?> tablePermission;

    @FXML
    private TableView<?> tableUser;

    @FXML
    private TableColumn<?, ?> userEmailCol;

    @FXML
    private TableColumn<?, ?> userFullNameCol;

    @FXML
    private TableColumn<?, ?> userIdCol;

    @FXML
    void backOnAction(MouseEvent event) {

    }

}
